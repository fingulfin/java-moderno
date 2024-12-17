package unidad5;

import records.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreams {
    public static void main(String[] args) {
List<String> frutas=List.of("manzana","durazno", "guayaba","platano","mango", "higo", "fresa","coco" );
        List<Dish> menu = List.of(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );

        /*************************************************************
        Ejercicion 1. Generar un Stream y ordenar por nombre de platillo
         Explicacion: En este caso el metodo sorted recibe La interfe Funcional Comparator,
         cuyo metodo abstracto recibe dos argumentos, que son los objetos a comprar, en este caso
         comparamos por nombre, pero se puede hacer por cualqueir otro miembro de la clase
         Referencia: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#sorted(java.util.Comparator)
         */

        var frutasOrdenadas =frutas.stream().sorted((f1,f2)->f1.compareTo(f2)).collect(Collectors.toList());
        frutasOrdenadas.forEach(System.out::println);
     var ordenados1=  menu.stream().sorted((p1,p2)->p1.name().compareTo(p2.name())).collect(Collectors.toList());
        System.out.println("Ejercicio 1");
     ordenados1.forEach(plato-> System.out.println(plato));
/* Ejercicio 2;  Ordenar por numero de calorias. El metodo natural de compare es en ORDEN ASCENDENTE,
* para sobreescribi el metodo natural aplicamos al inal el metodo reversed(), aqui en este caso nos da
* de las calorias en ORDEN DESCENDENTE.  */
        System.out.println("Ejercicio 2");
      var menuPorCalorias=    menu.stream().sorted((a1,a2)->a1.calories().compareTo(a2.calories())).collect(Collectors.toList()).reversed();
    menuPorCalorias.forEach(me-> System.out.println(me));

    /* Ejercicio 3. Obtener lo platillos que son vegetarinoso
    https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate)

     */
        System.out.println("EJECICIO 3-----------------------");
        var platosVeganos=menu.stream().filter(plato->plato.vegetarian()).collect(Collectors.toList());
        platosVeganos.forEach(p-> System.out.println(p));
    }
}
