package mx.utel.poo.evaluacion3;

public class RacingCar extends Thread {

    // La clase Thread define el atributo name
    // private String piloto;
    private int numero;
    private static int lugar;

    public RacingCar(String piloto) {
        super( piloto );
        numero = (int) (Math.random() * 9) + 1;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.printf("El carro #%d ha recorrido %d vueltas\n", numero, i);
                Thread.sleep(1000);
            }
            System.out.printf("### %s llegó en %d lugar\n", getName(), obtenerLugar());
        } catch(InterruptedException ex) {
            System.out.println("El automóvil interrumpió su carrera");
            ex.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return String.format("Carro: #%d, \t Piloto: %s", numero, getName());
    }

    private synchronized int obtenerLugar() {
        return ++lugar;
    }

}
