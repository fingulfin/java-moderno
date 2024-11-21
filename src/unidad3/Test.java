package unidad3;

public class Test {
    public static void main(String[] args) {
        System.out.println("Programacion funcional, INTRO");
Thread t1=new Thread(new Runnable() {
    @Override
    public void run() {
        System.out.println("Hola mundo");
    }
});

t1.start();

Thread t2=new Thread(()->{
    System.out.println("Hola Therad 2");
});

t2.start();


 Matematicas matematicas1=new Matematicas(4,5);
 //Implementamos TRADICIONAL:
 var sumar1=matematicas1.sumarDosNumeros(new MiInterface() {
     @Override
     public int sumar(int x, int y) {
         return x+y;
     }
 });

 //Imprimimos el rsultado
 System.out.println(sumar1);
 // Version funcional

Matematicas matematicas2=new Matematicas(6,6);
//Implementamos
var sumar2=matematicas2.sumarDosNumeros((x,y)-> x+y);

//Con un solo argumento
        var duplicar=matematicas2.duplicarNumero(x->x*2);
        System.out.println("Duplicar numero "+duplicar);

//Imprimimos el resultado
        System.out.println(sumar2);

        //Probar Interface basica
    //Version tradicional
    UsarInterfazBasica usarInterfazBasica=new UsarInterfazBasica();
    usarInterfazBasica.usarMetodo(new MiInterfaceBasica() {
        @Override
        public void hola() {
            System.out.println("Hola mundo tradicional");
        }
    });

    // Version funcional
        UsarInterfazBasica usarInterfazBasica1=new UsarInterfazBasica();
        usarInterfazBasica1.usarMetodo(()-> System.out.println("Hola mundo funcional"));

    }
}
