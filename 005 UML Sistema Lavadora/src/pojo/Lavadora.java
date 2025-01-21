package pojo;

public class Lavadora {
    private int capacidad;
    private String modelo;
    private String puerta;
    private String programaLavado;
    private boolean enLavado;
    private int cargaActual;

    public Lavadora(int capacidad, String modelo) {
        this.capacidad = capacidad;
        this.modelo = modelo;
        this.puerta = "cerrada";
        this.enLavado = false;
        this.cargaActual = 0;
    }

    public void abrirPuerta() {
        if (enLavado) {
            System.out.println("Tontico durante el lavado no se puede abrir la puerta");
        } else if ("cerrada".equals(puerta)) {
            puerta = "abierta";
            System.out.println("Puerta abierta");
        } else {
            System.out.println("Tontico la puerta ya está abierta");
        }
    }

    public void cargar(int kilos) {
        if (!"cerrada".equals(puerta)) {
            if (kilos <= capacidad) {
                cargaActual = kilos;
                System.out.println("Cargados " + kilos + " kg.");
            } else {
                System.out.println("Carga excedida. Capacidad máxima: " + capacidad + " kg");
            }
        } else {
            System.out.println("Tienes que abrir la puerta tontico");
        }
    }

    public void programarLavado(String programa) {
        programaLavado = programa;
        System.out.println("Lavado programado: " + programa);
    }

    public void iniciarLavado() {
        if (cargaActual > 0) {
            enLavado = true;
            puerta = "cerrada";
            System.out.println("Iniciando programa de lavado: " + programaLavado);
            terminarLavado();
        } else {
            System.out.println("No se puede iniciar el lavado no la has cargado");
        }
    }

    private void terminarLavado() {
        System.out.println("Lavado en curso...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        enLavado = false;
        System.out.println("Lavado finalizado.");
    }
}
