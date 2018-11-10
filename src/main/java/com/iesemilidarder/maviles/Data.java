package com.iesemilidarder.maviles;

import com.iesemilidarder.maviles.data.Activities;
import com.iesemilidarder.maviles.data.Country;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Data {

    public  static List<String> getProduct(){

        List<String> lista = new ArrayList<String>();


           for ( int i = 0; i < Country.getCountries().size(); i++) {


               Country country = new Country();
               country.setName(Country.count);

               for (int x = 0; x < Activities.getActivities().size(); x++) {

                   Activities activities = new Activities();
                   activities.setName(Activities.act);
               }
           }

        return lista;
    }

    }

