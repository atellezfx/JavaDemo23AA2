package mx.utel.poo.hilos;

public abstract class Empleado extends Thread {

    private final int HORAS_LABORABLES = 4;
    protected final Granero granero = new Granero();

    public Empleado(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for( int i = 0; i < HORAS_LABORABLES; i++ ) trabajar();
        System.out.printf("### %s terminó de trabajar\n", getName());
    }

    protected abstract void trabajar();

}
