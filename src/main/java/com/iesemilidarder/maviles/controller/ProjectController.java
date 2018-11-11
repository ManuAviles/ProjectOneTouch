package com.iesemilidarder.maviles.controller;


import com.iesemilidarder.maviles.Data;
import com.iesemilidarder.maviles.apiservices.ProductType;
import com.iesemilidarder.maviles.data.Activities;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @RequestMapping("/getProduct")
    public List<Data> getProduct() {
        List<Data> items = Data.getProduct();
        return items;
    }

    @RequestMapping("/getProductType")
    public List<Activities> getProductType() {
     List<Activities> items = ProductType.getProductType();
        return items;
}

@RequestMapping(method = RequestMethod.GET, path = "Product/{id}")
public List<Data> getProduct(Model mode, @PathVariable("id") int id){

    List<Data> items = Data.getProduct();
        return items;
}



}

