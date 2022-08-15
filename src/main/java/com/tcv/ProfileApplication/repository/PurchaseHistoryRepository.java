package com.tcv.ProfileApplication.repository;

import com.tcv.ProfileApplication.model.PurchaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory, Integer> {

}
