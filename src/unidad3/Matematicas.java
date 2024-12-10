package unidad3;

public class Matematicas {

    int x;
    int y;
    MiInterface miInterface;
  //  OperarNumeroInterface operarNumeroInterface;

    public Matematicas() {
    }

    public Matematicas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public  int sumarDosNumeros(MiInterface miInterface){
        return  miInterface.sumar(x,y);
    }
    public  int duplicarNumero(OperarNumeroInterface operarNumeroInterface){
        return operarNumeroInterface.operarNumero(x);
    }
}
