package com.tutorial.springboot.controller;


import com.tutorial.springboot.daoimpl.TravelImpl;
import com.tutorial.springboot.model.Travel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class TravelDetailsController {

    @Autowired
    private TravelImpl travelImpl;

    // Retrieves list of travel information
    @GetMapping
    public HashMap<Integer, Travel> getAllTravelDetails() {
        return travelImpl.getTravelData();

    }

    // Retrives Travel information based on id
    @GetMapping(value = "/{id}")
    public Travel getTravelDetailsById(@PathVariable("id") int id) {
        return travelImpl.getTravelData().get(id);
    }
}
