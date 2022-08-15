package com.tcv.ProfileApplication.service;

import com.tcv.ProfileApplication.model.Pet;
import com.tcv.ProfileApplication.model.PurchaseHistory;
import com.tcv.ProfileApplication.model.User;
import com.tcv.ProfileApplication.repository.PetRepository;
import com.tcv.ProfileApplication.repository.PurchaseHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PurchaseHistoryService {

    private final PurchaseHistoryRepository purchaseHistoryRepository;
    private final PetRepository petRepository;

    public PurchaseHistory savePurchaseHistory(User user, Integer petId){
        return purchaseHistoryRepository.save(PurchaseHistory.builder().user(user).pet(petRepository.findById(petId).get()).build());
    }
    public void updateStock(Integer petId){
        petRepository.decrementStock(petId);
    }

}
