package com.tcv.ProfileApplication.repository;

import com.tcv.ProfileApplication.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {

}
