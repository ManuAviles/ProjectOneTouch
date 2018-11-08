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

    public static List<String> getCountries() {


        List<String> country = new ArrayList<>();

        country.add("España");
        country.add("Portugal");
        country.add("Francia");

        return country;
    }




    private static List<String> products = new ArrayList<>();


    public static List<String> getProducts(){
        doInit();

        return products;
    }

    private static void doInit() {

        for ( String a : Data.getCountries()){

                System.out.println("" +a+ "<br/>");

            for ( String b : Data.getActivities()){

                System.out.println(b);

            }
        }

    }
}

