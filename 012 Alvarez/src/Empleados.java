public class Empleados extends Trabajador {

    private int descuadresCaja;


    public Empleados(String nombre, String tipoSer, String direccion, String fechaContratacion, int sueldo, int descuadresCaja) {
        super(nombre, tipoSer, direccion, fechaContratacion, sueldo);
        this.descuadresCaja = descuadresCaja;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "descuadresCaja='" + descuadresCaja + '\'' +
                '}' + super.toString();
    }
}
