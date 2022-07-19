package p2;

public abstract class Matriculas {

    protected String nombre;
    protected double tarifa;

    public abstract void establecerNombre();
    public abstract void establecerTarifa();
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
