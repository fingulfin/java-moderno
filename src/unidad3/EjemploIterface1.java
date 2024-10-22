package unidad3;

public interface EjemploIterface1 {

    int edad=20;

    public  static int CalcularEdadDias(){
        return 20*365;
    }
  public void  calcular();
    void calcular2();

    //el siguiente es incorrecto, no puede ser prrivate un metodo.
    //private calcular3();

    // El siguiente es correcto, una interfae puede contener metodos privados siempe y cuando tengan cuerpo
    //o implementacion.
    private void calcularr4(){

    }
}
