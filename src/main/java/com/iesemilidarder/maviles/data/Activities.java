package com.iesemilidarder.maviles.data;

import com.iesemilidarder.maviles.apiservices.ProductType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.iesemilidarder.maviles.apiservices.ProductType.getProductType;

public class Activities extends Product {
    public static HashMap act;

    // atributos

    private Integer id;
    private String name;
    private String place;
    private Double price;
    private String duration;
    private String description;


        // Constructor

    public Activities(int id, String name, String place,  String description)
    {
        this.id = id;
        this.name = name;
        this.description = description;

    }

    public Activities(int i) {
        super();
    }


    //  getters y setters


    public static HashMap getAct() {
        return act;
    }

    public static void setAct(HashMap act) {
        Activities.act = act;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPlace() {
        return place;
    }

    @Override
    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
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

    public static List<String> getActivities() {

            // Lista de actividades


            List<String> act = new ArrayList<String>();

            act.add("Escalada");
            act.add("Buceo");
            act.add("Surf");
            act.add("Pescar");



            return act;
        }






}

