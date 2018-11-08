package com.iesemilidarder.maviles.controller;


import com.iesemilidarder.maviles.Data;
import com.iesemilidarder.maviles.data.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {


    @RequestMapping("/getCountries")
    public List<String> getCountries() {
        List<String> items = Data.getCountries();
        return items;
    }

    @RequestMapping("/getActivities")
    public List<String> getActivities() {
        List<String> items = Data.getActivities();
        return items;
    }

    @RequestMapping("/getProducts")
    public List<String> getProducts() {
        List<String> items = Data.getProducts();
        Activities act = new Activities();
        return items;
    }


/*
    @RequestMapping("/getProducts")
    public String getData(@RequestParam(name = "name") String name){

        return  "Name" +Data.getProducts();
    }
*/
}
