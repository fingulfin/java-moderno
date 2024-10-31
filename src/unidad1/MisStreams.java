package unidad1;

import java.util.Arrays;
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



    }
}
