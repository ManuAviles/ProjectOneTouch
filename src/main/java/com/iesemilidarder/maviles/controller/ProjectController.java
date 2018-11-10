package com.iesemilidarder.maviles.controller;

import com.iesemilidarder.maviles.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {


    @RequestMapping("/getProduct")
    public List<String> getProduct() {
        List<String> items = Data.getProduct();
        return items;
    }
}

