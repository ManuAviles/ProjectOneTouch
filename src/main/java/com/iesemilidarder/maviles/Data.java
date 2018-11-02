package com.iesemilidarder.maviles;

import com.iesemilidarder.maviles.data.Activities;
import com.iesemilidarder.maviles.data.Countries;
import com.iesemilidarder.maviles.data.Country;
import com.iesemilidarder.maviles.data.Products;

import java.util.ArrayList;
import java.util.List;

public class Data {
    
    private static List<Countries> list = new ArrayList<>();
    
    public static List<Countries> getList(){
        doInit();
        return list;
    }

    private static void doInit(){
        if (list.isEmpty()){
            for(int i =0;i<50;i++){
                Country country = new Country();
                country.setName("Name"+i);
                list.add(country);
            }
        }
    }

    private static List<Products> listproducts = new ArrayList<>();

    public static List<Products> getListproducts() {
        doInit2();
        return listproducts;
    }

    private static void doInit2(){
        if (listproducts.isEmpty()){
            for(int i =0;i<50;i++){
                Activities activities = new Activities();
                activities.setName("Name"+i);
                activities.setCountry("Name"+i);
                listproducts.add(activities);
            }
        }
    }



}
