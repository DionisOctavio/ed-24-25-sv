import java.util.Random;
import java.util.Scanner;
public class cienNumeros {

    public static int[] jusepe = new int [100];
    public static boolean pepe = false;

    public static void main(String[] args) {

        int contador = 0;
        Random aleatorio = new Random();
        Scanner leer = new Scanner(System.in);

        do {
            jusepe[contador] = aleatorio.nextInt(1000);
            contador = contador + 1;


        }while(1<100);

        x = leer.nextInt();
    }
}
