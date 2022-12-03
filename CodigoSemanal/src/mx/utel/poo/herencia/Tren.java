package mx.utel.poo.herencia;

import java.util.List;

public class Tren {

    private final Maquina MAQUINA;
    private List<Vagon> vagones;

    public Tren(Maquina mqn) {
        this.MAQUINA = mqn;
    }

    public void conectarVagones( Vagon ... vs ) {
        this.vagones = List.of( vs );
    }

    private double volumenTotal() {
        // Ocupando programación imperativa (estructurada)
//        double total = 0;
//        for( Vagon v : vagones ) {
//            total += v.calcularVolumen();
//        }
//        return total;

        // Ocupando programación funcional (declarativa)
        return vagones.stream().mapToDouble( v -> v.calcularVolumen() ).sum();
    }

    @Override
    public String toString() {
        String cadena = "Tren %s con %d vagones y un volúmen total de %,.2f m3";
        return cadena.formatted( MAQUINA, vagones.size(), volumenTotal() );
    }
}
