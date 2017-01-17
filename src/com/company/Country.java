package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Someone on 03.12.2016.
 */
public enum Country {
    RUSSIA("Россия"), ENGLAND("Англия"), SPAIN("Испания");
    private String countryName;

    public String getCountryName() {
        return countryName;
    }

    Country(String countryName) {
        this.countryName = countryName;
    }
}
