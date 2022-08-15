package com.tcv.ProfileApplication.service;

import com.tcv.ProfileApplication.model.Event;
import com.tcv.ProfileApplication.model.Pet;
import com.tcv.ProfileApplication.repository.EventRepository;
import com.tcv.ProfileApplication.repository.PetRepository;
import com.tcv.ProfileApplication.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PetService {
    private final PetRepository petRepository;
    private final EventRepository eventRepository;

    public Pet savePet(Pet pet) {
        return petRepository.save(pet);
    }
    public Integer getPetStock(Integer petId){
        Optional<Pet> petOptional = petRepository.findById(petId);
        if(petOptional.isPresent() && petOptional.get().getStock() > 0){
            return petOptional.get().getStock();
        }
        eventRepository.save(Event.builder().event("Stock 0 for pet: " + petOptional.get().getPetType()).build());
        return 0;
    }

}
