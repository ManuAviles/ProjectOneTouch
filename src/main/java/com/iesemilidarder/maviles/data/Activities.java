package com.iesemilidarder.maviles.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Activities extends Product {
    public static HashMap act;

    // atributos

    private String name;
    private String duration;
    private String description;

    public Activities() {

    }


    //  getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Activities(String name) {
        this.name = name;
    }




        public static List<String> getActivities() {

            // Lista de actividades


            List<String> act = new ArrayList<String>();

            act.add("Escalada");
            act.add("Buceo");
            act.add("Surf");
            act.add("Pescar");



            return act;
        }



    public void setName(Activities activities) {
    }

    public void setName(HashMap act) {
    }
}

