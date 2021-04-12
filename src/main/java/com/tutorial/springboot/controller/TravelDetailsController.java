package com.tutorial.springboot.controller;


import com.tutorial.springboot.daoimpl.TravelService;
import com.tutorial.springboot.model.Travel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TravelDetailsController {

    @Autowired
    private TravelService travelService;

    // Retrieves list of travel information
    @GetMapping
    public List<Travel> getAllTravelDetails() {
        return travelService.getAllTravelData();

    }

    // Retrives Travel information based on id
    @GetMapping(value = "/{id}")
    public Travel getTravelDetailsById(@PathVariable("id") int id) {
        return travelService.getTravelDetailsById(id);
    }

    @PostMapping(value = "/travel")
    public Travel createTraveller(@RequestBody Travel travel) {

        return travelService.saveTraveller(travel);
    }

    @PutMapping(value = "/travel/{id}")
    public Travel updateTraveller(@RequestBody Travel travel, @PathVariable("id") int id) {
        return travelService.updateTraveller(travel, id);
    }
}
