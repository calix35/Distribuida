package Controlador;

import java.util.Scanner;

import Vista.Login;
import Modelo.ModeloUsuarios;
import DataObjects.Usuario;

public class CtrlPrincipal{
    private Scanner sc = new Scanner(System.in);
    private Login login = new Login(sc);
    private ModeloUsuarios modeloUsuarios = new ModeloUsuarios();


    public CtrlPrincipal(){
        do{
            login.show();        
            Usuario usuario = modeloUsuarios.login(login.getUser(), login.getPass());
            if(usuario!=null){
                switch(usuario.getTipo()){
                    case 1://Administrador
                        new CtrlAdministrador(sc, modeloUsuarios);
                        break;
                    case 2://Vendedor
                        break;
                }
                //Login correcto
                //login.setMsg("Login correcto");
            }else{
                //Login incorrecto
                login.setMsg("Login incorrecto");
            }
        }while(true);
    }
}