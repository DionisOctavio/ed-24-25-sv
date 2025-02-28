import pojo.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Punto2D P1 = new Punto2D(2, 7);
        Punto2D P2 = new Punto2D(5, 7);
        Punto2D P3 = new Punto2D(4, 4);

        Segmento S1 = new Segmento(P1, P2);
        Segmento S2 = new Segmento(P2, P3);
        Segmento S3 = new Segmento(P3, P1);

        Triangulo TRIANGULO1 = new Triangulo("Triangulo", 3,S1,S2,S3);

        TRIANGULO1.imprimirPoligono();

        Punto2D P4 = new Punto2D(2, 1);
        Punto2D P5 = new Punto2D(6, 1);
        Punto2D P6 = new Punto2D(6, 5);
        Punto2D P7 = new Punto2D(2, 5);

        Segmento S4 = new Segmento(P4, P5);
        Segmento S5 = new Segmento(P5, P6);
        Segmento S6 = new Segmento(P6, P7);
        Segmento S7 = new Segmento(P7, P4);

        Cuadrado CUADRADO1 = new Cuadrado("CUAD1", 4, S4,S5,S6,S7);

        CUADRADO1.imprimirPoligono();

        Punto2D P8 = new Punto2D(2, 8);

    }
}