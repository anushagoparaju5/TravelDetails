package com.tutorial.springboot.repository;

import com.tutorial.springboot.model.Travel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TravelRepository extends JpaRepository<Travel, Integer> {
    Travel findById(int id);
}
