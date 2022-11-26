package mx.utel.poo.arreglos;

public class VarArgs {

    public static void main(String[] args) {
        VarArgs prog = new VarArgs();
        prog.imprimeNombres("Emmanuel", "Guillermo", "Osvaldo", "Xavier", "Alejandro");
    }

    private void imprimeNombres(String ... nombres) {
        System.out.println("Imprimiendo nombres: ");
        for (String cad : nombres) {
            System.out.printf("\t * %s \n", cad);
        }
        System.out.println("===========================");
    }

}
