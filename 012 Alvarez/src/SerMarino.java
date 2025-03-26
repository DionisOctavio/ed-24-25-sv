public class SerMarino {

    protected String nombre;
    protected String tipoSer;
    protected String direccion;

    public SerMarino(String nombre, String tipoSer, String direccion) {
        this.nombre = nombre;
        this.tipoSer = tipoSer;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "SerMarino{" +
                "nombre='" + nombre + '\'' +
                ", tipoSer='" + tipoSer + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
