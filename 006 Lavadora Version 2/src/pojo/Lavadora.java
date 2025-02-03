package pojo;

import java.util.List;
import java.util.ArrayList;

public class Lavadora {

    private String planDeLavado;
    private int capacidad;
    private boolean llena;
    private String estado;
    private int contadorTiempoLavado;
    private String estadoLavado;
    private String puerta;
    private String pantalla;
    private int revolucionesPorMinuto;
    private int temperaturaAgua;
    private String cajetil;
    private int capacidadCajetil;
    private String tamborLavadora;
    private String detergente;
    private boolean enProcesoDeLavado;
    private boolean detergenteSuficiente;
    private List<Prenda> prendas;

    public Lavadora(int capacidad, String planLavado) {
        this.capacidad = capacidad;
        this.planDeLavado = planLavado;
        this.llena = false;
        this.estado = "Apagada";
        this.contadorTiempoLavado = 0;
        this.estadoLavado = "No iniciado";
        this.puerta = "Cerrada";
        this.pantalla = "Apagada";
        this.revolucionesPorMinuto = 0;
        this.temperaturaAgua = 0;
        this.cajetil = "Cerrado";
        this.capacidadCajetil = 0;
        this.tamborLavadora = "";
        this.detergente = "";
        this.enProcesoDeLavado = false;
        this.detergenteSuficiente = false;
        this.prendas = new ArrayList<>();
    }

    public String abrirPuerta() {
        if (!enProcesoDeLavado && estado.equals("Apagada")) {
            puerta = "Abierta";
            return "Puerta abierta.";
        }
        return "No se puede abrir la puerta durante el lavado o mientras la lavadora está encendida.";
    }

    public String introducirPrenda(Prenda nueva) {
        if (puerta.equals("Abierta") && prendas.size() < capacidad) {
            prendas.add(nueva);
            llena = prendas.size() == capacidad;
            return "Prenda añadida a la lavadora.";
        }
        return "Abre la puerta primero o la lavadora está llena.";
    }

    public String cerrarPuerta() {
        puerta = "Cerrada";
        return "Puerta cerrada.";
    }

    public String encender() {
        if (estado.equals("Apagada")) {
            estado = "Encendida";
            pantalla = "Encendida";
            return "Lavadora encendida.";
        }
        return "La lavadora ya está encendida.";
    }

    public void definirPlanDeLavado(String plan) {
        this.planDeLavado = plan;
    }

    public String abrirCajetil() {
        if (cajetil.equals("Cerrado")) {
            cajetil = "Abierto";
            return "Cajetil abierto.";
        }
        return "El cajetil ya está abierto.";
    }

    public String introducirDetergente(int cantidad) {
        if (cajetil.equals("Abierto")) {
            capacidadCajetil += cantidad;
            detergenteSuficiente = capacidadCajetil >= 10; // Asumiendo 10 como cantidad mínima suficiente
            detergente = "Detergente introducido.";
            return detergente;
        }
        return "Abre el cajetil primero.";
    }

    public String cerrarCajetil() {
        cajetil = "Cerrado";
        return "Cajetil cerrado.";
    }

    public String iniciarLavado() {
        if (estado.equals("Encendida") && puerta.equals("Cerrada") && detergenteSuficiente && !prendas.isEmpty()) {
            estadoLavado = "En progreso";
            enProcesoDeLavado = true;
            for (Prenda prenda : prendas) {
                prenda.setSuciedad("LIMPIA");
            }
            return "Lavado iniciado.";
        }
        return "Asegúrate de que la lavadora está encendida, la puerta cerrada, hay detergente suficiente y hay prendas dentro.";
    }

    public String finalizarLavado() {
        if (enProcesoDeLavado) {
            enProcesoDeLavado = false;
            estadoLavado = "Completado";
            return "Lavado finalizado.";
        }
        return "No hay ningún lavado en proceso.";
    }

    public String retirarRopa() {
        if (puerta.equals("Abierta") && !prendas.isEmpty()) {
            prendas.clear();
            llena = false;
            return "Ropa retirada.";
        }
        return "No hay ropa que retirar o la puerta está cerrada.";
    }

    public String apagar() {
        if (estado.equals("Encendida")) {
            estado = "Apagada";
            pantalla = "Apagada";
            return "Lavadora apagada.";
        }
        return "La lavadora ya está apagada.";
    }

    public String getEstado() {
        return "Lavadora | Capacidad: " + capacidad + " | Estado: " + estado + " | Prendas dentro: " + prendas.size();
    }
}
