package com.iesemilidarder.maviles.controller;


import com.iesemilidarder.maviles.data.Activities;
import com.iesemilidarder.maviles.data.Product;
import com.iesemilidarder.maviles.data.ProductType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectController {

    // Para sacar los productos

    @RequestMapping(method = RequestMethod.GET, path = "/getProduct/{place}")
    public List<Activities> ProductType(@PathVariable String place) {
        return ProductType.getProductType();
    }


    // Para sacar los tipos de productos

    @RequestMapping("/getProductType")
    public List<Activities> getProductType() {
        List<Activities> items = ProductType.getProductType();
        return items;
    }

    // Para sacar un producto con una id especifica
/*
    @RequestMapping(method = RequestMethod.GET, path = "/Product/{id}")
    public List<Activities> getProduct(Model mode, @PathVariable("id") int id) {
        List<Activities> items = ProductType.ProductType();
        return ProductType.ProductType().get(id);
    }
    */
}

