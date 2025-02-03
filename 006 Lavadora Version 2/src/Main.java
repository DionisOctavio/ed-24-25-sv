import pojo.Lavadora;
import pojo.Prenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Lavadora> lavadoras = new ArrayList<>();
        List<Prenda> prendas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        lavadoras.add(new Lavadora(10, "Rápido"));
        lavadoras.add(new Lavadora(16, "Ecológico"));
        lavadoras.add(new Lavadora(10, "Intensivo"));

        prendas.add(new Prenda("Camisa", "ROJO", 120, "SUCIA"));
        prendas.add(new Prenda("Pantalón", "AZUL", 150, "SUCIA"));
        prendas.add(new Prenda("Falda", "BLANCO", 100, "SUCIA"));

        boolean salir = false;
        while (!salir) {
            System.out.println("Menú Principal");
            System.out.println("1. Ver estado de las lavadoras");
            System.out.println("2. Añadir nueva prenda");
            System.out.println("3. Introducir prenda en lavadora");
            System.out.println("4. Iniciar lavado");
            System.out.println("5. Finalizar lavado");
            System.out.println("6. Retirar ropa");
            System.out.println("7. Apagar lavadora");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    for (Lavadora l : lavadoras) {
                        System.out.println(l.getEstado());
                    }
                    break;
                case 2:
                    System.out.print("Ingrese tipo de prenda: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Ingrese color: ");
                    String color = scanner.nextLine();
                    System.out.print("Ingrese peso (g): ");
                    int peso = scanner.nextInt();
                    prendas.add(new Prenda(tipo, color, peso, "SUCIA"));
                    System.out.println("Prenda añadida.");
                    break;
                case 3:
                    System.out.println("Seleccione una lavadora (1-" + lavadoras.size() + "):");
                    int lavIdx = scanner.nextInt() - 1;
                    System.out.println("Seleccione una prenda (1-" + prendas.size() + "):");
                    int prendaIdx = scanner.nextInt() - 1;
                    System.out.println(lavadoras.get(lavIdx).abrirPuerta());
                    System.out.println(lavadoras.get(lavIdx).introducirPrenda(prendas.get(prendaIdx)));
                    System.out.println(lavadoras.get(lavIdx).cerrarPuerta());
                    break;
                case 4:
                    System.out.println("Seleccione una lavadora para iniciar el lavado:");
                    lavIdx = scanner.nextInt() - 1;
                    System.out.println(lavadoras.get(lavIdx).encender());
                    System.out.println(lavadoras.get(lavIdx).abrirCajetil());
                    System.out.print("Ingrese cantidad de detergente: ");
                    int cantidadDetergente = scanner.nextInt();
                    System.out.println(lavadoras.get(lavIdx).introducirDetergente(cantidadDetergente));
                    System.out.println(lavadoras.get(lavIdx).cerrarCajetil());
                    System.out.println(lavadoras.get(lavIdx).iniciarLavado());
                    break;
                case 5:
                    System.out.println("Seleccione una lavadora para finalizar el lavado:");
                    lavIdx = scanner.nextInt() - 1;
                    System.out.println(lavadoras.get(lavIdx).finalizarLavado());
                    break;
                case 6:
                    System.out.println("Seleccione una lavadora para retirar la ropa:");
                    lavIdx = scanner.nextInt() - 1;
                    System.out.println(lavadoras.get(lavIdx).abrirPuerta());
                    System.out.println(lavadoras.get(lavIdx).retirarRopa());
                    System.out.println(lavadoras.get(lavIdx).cerrarPuerta());
                    break;
                case 7:
                    System.out.println("Seleccione una lavadora para apagar:");
                    lavIdx = scanner.nextInt() - 1;
                    System.out.println(lavadoras.get(lavIdx).apagar());
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        scanner.close();
    }
}