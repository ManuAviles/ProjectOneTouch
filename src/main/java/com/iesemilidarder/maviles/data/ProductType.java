package com.iesemilidarder.maviles.data;

import com.iesemilidarder.maviles.data.Activities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductType  extends Product{


    // Lista de los tipos de productos

    public static List<Activities> getProductType() {

         List<Activities> Type = new ArrayList<>();

        Type.add(new Activities(1, "Gastronomia", "España", "Comida de todos los lugares del mundo"));
        Type.add(new Activities(2, "Ocio", "Francia", "Todo tipo de actividades"));
        Type.add(new Activities(3, "Hoteles", "Alemania", "Habitaciones, comidas y actividades de hoteles"));


        for (Activities a : Type) {

            return Type;
        }

        return Type;


    }



}

