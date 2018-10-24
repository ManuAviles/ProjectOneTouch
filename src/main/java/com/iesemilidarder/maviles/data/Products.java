package com.iesemilidarder.maviles.data;

public abstract class Products {

private String country;
private Double Price;
private Integer npersons;

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
