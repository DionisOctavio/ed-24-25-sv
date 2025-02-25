package pojo;

public class Rectangulo extends Poligono {

    private Segmento segmento1, segmento2, segmento3, segmento4 ;

    public Rectangulo(String nombre, int numeroSegmentos ) {

        super(nombre, numeroSegmentos);

        if (validarSegmentos(segmento1, segmento2, segmento3, segmento4)) {

            this.segmento1 = segmento1;
            this.segmento2 = segmento2;
            this.segmento3 = segmento3;
            this.segmento4 = segmento4;

            agregarSegmento(segmento1);
            agregarSegmento(segmento2);
            agregarSegmento(segmento3);
            agregarSegmento(segmento4);

        } else {
            System.out.println("Segmento repetido o Medida de segmento invalida");
        }

    }

    private boolean validarSegmentos(Segmento s1, Segmento s2, Segmento s3, Segmento s4) {
        boolean valid1 = s1.getPunto1().equals(s2.getPunto1()) || s1.getPunto1().equals(s2.getPunto2()) ||
                s1.getPunto2().equals(s2.getPunto1()) || s1.getPunto2().equals(s2.getPunto2());

        boolean valid2 = s2.getPunto1().equals(s3.getPunto1()) || s2.getPunto1().equals(s3.getPunto2()) ||
                s2.getPunto2().equals(s3.getPunto1()) || s2.getPunto2().equals(s3.getPunto2());

        boolean valid3 = s3.getPunto1().equals(s4.getPunto1()) || s3.getPunto1().equals(s4.getPunto2()) ||
                s3.getPunto2().equals(s4.getPunto1()) || s3.getPunto2().equals(s4.getPunto2());

        boolean valid4 = s4.getPunto1().equals(s1.getPunto1()) || s4.getPunto1().equals(s1.getPunto2()) ||
                s4.getPunto2().equals(s1.getPunto1()) || s4.getPunto2().equals(s1.getPunto2());

        return valid1 && valid2 && valid3 && valid4;
    }

    @Override
    public void imprimirPoligono() {
        super.imprimirPoligono();
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "segmento1=" + segmento1 +
                ", segmento2=" + segmento2 +
                ", segmento3=" + segmento3 +
                ", segmento4=" + segmento4 +
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

    public Segmento getSegmento4() {
        return segmento4;
    }

    public void setSegmento4(Segmento segmento4) {
        this.segmento4 = segmento4;
    }
}
