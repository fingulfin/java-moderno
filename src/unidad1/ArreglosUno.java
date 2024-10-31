package unidad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArreglosUno {
    public static void main(String[] args) {
        int[] numeros = {8,2,6,3,-4,5,0};
       String[]nombres={"Juan", "Pedro", "Zacarias", "Armando", "Gerardo", "Roberto"};

       Trabajador[]trabajadores={new Trabajador("Juan",2000),new Trabajador("Arturo", 1500), new Trabajador("Zacarias", 5500)};
     //  Arrays.sort(trabajadores,Comparator.comparing(Trabajador::getSueldo).reversed());
      /* Arrays.sort(trabajadores,(c1,c2)->
        //   c1.getNombre().compareTo(c2.getNombre())
       );
       */

       Arrays.sort(trabajadores,Comparator.comparing(Trabajador::getNombre).reversed());
       List<Trabajador> workers=new ArrayList<>();
     workers=  Arrays.asList(new Trabajador("Juan",2000),new Trabajador("Arturo", 1500), new Trabajador("Zacarias", 5500) );

Trabajador trabajador=new Trabajador("Juan",90000);
workers.forEach(traba-> System.out.println(traba));
//workers.forEach(System.out::println);
        System.out.println();
final List<Trabajador> sorteados=workers.stream().filter(trabajador1 -> trabajador1.getSueldo()>2000).sorted().collect(Collectors.toList());

sorteados.forEach(trabajador1 -> System.out.println(trabajador1));







        List<String> frutas=new ArrayList<>();

   //  Arrays.sort(, Comparator.reverseOrder());
     for(Trabajador t: trabajadores){
        // System.out.println(t);
     }



        }




}
