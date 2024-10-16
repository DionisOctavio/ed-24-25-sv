public class cienNumeros {

    public static int[] jusepe = new int [100];
    public static boolean pepe = false;

    public static void main(String[] args) {

    int contador = 0;

    for (int i = 0; i < 100; i++) {
        jusepe[i] = contador;
    }

    for (int j = 0; j < 100; j++) {
        System.out.println(jusepe[j]);
    }


    }
}