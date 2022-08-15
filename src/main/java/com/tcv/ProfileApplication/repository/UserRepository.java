package com.tcv.ProfileApplication.repository;

import com.tcv.ProfileApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
