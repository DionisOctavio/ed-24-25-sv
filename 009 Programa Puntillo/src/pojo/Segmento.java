package pojo;

public class Segmento {

    private Punto2D punto1;
    private Punto2D punto2;

    public Segmento(Punto2D punto1, Punto2D punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Punto2D getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto2D punto1) {
        this.punto1 = punto1;
    }

    public Punto2D getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto2D punto2) {
        this.punto2 = punto2;
    }
}
