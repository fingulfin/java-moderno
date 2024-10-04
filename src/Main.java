import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Eres biendnido...!");
        Sayable s;

    s=nombre-> {
        return "hola como estas" + nombre;
        };

    //Invocamos
        System.out.println(s.say("Juan Carlos"));
        System.out.println("ORDENAR.............");
     Sumable suma=(x,y)-> (x+y);
        System.out.println(suma.add(4,5));
        List<String> palabras= Arrays.asList("Tienes Cara de perro","Juan", "gera mi amor");



        // Las lambdas hacen mas concisas las clases anonimas internas(que surgen de manera
        //narutal en las imlementaciones de interfaces

        /*
        Collections.sort(palabras, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });
         */

        //El ejemplo anterior con las lambda
        Collections.sort(palabras,(s1,s2)-> Integer.compare(s1.length(),s2.length()));

        for(String p:palabras){
            System.out.println(p);
        }

        //Otro ejemplo con lambdas
      new Sumable(){

          @Override
          public int add(int a, int b) {
              return 0;
          }
      };


       Sumable suma2=(a,b)->{

            System.out.println("aciendo suma");
            return  a+b;
        };
        System.out.println(suma2.add(4,5));

        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        friends.forEach(new Consumer<String>() {
            public void accept(final String name) {
                System.out.println(name);
            }
        });

        //gatone
        friends.forEach((nombre)-> System.out.println("conejo:"+nombre));

        friends.forEach(nombre-> System.out.println("hola"));
        friends.stream().map(nombre->nombre.toUpperCase())
        .forEach(nombre-> System.out.println(nombre));
        System.out.println();

        friends.stream().map(nombre->nombre.length()).forEach(contar-> System.out.println(contar));
        System.out.println();
      List<String> nuevos=  friends.stream().filter(nombre->nombre.startsWith("N")).collect(Collectors.toList());

      nuevos.forEach(nombre-> System.out.println(nombre));



    }//Termina metodo main




}//Termina clase Main

interface Sayable{
    public String say(String name);
}

interface Sumable{
    int add(int a,int b);

}