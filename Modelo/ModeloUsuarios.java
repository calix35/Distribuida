package Modelo;

public class ModeloUsuarios{

    //ArrayList - Crear una lista de objetos (object, int, float, ....)

    public ModeloUsuarios(){

    }

    public boolean login(String user, String pass){    
        if(user.equals("alan") && pass.equals("1234"))
            return true;
        return false;
    }

}