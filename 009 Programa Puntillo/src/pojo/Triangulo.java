package pojo;

public class Triangulo extends Poligono {

    private Segmento segmento1, segmento2, segmento3;

    public Triangulo(String nombre, int numeroSegmentos, Segmento segmento1, Segmento segmento2, Segmento segmento3) {
        super(nombre, numeroSegmentos);

        if (validarSegmentos(segmento1, segmento2, segmento3)) {

            this.segmento1 = segmento1;
            this.segmento2 = segmento2;
            this.segmento3 = segmento3;

            agregarSegmento(segmento1);
            agregarSegmento(segmento2);
            agregarSegmento(segmento3);

        }else {
            System.out.println("Uno de los Puntos del Segmento esta repetido");
        }
    }

    @Override
    public void imprimirPoligono() {
        super.imprimirPoligono();
    }

    private boolean validarSegmentos(Segmento s1, Segmento s2, Segmento s3) {
        boolean valid1 = s1.getPunto1().equals(s2.getPunto1()) || s1.getPunto1().equals(s2.getPunto2()) ||
                s1.getPunto2().equals(s2.getPunto1()) || s1.getPunto2().equals(s2.getPunto2());

        boolean valid2 = s2.getPunto1().equals(s3.getPunto1()) || s2.getPunto1().equals(s3.getPunto2()) ||
                s2.getPunto2().equals(s3.getPunto1()) || s2.getPunto2().equals(s3.getPunto2());

        boolean valid3 = s3.getPunto1().equals(s1.getPunto1()) || s3.getPunto1().equals(s1.getPunto2()) ||
                s3.getPunto2().equals(s1.getPunto1()) || s3.getPunto2().equals(s1.getPunto2());

        return valid1 && valid2 && valid3;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "segmento1=" + segmento1 +
                ", segmento2=" + segmento2 +
                ", segmento3=" + segmento3 +
                '}';
    }

    public Segmento getSegmento1() {
        return segmento1;
    }

    public void setSegmento1(Segmento segmento1) {
        this.segmento1 = segmento1;
    }

    public Segmento getSegmento2() {
        return segmento2;
    }

    public void setSegmento2(Segmento segmento2) {
        this.segmento2 = segmento2;
    }

    public Segmento getSegmento3() {
        return segmento3;
    }

    public void setSegmento3(Segmento segmento3) {
        this.segmento3 = segmento3;
    }
}
