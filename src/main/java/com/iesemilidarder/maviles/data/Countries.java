package com.iesemilidarder.maviles.data;


import java.util.List;

public  class Countries {

    private Integer code;
    private String name;
    private String capital;

    public Countries(String name, Integer code, String capital) {
        this.code = code;
        this.name = name;
        this.capital = capital;
    }

    public Countries() {

    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
