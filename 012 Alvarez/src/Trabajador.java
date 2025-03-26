public class Trabajador extends SerMarino {

    protected String fechaContratacion;
    protected int sueldo;

    public Trabajador(String nombre, String tipoSer, String direccion, String fechaContratacion, int sueldo) {
        super(nombre, tipoSer, direccion);
        this.fechaContratacion = fechaContratacion;
        this.sueldo = sueldo;
    }


    @Override
    public String toString() {
        return "Trabajador{" +
                "fechaContratacion='" + fechaContratacion + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

}
