package unidad5;

import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        //Predicate sirve para evaluar una condicion con un argumrnto T el metodo test que comparar regresa
        //true o fale, segun el rsultado de la comparacion
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/function/Predicate.html
        Predicate<Long> esGrande= valor->valor>9000;
    }
}
