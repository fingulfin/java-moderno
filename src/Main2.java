import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {

        // Type inference
        var nombres=new ArrayList<String>();

        //Gracias a los metodos estatics en interfaces a partir de Java 8 esto es posible
         var frutas= Set.of("naranja", "platano", "fresa");
         var planetas= List.of("Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno");

         frutas.forEach(fruta-> System.out.println(fruta));
        System.out.println();
         planetas.forEach(planeta-> System.out.println(planeta));
    }
}
