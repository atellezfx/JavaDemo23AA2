package mx.utel.poo.hilos;

public class MaestroTostador extends Empleado {

    public final static int GRANOS_CAFE_TOSTADO = 500;

    public MaestroTostador(String nombre) {
        super(nombre);
    }
    
    public MaestroTostador crearObjeto(String nombre) {
        return null;
    }

    @Override
    protected void trabajar() {
        try {
            Thread.sleep(1500); // Simula que el Maestro Tostador inicia 90 min después.
            System.out.printf("> %s esperando cosecha. \n", getName());
            granero.retirar(GRANOS_CAFE_TOSTADO);
            Thread.sleep(1000); // Simula el tiempo de trabajo: 60 mins.
            System.out.printf("> %s ha tostado %d grs de café \t Granero: %d grs \n",
                    getName(), GRANOS_CAFE_TOSTADO, granero.totalAlmacenado());
        } catch (InterruptedException ex) {
            System.out.println("El trabajo del Maestro Tostador fue interrumpido");
            ex.printStackTrace();
        }
    }

}
