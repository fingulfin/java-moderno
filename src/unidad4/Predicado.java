package unidad4;

@FunctionalInterface
public interface Predicado {

    public void hola(String s);
    default  void hola2(){
        System.out.println("Hola mundo 2");
    }

    public static void hola3(){
        System.out.println("Hola mundo 3");
    }
}
