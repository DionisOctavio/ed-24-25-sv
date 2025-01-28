package pojo;

public class Lavadora {

    private String planDeLavado;
    private int capacidad;
    private boolean isLlena;
    private String estado;
    private int contadorTiempoLavado;
    private String estadoLavado;
    private String puerta;
    private String pantalla
    private int revolucionPorMinuto;
    private int temperaturaAgua;
    private String cajetin;
    private int capacidadCajetin;
    private String tamborLavadora;
    private String detergente;
    private boolean enProcesoDeLavado;
    private boolean detergenteSuficiente;

    // Constructor
    public Lavadora(int capacidad, String planDeLavado) {
        this.capacidad = capacidad;
        this.planDeLavado = planDeLavado;
    }

    // Metodos
    public void encender(){}

    public void apagar(){}

    public void abrirPuerta(){}

    public void cerrarPuerta(){}

    public void introducirPrenda(){}

    public void retirarPrenda(){}

    public void definirPlanDeLavado(){}

    public void abrirCajetin(){}

    public void cerrarCajetin(){}

    public void introducirDetergente(){}










    // Geter/Setter
    public String getPlanDeLavado() {
        return planDeLavado;
    }

    public void setPlanDeLavado(String planDeLavado) {
        this.planDeLavado = planDeLavado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isLlena() {
        return isLlena;
    }

    public void setLlena(boolean llena) {
        isLlena = llena;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getContadorTiempoLavado() {
        return contadorTiempoLavado;
    }

    public void setContadorTiempoLavado(int contadorTiempoLavado) {
        this.contadorTiempoLavado = contadorTiempoLavado;
    }

    public String getEstadoLavado() {
        return estadoLavado;
    }

    public void setEstadoLavado(String estadoLavado) {
        this.estadoLavado = estadoLavado;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public int getRevolucionPorMinuto() {
        return revolucionPorMinuto;
    }

    public void setRevolucionPorMinuto(int revolucionPorMinuto) {
        this.revolucionPorMinuto = revolucionPorMinuto;
    }

    public int getTemperaturaAgua() {
        return temperaturaAgua;
    }

    public void setTemperaturaAgua(int temperaturaAgua) {
        this.temperaturaAgua = temperaturaAgua;
    }

    public String getCajetin() {
        return cajetin;
    }

    public void setCajetin(String cajetin) {
        this.cajetin = cajetin;
    }

    public int getCapacidadCajetin() {
        return capacidadCajetin;
    }

    public void setCapacidadCajetin(int capacidadCajetin) {
        this.capacidadCajetin = capacidadCajetin;
    }

    public String getTamborLavadora() {
        return tamborLavadora;
    }

    public void setTamborLavadora(String tamborLavadora) {
        this.tamborLavadora = tamborLavadora;
    }

    public String getDetergente() {
        return detergente;
    }

    public void setDetergente(String detergente) {
        this.detergente = detergente;
    }

    public boolean isEnProcesoDeLavado() {
        return enProcesoDeLavado;
    }

    public void setEnProcesoDeLavado(boolean enProcesoDeLavado) {
        this.enProcesoDeLavado = enProcesoDeLavado;
    }

    public boolean isDetergenteSuficiente() {
        return detergenteSuficiente;
    }

    public void setDetergenteSuficiente(boolean detergenteSuficiente) {
        this.detergenteSuficiente = detergenteSuficiente;
    }
}
