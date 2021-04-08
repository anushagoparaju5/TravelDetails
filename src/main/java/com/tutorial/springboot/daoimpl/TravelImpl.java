package com.tutorial.springboot.daoimpl;

import com.tutorial.springboot.model.Travel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class TravelImpl {
    public HashMap<Integer, Travel> getTravelData() {

        HashMap<Integer, Travel> map = new HashMap<>();

        map.put(1, travelValues(1, "anusha", "usa"));
        map.put(2, travelValues(2, "yash", "usa"));

        return map;
    }

    public Travel travelValues(int id, String travellerName, String country) {
        Travel travel = new Travel();
        travel.setId(id);
        travel.setTravellerName(travellerName);
        travel.setCountry(country);
        return travel;
    }
}
