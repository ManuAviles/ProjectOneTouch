package com.iesemilidarder.maviles;

import com.iesemilidarder.maviles.data.*;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<String> getActivities() {


        List<String> activity = new ArrayList<>();

        activity.add("Escalada ");
        activity.add("Buceo");
        activity.add("Surf");

        return activity;
    }

    public static List<Countries> getCountries() {


        List<Countries> lista = new ArrayList<>();
        Countries countries = new Countries("España",1,"Madrid");
        Countries countries2 = new Countries("Portugal",2,"Lisboa");
        Countries countries3 = new Countries("Francia",3,"París");

        lista.add(countries);
        lista.add(countries2);
        lista.add(countries3);

        return lista;
    }



    public static List<String> items = new ArrayList<>();


    public static List<String> getProducts(){
        doInit();

        return items;
    }

    private static void doInit() {


        for ( Countries a : Data.getCountries()){



            for ( String b : Data.getActivities()){


            }
        }

    }

}

