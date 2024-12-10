package unidad3.aninimasthreads;

public class TestAnonimasThreads {

    public static void main(String[] args) {
        //EJEMPLO THREADS
        System.out.println("EJEMPLO CLASES ANONIMAS CON THREADS");
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hola Thread");
            }
        });

        t1.start();

  //veresion lambda
  Thread t2=new Thread(()-> System.out.println("Hola mundo Thread"));
  t2.start();

Comestible comestible=new Comestible() {
    @Override
    public void analizarComestible(String nombreObjeto) {
        System.out.println("VAMOS A COMER: "+nombreObjeto);
    }
};

comestible.analizarComestible("naranja");


//version Lambda
        Comestible comestible1=(nombre)-> System.out.println(nombre);
        comestible1.analizarComestible("Grocella");



    }
}
