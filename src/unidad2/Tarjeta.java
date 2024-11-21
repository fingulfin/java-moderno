package unidad2;

public abstract class Tarjeta {
    public String nombreTarjeta;
    public int numeroTarjeta;
    public abstract float depositar(float deposito);
    public abstract  float retirar(float retiro);
}
