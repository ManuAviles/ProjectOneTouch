package com.iesemilidarder.maviles.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductType  extends Product{


        // Lista de los productos

         static List<Product> productos = new ArrayList<Product>(Arrays.asList(

        new Activities("1", "Gastronomia", "España", "Comida de todos los lugares del mundo," ),
        new Activities("2", "Ocio", "Francia", "Todo tipo de actividades"),
        new Activities("3", "Hoteles", "Alemania", "Habitaciones, comidas y actividades de hoteles"),
        new Activities("4", "Viajes", "Japon", "Todo tipo de comodidades mientras vuelas a tu destino")));

         // Método de filtrar por ID

    public static Product getProductType(String id){

        return productos.stream().filter(t ->t.getId().equals(id)).findFirst().get();
    }

        // Método para sacar todos los productos

    public static List<Product> getAllProducts(){

        return productos;
    }

        // Método de filtrar por País

    public static Product getProductArea(String place){

        return productos.stream().filter(t ->t.getPlace().equals(place)).findFirst().get();
    }
}

