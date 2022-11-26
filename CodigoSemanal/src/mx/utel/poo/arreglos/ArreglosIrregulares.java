package mx.utel.poo.arreglos;

public class ArreglosIrregulares {

    public static void main(String[] args) {
        ArreglosIrregulares prog = new ArreglosIrregulares();
        String[][] personajes = prog.crearArreglo();
        prog.imprimeArreglo( personajes );
    }

    private void imprimeArreglo(String[][] personajes) {
        for (int i = 0; i < personajes.length; i++) {
            System.out.printf("### PERSONAJES DE %s \n", familia(i));
            for (int j = 0; j < personajes[i].length; j++) {
                System.out.printf("\t* %s \n", personajes[i][j]);
            }
        }
    }

    private String familia(int i) {
        return switch( i ) {
            case 0 -> "HANNA-BARBERA";
            case 1 -> "DISNEY";
            case 2 -> "THE SIMPSONS";
            default -> "INDEFINIDO";
        };
    }

    private String[][] crearArreglo() {
        String[][] arreglo = new String[3][];
        final int HANNAB = 0, DISNEY = 1, SIMPSONS = 2;
        // PERSONAJES DE HANNA-BARBERA
        arreglo[HANNAB] = new String[4];
        arreglo[HANNAB][0] = "Oso Yogi";
        arreglo[HANNAB][1] = "Cometín Sónico";
        arreglo[HANNAB][2] = "Capitán Cavernícola";
        arreglo[HANNAB][3] = "Pedro Picapiedra";
        // PERSONAJES DE DISNEY
        arreglo[DISNEY] = new String[6];
        arreglo[DISNEY][0] = "Mickey Mouse";
        arreglo[DISNEY][1] = "Minnie Mouse";
        arreglo[DISNEY][2] = "Blanca Nieves";
        arreglo[DISNEY][3] = "Ariel";
        arreglo[DISNEY][4] = "Donald Duck";
        arreglo[DISNEY][5] = "Jazmín";
        // PERSONAS DE SIMPSONS
        arreglo[SIMPSONS] = new String[5];
        arreglo[SIMPSONS][0] = "Homero Simpson";
        arreglo[SIMPSONS][1] = "Bart Simpson";
        arreglo[SIMPSONS][2] = "Maggie Simpson";
        arreglo[SIMPSONS][3] = "Lisa Simpson";
        arreglo[SIMPSONS][4] = "Apu Nahasapeemapetilon";
        return arreglo;
    }

}
