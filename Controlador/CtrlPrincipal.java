package Controlador;

import java.util.Scanner;

import Vista.Login;
import Modelo.ModeloUsuarios;

public class CtrlPrincipal{
    private Scanner sc = new Scanner(System.in);
    private Login login = new Login(sc);
    private ModeloUsuarios modeloUsuarios = new ModeloUsuarios();


    public CtrlPrincipal(){
        login.show();        
        if(modeloUsuarios.login(login.getUser(), login.getPass())){
            //Login correcto
            login.setMsg("Login correcto");
        }else{
            //Login incorrecto
            login.setMsg("Login incorrecto");
        }
    }
}