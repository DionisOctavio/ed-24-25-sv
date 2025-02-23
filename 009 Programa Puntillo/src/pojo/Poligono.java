package pojo;

import java.util.ArrayList;

public abstract class Poligono {

    private String nombre;
    private int numeroSegmentos;
    private ArrayList<Segmento> segmentos;

    public Poligono(String nombre, int numeroSegmentos) {
        this.nombre = nombre;
        this.numeroSegmentos = numeroSegmentos;
        this.segmentos = new ArrayList<>();
    }

    protected void agregarSegmento(Segmento segmento) {
        this.segmentos.add(segmento);
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "nombre='" + nombre + '\'' +
                ", segmentos=" + segmentos +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroSegmentos() {
        return numeroSegmentos;
    }

    public void setNumeroSegmentos(int numeroSegmentos) {
        this.numeroSegmentos = numeroSegmentos;
    }

    public ArrayList<Segmento> getSegmentos() {
        return segmentos;
    }

    public void setSegmentos(ArrayList<Segmento> segmentos) {
        this.segmentos = segmentos;
    }
}
