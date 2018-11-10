package com.iesemilidarder.maviles.data;

public abstract class Product {

    protected String company;
    protected Double Price;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public void setName() {
    }
}
