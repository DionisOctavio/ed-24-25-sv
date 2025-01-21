package pojo;

public class Lavadora {

    private int capacidad;
    private String modelo;
    private String puerta = "cerrada";

    public Lavadora (int capacidad, String modelo) {
        this.capacidad = capacidad;
        this.modelo = modelo;
    }

    private void abrirPuerta(Lavadora lavadora) {
        if (puerta == "cerrada") {
            System.out.println("Se ha abierto la puerta");
            puerta = "abierta";
        }else {
            System.out.println("La puerta ya esta abierta");
        }
    }
}
