package com.tcv.ProfileApplication.repository;

import com.tcv.ProfileApplication.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PetRepository extends JpaRepository<Pet,Integer> {

    // asa se face decrementarea atomica
    @Modifying
    @Query("UPDATE Pet t set t.stock = t.stock - 1 WHERE t.id = :petId")
    void decrementStock(Integer petId);

}
