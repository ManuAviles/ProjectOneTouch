package com.iesemilidarder.maviles.data;

import com.iesemilidarder.maviles.Data;

import java.util.ArrayList;
import java.util.List;

public class Country extends Product {

    public static List<Data> count;
    private Integer code;
    private String name;
    private String capital;
    private ArrayList<Country> countries;



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



        // Lista de actividades


        public ArrayList getCcuntries () {

            countries = new ArrayList<Country>();

            List<String> count = new ArrayList<String>();

            count.add("España");
            count.add("Portugal");
            count.add("Francia");
            count.add("Alemania");


            return countries;
        }

        public String setName ( int i){
            return null;
        }


        public int getName ( int i){

            return i;

    }
}
