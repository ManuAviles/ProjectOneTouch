package com.iesemilidarder.maviles.apiservices;

import com.iesemilidarder.maviles.data.Activities;

import java.util.ArrayList;
import java.util.List;

public class ProductType {


    // Lista de los tipos de productos

    public static List<Activities> getProductType() {


            List<Activities> Type = new ArrayList<>();

            Type.add(new Activities(1, "Gastronomia", "Barcelona", "Comida de todos los lugares del mundo"));
            Type.add(new Activities(2, "Ocio", "New York", "Todo tipo de actividades"));
            Type.add(new Activities(3, "Hoteles", "Madrid", "Habitaciones, comidas y actividades de hoteles"));


        return Type;

    }


}
