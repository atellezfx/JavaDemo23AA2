package mx.utel.poo.herencia;

public class Programa {

    public static void main(String[] args) {
        // No es posible crear objetos de clases abstractas
        // Vagon v = new Vagon("Grava");
        VagonCerrado vc1 = new VagonCerrado("grava");
//        System.out.println(vc1);
        VagonCisterna vt1 = new VagonCisterna("diesel");
//        System.out.println(vt1);
        VagonAutorack va1 = new VagonAutorack("Audi A8 x4");
//        System.out.println(va1);

        Maquina m = new Maquina("El Olivo");
        Tren t1 = new Tren( m );
        t1.conectarVagones(vc1, vt1, va1);
        System.out.println(t1);
    }

}
