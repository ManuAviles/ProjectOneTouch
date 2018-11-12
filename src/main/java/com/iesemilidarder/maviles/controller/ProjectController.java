package com.iesemilidarder.maviles.controller;

import com.iesemilidarder.maviles.data.Product;
import com.iesemilidarder.maviles.data.ProductType;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectController {

    // Para sacar los productos por id

    @RequestMapping("/getProduct/{id}")
    public Product ProductType(@PathVariable String id) {

        return ProductType.getProductType(id);
    }


    // Para sacar todos los productos

    @RequestMapping("/getAllProduct")
    public List<Product> getAllProducts() {
        return ProductType.getAllProducts();
    }

    // Para sacar un producto por país

    @RequestMapping("/getProductArea/{place}")
    public Product ProductArea(@PathVariable String place) {

        return ProductType.getProductArea(place);
    }


}

