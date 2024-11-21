package unidad1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MisStreams {

    public static void main(String[] args) {
        //Generamos un Stream basico
        List<String> frutas= Arrays.asList( "manzana", "durazno", "platano", "fresa", "zapote","mamey");
  // Vamos a invcar uno de los metodos de Strea,
        System.out.println(frutas.stream().count());

     //Algunos metodos de Stream son intermedios, es decir nos devuelen otro Stream
         List<String> frutas2=frutas.stream().limit(2).collect(Collectors.toList());

 //Los metodos intermedios son acumulables o stackeables, hasta que se invoca el metodo teminal
        frutas.stream().limit(4)
                        .sorted()
                        .collect(Collectors.toList());
List<Trabajador> trabajadores=Arrays.asList(new Trabajador("Juan,",2000), new Trabajador("Gera", 4000));

  var frutas3= frutas.stream().sorted((s1,s2)->s1.length()-s2.length()).collect(Collectors.toList());
  frutas3.forEach(fruta-> System.out.println(fruta));
  var frutas4=   frutas.stream().filter(fruta->fruta.length()<6).collect(Collectors.toList());

  trabajadores.stream().sorted(Comparator.comparing(Trabajador::getNombre));

        System.out.println("Fruta con menos d 6 letras");
frutas4.forEach(fruta->{
    System.out.println("Fruta con una menos de 6 letras");
    System.out.println(fruta);

});
    }
}
