package com.tutorial.springboot.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.Column;


@Entity
@Table(name = "Travel")
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column(name = "traveller_name")
    public String travellerName;

    @Column
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
