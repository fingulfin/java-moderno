package unidad4;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {
       //Predicate sirve para evaluar una condicion con un argumrnto T el metodo test que comparar regresa
       //true o fale, segun el rsultado de la comparacion
       // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/function/Predicate.html
        Predicate<Long> esGrande=valor->valor>9000;
        System.out.println("Testear:"+esGrande.test(2000l));

        Predicate<String> EsNula=(String cadena)->cadena==null;
        Predicate<String> EsNula2=cadena->cadena==null;

        //En Function<T,R> el primer parametro es el tipo de entrada y R el resulatd: Ejemplo
        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/function/Function.html
        Function<String, String>  probar = x->x="Hola "+x;
        var resulta=probar.apply("Juan Calos");
        System.out.println(resulta);

        //Otro las de Fucntion, recibe un sting y lo transforma en Integer
        Function<String, Integer>  tranformar= mensa->mensa.length();
        System.out.println("Tamano:"+tranformar.apply("Juan Carlos"));
        //Version method reference
        Function<String, Integer> transfomar2=String::length;
        System.out.println("Tamano del string"+transfomar2.apply("Juan Carlos"));

        //Otra co method reference
        //Solo lambda
        Predicate<String> p0=valor->valor.isEmpty();

        //Method reference
        Predicate<String> p1=String::isEmpty;


        //Muchas de las Interfaces funcionales acepta composicion de funciones, por medio de metodos default,
        // aceptan una Interface previamenente ejecutda por ejemplo.
        Function<String, String> removerLasAs=str->str.replace("a","");
        Function<String, String> mayusculas= String::toUpperCase;
        //Hay dos metodos y podemos aplicarlos de forma indistinta
        //Ver documentacion:
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/function/Function.html

        var entrada="abcd";
        //Metodo A
       var res1= removerLasAs.andThen(mayusculas).apply(entrada);
        System.out.println(res1);
        //Metodo B

        var res2=mayusculas.compose(removerLasAs).apply(entrada);
        System.out.println(res2);
        //Ambas dan como salida: "BCD"

    }

}
