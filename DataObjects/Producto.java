package DataObjects;

public class Producto{

    private String id;
    private String nombre;
    private int existencias;
    private double costo;
    

    public Producto(String id, String nombre, int existencias, double costo){
        this.id = id;
        this.nombre = nombre;        
        this.existencias = existencias;
        this.costo = costo;
    }
}