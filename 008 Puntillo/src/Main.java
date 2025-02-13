import pojo.Punto;
import pojo.Punto3d;

public class Main {
    public static void main(String[] args) {

    Punto P1 = new Punto(0,0);

    P1.setX(2);

    P1.setY(2);

    System.out.println("Punto: " + P1.getX() + " " + P1.getY());

    Punto3d P2 = new Punto3d(0,0,0);

    P2.setX(4);
    P2.setY(5);
    P2.setZ(6);

    System.out.println("Punto: " + P2.getX() + " " + P2.getY() + " " + P2.getZ());q2a2awa1º

    }
}