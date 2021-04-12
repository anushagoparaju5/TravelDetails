package com.tutorial.springboot.controller;


import com.tutorial.springboot.daoimpl.TravelImpl;
import com.tutorial.springboot.model.Travel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TravelDetailsController {

    @Autowired
    private TravelImpl travelImpl;

    // Retrieves list of travel information
    @GetMapping
    public List<Travel> getAllTravelDetails() {
        return travelImpl.getAllTravelData();

    }

    // Retrives Travel information based on id
    @GetMapping(value = "/{id}")
    public Travel getTravelDetailsById(@PathVariable("id") int id) {
        return travelImpl.getTravelDetailsById(id);
    }

    @PostMapping(value = "/createtravel")
    public Travel createTraveller(@RequestBody Travel travel) {

        return travelImpl.saveTraveller(travel);
    }

    @PutMapping(value = "/updatetravel/{id}")
    public Travel updateTraveller(@RequestBody Travel travel, @PathVariable int id) {
        return travelImpl.updateTraveller(travel, id);
    }
}
