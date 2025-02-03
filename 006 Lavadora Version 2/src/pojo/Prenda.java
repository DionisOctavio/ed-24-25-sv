package pojo;

public class Prenda {

    private String tipo;
    private String color;
    private int peso;
    private String nivelSuciedad;

    // Constructor
    public Prenda(String tipo, String color, int peso, String nivelSuciedad) {
        this.nivelSuciedad = nivelSuciedad;
        this.peso = peso;
        this.color = color;
        this.tipo = tipo;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerColor() {
        return color;
    }

    public int obtenerPeso() {
        return peso;
    }

    public String obtenerNivelSuciedad() {
        return nivelSuciedad;
    }

    public void setSuciedad(String nivelNuevo) {
        this.nivelSuciedad = nivelNuevo;
    }
}
