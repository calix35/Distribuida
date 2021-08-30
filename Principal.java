import java.util.Scanner;//Objeto para leer datos del teclado

public class Principal{
    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);
        String nombre;
        String apellidos;
        int edad;

        System.out.print("Nombre:");
        nombre = sc.nextLine();
        System.out.print("Apellidos:");
        apellidos = sc.nextLine();
        System.out.print("Edad:");
        edad = sc.nextInt();

        /*
            String - nextLine()
            int - nextInt()
            float - nextFloat()
            double - nextDouble()
        */

        Usuario nuevo = new Usuario(nombre, apellidos, edad);


        System.out.println(nuevo);


    }
}