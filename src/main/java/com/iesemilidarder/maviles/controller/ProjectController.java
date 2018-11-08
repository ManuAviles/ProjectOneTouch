package com.iesemilidarder.maviles.controller;


import com.iesemilidarder.maviles.Data;
import com.iesemilidarder.maviles.data.Countries;
import com.iesemilidarder.maviles.data.Country;
import com.iesemilidarder.maviles.data.ListActivities;
import com.iesemilidarder.maviles.data.Products;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {


    @RequestMapping("/getProducts")
    public List<Data> getData(){
        List<Data> items = Data.getProducts();
        return items;
    }

}
