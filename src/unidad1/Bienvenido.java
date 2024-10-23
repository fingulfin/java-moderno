package unidad1;

import java.util.Scanner;

public class Bienvenido {

    public static void main(String[] args) {
        System.out.println("Homa mundo");
        System.out.println("Introduce una palabra seguida de enter:");
        var in=new Scanner(System.in);
        var palabra=in.next();
        System.out.println("La palabra que escribiste es:"+palabra);

        //Arreglos
        String[] authors = {
                "James Gosling",
                "Bill Joy",
                "Guy Steele",
// agregar mas..
        };


    }
}
