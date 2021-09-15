package Controlador;

import java.util.Scanner;

import Vista.MenuVentas;
import Vista.AltaProductos;
import Modelo.ModeloProductos;

public class CtrlVentas{

    private Scanner sc;
    private ModeloProductos modeloProductos;

    public CtrlVentas(Scanner sc, ModeloProductos modeloProductos) {
        this.sc = sc;
        this.modeloProductos = modeloProductos;
        MenuVentas menuVentas = new MenuVentas(sc);
        do{
            menuVentas.show();
            switch(menuVentas.getOpcion()){
                case 1://Altas de Usuarios
                    AltaProductos alta = new AltaProductos(sc);
                    modeloProductos.alta(alta.getProducto());                                       
                    break;
                case 2://Bajas                    
                    break;
                case 3://Salir
                    break;
                default://Opcion incorrecta
                    menuVentas.setMsg("Opcion Incorrecta");
            }
        }while(menuVentas.getOpcion()!=3);
    }

}