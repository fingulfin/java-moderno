package unidad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArreglosUno {
    public static void main(String[] args) {
        int[] numeros = {8,2,6,3,-4,5,0};
       String[]nombres={"Juan", "Pedro", "Zacarias", "Armando", "Gerardo", "Roberto"};

       Trabajador[]trabajadores={new Trabajador("Juan",2000),new Trabajador("Arturo", 1500), new Trabajador("Zacarias", 5500)};
       Arrays.sort(trabajadores,Comparator.comparing(Trabajador::getSueldo).reversed());

        List<String> frutas=new ArrayList<>();
   //  Arrays.sort(, Comparator.reverseOrder());
     for(Trabajador t: trabajadores){
         System.out.println(t);
     }



        }




}
