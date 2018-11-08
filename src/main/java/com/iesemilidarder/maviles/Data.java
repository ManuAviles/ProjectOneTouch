package com.iesemilidarder.maviles;

import com.iesemilidarder.maviles.data.*;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private  static List<Data> products = new ArrayList<>();


    public static List<Data> getProducts(){
        doInit();

        return products;
    }

    private static void doInit() {

        for ( String a : ListCountries.getCountries()){

                System.out.println(a);

            for ( String b : ListActivities.getActivities()){

                System.out.println(b);

            }
        }

    }
}

