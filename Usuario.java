public class Usuario{
    
    private String nombre;
    private String apellidos;
    private int edad;

    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    /*
        Cuando tengo dos o mas constructores se le conoce como sobrecarga de constructores
    */

    public Usuario(String nombre, String apellidos, int edad){
        this.nombre =  nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Usuario(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = 0;
    }

    /*
        Todos los objetos en Java vienen (heredan) de la clase principal Object
        Object: public String toString()
    */

    // En java se puede sobrecargar metodos

    public String toString() {
        return this.nombre + " " + this.apellidos + " " + this.edad;
    }


}


/*

    Constructor: Inicializar, dar valores iniciales a mi objeto

    Clase: Es la estructura de un objeto (Sirve para definir lo que contiene "atributos" un objeto y lo que puede hacer "metodos")

    Encapsulamiento: Ocultar los detalles de la implementacion, para que no sean accesibles desde otro miembro del programa (getters, setters, private)


*/

/*
    Leer sobre los modificadores de acceso en Java

    public, private, protected, sin modificador

*/
