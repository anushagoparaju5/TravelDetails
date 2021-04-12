package com.tutorial.springboot.daoimpl;

import com.tutorial.springboot.model.Travel;

import java.util.List;

public interface TravelImplRepository {

    List<Travel> getAllTravelData();

    Travel getTravelDetailsById(int id);

    Travel saveTraveller(Travel travel);

    Travel updateTraveller(Travel travel, int id);
}
