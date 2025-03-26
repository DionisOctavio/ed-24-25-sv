public class Pedido {

    private String fecha;
    private String estado;
    private int precio;

    public Pedido(String fecha, String estado, int precio) {
        this.fecha = fecha;
        this.estado = estado;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "fecha='" + fecha + '\'' +
                ", estado='" + estado + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}
