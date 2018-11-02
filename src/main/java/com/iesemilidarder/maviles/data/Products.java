package com.iesemilidarder.maviles.data;

public abstract class Products {

protected String country;
protected String name;
protected Double Price;
protected Integer npersons;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Integer getNpersons() {
        return npersons;
    }

    public void setNpersons(Integer npersons) {
        this.npersons = npersons;
    }
}
