package com.iesemilidarder.maviles;

import com.iesemilidarder.maviles.data.Activities;
import com.iesemilidarder.maviles.data.Country;


import java.util.ArrayList;
import java.util.List;


public class Data {





    public static List<Data> getProduct() {

        List<Country> list = new ArrayList<>();
        List<Activities> list2 = new ArrayList<>();

        List<Data> total = new ArrayList<>();


        for ( int i = 0; i < list.size(); i++) {


            Country country = new Country();
            country.setName(i);
            total.add((Data) list);


            for (int x = 0; x < list2.size(); x++) {

                Activities activities = new Activities(i);
                 activities.setName(x);

                total.add((Data) list2);

            }


        }
        return total;
    }


}

