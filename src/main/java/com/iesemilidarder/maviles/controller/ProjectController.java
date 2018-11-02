package com.iesemilidarder.maviles.controller;


import com.iesemilidarder.maviles.Data;
import com.iesemilidarder.maviles.data.Countries;
import com.iesemilidarder.maviles.data.Products;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {


    @RequestMapping("/getCountries")
    public List<Countries> getCountries(){
        List<Countries> items = Data.getList();
        return items;
    }

    @RequestMapping("/getActivities")
    public List<Products> getActivities(){
        List<Products> items = Data.getListproducts();
        return items;
    }


}
