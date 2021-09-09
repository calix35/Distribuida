package Controlador;

import java.util.Scanner;

import Vista.MenuAdministrador;
import Vista.AltaUsuarios;
import Modelo.ModeloUsuarios;

public class CtrlAdministrador{

    private Scanner sc;
    private ModeloUsuarios modeloUsuarios;

    public CtrlAdministrador(Scanner sc, ModeloUsuarios modeloUsuarios){
        this.sc = sc;
        this.modeloUsuarios = modeloUsuarios;
        MenuAdministrador menuAdm = new MenuAdministrador(sc);
        do{
            menuAdm.show();
            switch(menuAdm.getOpcion()){
                case 1://Altas de Usuarios
                    AltaUsuarios alta = new AltaUsuarios(sc);
                    modeloUsuarios.alta(alta.getUsuario());                    
                    break;
                case 2://Bajas
                    break;
                case 3://Salir
                    break;
                default://Opcion incorrecta
                    menuAdm.setMsg("Opcion Incorrecta");
            }
        }while(menuAdm.getOpcion()!=3);
    }

}