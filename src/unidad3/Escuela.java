package unidad3;

public class Escuela {
    public static void main(String[] args) {
        //Usamos clases internas anonimas
        Matematicas matematicas=new Matematicas();

        //Tradicional
        int suma1=matematicas.sumarDosNumeros(new MiInterface() {
            @Override
            public int sumar(int x, int y) {
                return x+y;
            }
        });

        //Con Lambdas
        int suma2=matematicas.sumarDosNumeros((a,b)-> a+b);
    }
}
