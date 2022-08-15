package com.tcv.ProfileApplication.facade;

import com.tcv.ProfileApplication.model.Pet;
import com.tcv.ProfileApplication.service.PetService;
import com.tcv.ProfileApplication.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PetFacade {

    private final UserService userService;
    private final PetService petService;

    public Pet savePet(Pet pet, Integer requestAnId) {
        if (!userService.isAdmin(requestAnId))
            return null;
        return petService.savePet(pet);
    }
}
