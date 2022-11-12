package mx.utel.poo.objetos;

public class Programa {

    public static void main(String[] args) {
        Foco f1 = new Foco(800, Modelo.INCANDESCENTE);
//        System.out.println(f1);

        Bateria bat1 = new Bateria(1.2f, 800, false);
//        System.out.println(bat1);

        Lampara lamp1 = new Lampara("Steren", f1);
        lamp1.colocarBateria( bat1 );

        System.out.println(lamp1);

    }

}
