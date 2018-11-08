package com.iesemilidarder.maviles.data;

import com.iesemilidarder.maviles.Data;

import java.util.ArrayList;
import java.util.List;

public class ListCountries {

    public static List<String> getCountries() {


        List<String> country = new ArrayList<>();

        country.add("España");
        country.add("Portugal");
        country.add("Francia");

        return country;
    }
}
