package unidad3.ejercicios;

public class TestEjercicios {

    public static void main(String[] args) {
        HolaMundoInt mundoint=()-> System.out.println("Hola mundo");
        mundoint.saludar();

        HolaMundoArgumentoInt anInt=x->System.out.println(x);
        anInt.saludar2("hola mundo");

        OperacionesAB ab=( x, y)->x*y;
        OperacionesAB bc=(x,y)->{
            float producto=x*y;
            return  producto;
        };
        System.out.println(ab.producto(4,5));
        System.out.println(bc.producto(4,5));


    }
}
