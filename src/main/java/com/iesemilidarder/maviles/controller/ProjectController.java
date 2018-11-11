package com.iesemilidarder.maviles.controller;


import com.iesemilidarder.maviles.Data;
import com.iesemilidarder.maviles.apiservices.ProductType;
import com.iesemilidarder.maviles.data.Activities;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    // Para sacar los productos (no consigo que me devuelva los datos)

    @RequestMapping("/getProduct")
    public List<Data> getProduct() {
        List<Data> items = Data.getProduct();
        return items;
    }

    // Para sacar los tipos de productos

    @RequestMapping("/getProductType")
    public List<Activities> getProductType() {
     List<Activities> items = ProductType.getProductType();
        return items;
}

    // Para sacar un producto con una id especifica ( Tampoco me devuelve la información)

    @RequestMapping(method = RequestMethod.GET, path = "/Product/{id}")
    public List<Data> getProduct(Model mode, @PathVariable("id") int id){
    List<Data> items = Data.getProduct();
        return items;
}

}

