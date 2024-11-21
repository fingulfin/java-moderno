package unidad1;

import java.util.*;
import java.util.stream.Collectors;

public class ArreglosUno {
    public static void main(String[] args) {

      //Generamos 3 arreglos: dos no mutables y uno mutable
        int[] numeros = {8,2,6,3,-4,5,0};
       String[]nombres={"Juan", "Pedro", "Zacarias", "Armando", "Gerardo", "Roberto"};
       List<String> planetas= Arrays.asList("mercurio", "venus", "tierra", "marte","jupiter", "saturno","urano", "neptuno", "pluton");

       //incovamos sobre los 3 un stream
        System.out.println("-----"+ Arrays.stream(numeros).count());
        System.out.println("-----"+Arrays.stream(nombres).count());
        System.out.println("-----"+planetas.stream().count());




       Trabajador[]trabajadores={new Trabajador("Juan",2000),new Trabajador("Arturo", 1500), new Trabajador("Zacarias", 5500)};



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

String s1="hola";
     String s2="Hola";
  int otro=   s1.compareTo(s2);
        System.out.println(otro);

        }//termina main




}
