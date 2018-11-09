package com.iesemilidarder.maviles.controller;


import com.iesemilidarder.maviles.Data;
import com.iesemilidarder.maviles.data.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {


    @RequestMapping("/getCountries")
    public List<Countries> getCountries() {
        List<Countries> items = Data.getCountries();
        return items;
    }

    @RequestMapping("/getActivities")
    public List<String> getActivities() {
        List<String> items = Data.getActivities();
        return items;

    }

    private static List<Countries> lista = Data.getCountries();
    private static List<String> act = Data.getActivities();

    @RequestMapping("/getProducts")
    public String getProducts(@RequestParam(value = "name") String name) {

        String aux = "";

        for (aux : Data.getCountries()) {
            Countries countries = new Countries();
            countries.setName(name);
            Data.items.add(name);
            return String.valueOf(countries);
        }
        return aux;
    }

/*
    @RequestMapping("/getProducts")
    public List<Data> products(@RequestParam(name="name")) {
        List<String> items = Data.getProducts();
        return items;
*/
/*
    @RequestMapping(value = "/getProducts/{name}", method = RequestMethod.GET)
    public String getProducts(@RequestParam(name = "name") String name) {

        return null;
    }
    */
    }


