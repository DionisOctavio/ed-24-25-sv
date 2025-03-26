public class Repartidor extends Trabajador {

    private String livencia;
    private Boolean tieneInfracion = false;


    public Repartidor(String nombre, String tipoSer, String direccion, String fechaContratacion, int sueldo, String livencia, Boolean tieneInfracion) {
        super(nombre, tipoSer, direccion, fechaContratacion, sueldo);
        this.livencia = livencia;
        this.tieneInfracion = tieneInfracion;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "livencia='" + livencia + '\'' +
                ", tieneInfracion=" + tieneInfracion +
                ", fechaContratacion='" + fechaContratacion + '\'' +
                ", sueldo=" + sueldo +
                ", nombre='" + nombre + '\'' +
                ", tipoSer='" + tipoSer + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
