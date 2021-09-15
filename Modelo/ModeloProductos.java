package Modelo;

import java.util.ArrayList;

import DataObjects.Producto;

public class ModeloProductos{


    private ArrayList<Producto> productos = new ArrayList<Producto>();


    public void alta(Producto producto){
        this.productos.add(producto);
    }

    

}