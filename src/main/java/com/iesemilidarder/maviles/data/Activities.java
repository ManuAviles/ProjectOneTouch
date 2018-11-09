package com.iesemilidarder.maviles.data;

import java.util.ArrayList;
import java.util.List;

public class Activities extends Products {

    private String name;
    private String duration;
    private String Country;

    public Activities(String name){
        this.name = name;
    }

    public String getName(){
        return  name;
    }
}
