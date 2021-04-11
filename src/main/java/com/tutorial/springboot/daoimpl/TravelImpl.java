package com.tutorial.springboot.daoimpl;

import com.tutorial.springboot.model.Travel;
import com.tutorial.springboot.repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class TravelImpl {

    @Autowired
    private TravelRepository travelRepository;

    public List<Travel> getAllTravelData() {
        return travelRepository.findAll();
    }

    public Travel getTravelDetailsById(int id) {
        return travelRepository.findById(id);
    }

}
