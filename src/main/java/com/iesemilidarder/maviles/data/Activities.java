package com.iesemilidarder.maviles.data;

public class Activities extends Product {

    // atributos

    private String id;
    private String name;
    private String place;
    private Double price;
    private String duration;
    private String description;


        // Constructor

    public Activities(String id, String name, String place,  String description)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.place = place;

    }

    //  getters y setters


    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
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


}

