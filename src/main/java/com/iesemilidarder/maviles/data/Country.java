package com.iesemilidarder.maviles.data;

import java.util.ArrayList;
import java.util.List;

public class Country extends Product {

    public static String count;
    private Integer code;
    private String name;
    private String capital;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public static List<String> getCountries() {

        // Lista de actividades


        List<String> count = new ArrayList<String>();

        count.add("España");
        count.add("Portugal");
        count.add("Francia");
        count.add("Alemania");



        return count;
    }

    public void setName(int i) {
    }

    public void setName(Country country) {
    }
}
