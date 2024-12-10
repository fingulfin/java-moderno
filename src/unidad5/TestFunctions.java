package unidad5;

import java.util.function.Function;

public class TestFunctions {
    public static void main(String[] args) {
/*En Function<T,R> el primer parametro es el tipo de entrada y R el resulatd: Ejemplo
      https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/function/Function.html
      */
        Function<String, String> hola=x->x.toUpperCase();

        System.out.println(hola.apply("Hola mundo!"));  




    }
}
