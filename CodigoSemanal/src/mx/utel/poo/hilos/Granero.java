package mx.utel.poo.hilos;

public class Granero {

    private int cafeAlmacenado;

    public synchronized void almacenar( int cantidad ) { // Lo ocupa el Recolector
        cafeAlmacenado += cantidad;
        if( hayCafe() ) notifyAll();
    }

    public synchronized void retirar( int cantidad ) throws InterruptedException { // Lo ocupa el MaestroTostador
        if( !hayCafe() ) Thread.currentThread().wait(); // Este hilo es el MaestroTostador
        else cafeAlmacenado -= cantidad;
    }

    public synchronized boolean hayCafe() {
        return cafeAlmacenado >= MaestroTostador.GRANOS_CAFE_TOSTADO;
    }

    public synchronized int totalAlmacenado() {
        return cafeAlmacenado;
    }

}
