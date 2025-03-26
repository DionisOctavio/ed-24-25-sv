public class Main {
    public static void main(String[] args) {

        int suma = 0;

        for (int numero = 2; numero <= 100; numero += 2) {
            suma += numero;
        }

        System.out.println("La suma es " + suma);

    }
}