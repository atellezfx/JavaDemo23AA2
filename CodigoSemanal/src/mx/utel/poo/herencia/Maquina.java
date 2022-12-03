package mx.utel.poo.herencia;

public record Maquina(String nombre) {

    @Override
    public String toString() {
        return nombre;
    }

}
