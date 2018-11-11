package com.iesemilidarder.maviles.controller;


import com.iesemilidarder.maviles.apiservices.ProductType;
import com.iesemilidarder.maviles.data.Activities;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

/*
    @RequestMapping("/getProduct")
    public List<Data> getProduct() {
        List<Data> items = Data.getProduct();
        return items;
    }
*/
    @RequestMapping("/getProduct")
    public List<Activities> getProduct() {
     List<Activities> items = ProductType.getProductType();
        return items;
}


}

