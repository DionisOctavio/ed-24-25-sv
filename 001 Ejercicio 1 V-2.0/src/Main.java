// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int[] generarNumeros = new int[5];
        int contador = 0; 

        System.out.println("Buenas, CO");

        while (contador < 5) { // Mientras
            int num = r.nextInt(100); 

            boolean esta = false;

            
            for (int i = 0; i < contador; i++) { //SI
                if (generarNumeros[i] == num) {
                    esta = true; 
                    break;
                }
            }

        
            if (!esta) {
                generarNumeros[contador] = num; 
                System.out.println("H = " + num);
                contador++; 
            }
        }
    }
}
