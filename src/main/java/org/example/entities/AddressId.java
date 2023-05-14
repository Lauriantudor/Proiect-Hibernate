package org.example.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class AddressId {
    private String streetName;
    private Integer streetNr;
    private String city;

    public AddressId() {
    }

    public AddressId(String streetName, Integer streetNr, String city) {
        this.streetName = streetName;
        this.streetNr = streetNr;
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getStreetNr() {
        return streetNr;
    }

    public void setStreetNr(Integer streetNr) {
        this.streetNr = streetNr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
