package unidad3.ejercicios;

public abstract   class Matematicas {
      float a;

    public float getA() {
        return a;
    }

    public Matematicas(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    float b;
    public abstract float  miProducto(OperacionesAB operacionesAB);


}
