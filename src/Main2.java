import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {

        // Type inference
        var nombres = new ArrayList<String>();

        //Gracias a los metodos estatics en interfaces a partir de Java 8 esto es posible
        var frutas = Set.of("naranja", "platano", "fresa");
        var planetas = List.of("Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno");

        frutas.forEach(fruta -> System.out.println(fruta));
        System.out.println();
        planetas.forEach(planeta -> System.out.println(planeta));
        //Uso de lambdas para el filtrado de datos
        final List<String> empeizaConM = planetas.stream().filter(nombre -> nombre.startsWith("M"))
                .toList();

    System.out.println("Planetas con M");
        empeizaConM.forEach(nombre -> System.out.println(nombre));
        var  names = List.of("Peter", "Paul", "Mary");


      Runner runner=()-> System.out.println("Hola mundo");
      runner.run();
        Predicate p=(Object o)->o!=null;

        String s=null;
        Predicate pp= Objects::nonNull;
        pp.test(s);

        p.test(s);

    }
    @FunctionalInterface
    public interface Runner {
        public void run();
    }

}
