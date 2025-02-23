import pojo.Poligono;
import pojo.Punto2D;
import pojo.Segmento;
import pojo.Triangulo;

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



    }
}