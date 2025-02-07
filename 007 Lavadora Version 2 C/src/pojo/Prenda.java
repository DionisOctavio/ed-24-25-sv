package pojo;

public class Prenda {
    private String tipo;
    private String color;
    private int peso;
    private String nivelSuciedad;

    public Prenda(String tipo, String color, int peso, String nivelSuciedad) {
        this.tipo = tipo;
        this.color = color;
        this.peso = peso;
        this.nivelSuciedad = nivelSuciedad;
    }

    public String obtenerTipo() { return tipo; }
    public String obtenerColor() { return color; }
    public int obtenerPeso() { return peso; }
    public String obtenerNivelSuciedad() { return nivelSuciedad; }
    public void set_Suciedad(String Nivel_Nuevo) { this.nivelSuciedad = nivelSuciedad; }

    @Override
    public String toString() {
        return tipo + " de color " + color + " (Peso: " + peso + " kg, Suciedad: " + nivelSuciedad + ")";
    }
}

