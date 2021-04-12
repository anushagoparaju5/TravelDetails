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

    public Travel saveTraveller(Travel travel) {
        return travelRepository.save(travel);
    }

    public Travel updateTraveller(Travel travel, int id) {
        Travel updateDetails = travelRepository.findById(id);
        updateDetails.setTravellerName(travel.getTravellerName());
        updateDetails.setCountry(travel.getCountry());
        return updateDetails;
    }

}
