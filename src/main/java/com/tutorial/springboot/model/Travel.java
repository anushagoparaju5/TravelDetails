package com.tutorial.springboot.model;


public class Travel {

    public int id;
    public String travellerName;
    public String country;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Travel{" +
                "id=" + id +
                ", travellerName='" + travellerName + '\'' +
                ", Country='" + country + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTravellerName() {
        return travellerName;
    }

    public void setTravellerName(String travellerName) {
        this.travellerName = travellerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
