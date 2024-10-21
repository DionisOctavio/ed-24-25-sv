import java.util.Formattable;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[] jusepe = new int [100];
    public static boolean pepe = false;

    private static void asignarAleatorio(int Num){
        for(int i = 0; i < jusepe.length; i++){
            jusepe[i] = new Random().nextInt(Num);
        }
    }

    private static void MostrarArray (){
        for(int i = 0; i < jusepe.length; i++){
            System.out.print(jusepe[i] + " ");
        }
    }



    public static void main(String[] args) {

        Random aleatorio = new Random();

        int i =0;
        do {
            jusepe[i] = aleatorio.nextInt(1000);
            i = i+i;
        }while (1<100);


        Scanner numero  = new Scanner(System.in);

        Scanner x = numero;

        x = numero;



        while (true){
            System.out.println("Ingresa un numero: ");
            int num = numero.nextInt();

            if (num <0){
                System.out.println("Numero invalido");
                break;
            }

            if (pepe){
                System.out.println("Esta en el array");
            }else {
                System.out.println("No esta en el array");
            }
        }

    }
}