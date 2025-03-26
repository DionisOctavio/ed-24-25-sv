public class Clientes extends SerMarino {

        private int dineroGastado;


    public Clientes(String nombre, String tipoSer, String direccion, int dineroGastado) {
        super(nombre, tipoSer, direccion);
        this.dineroGastado = dineroGastado;
    }

    public void realizarPedido(Pedido pedido){
        if (pedido != null){
            System.out.println("Has rwalizado el pedido: " + pedido + "El importe del pedido asciende a: "+ pedido.getPrecio());
            this.dineroGastado = this.dineroGastado + pedido.getPrecio();
        }
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "dineroGastado=" + dineroGastado +
                ", nombre='" + nombre + '\'' +
                ", tipoSer='" + tipoSer + '\'' +
                ", direccion='" + direccion + '\'' +
                '}' + super.toString();
    }
}
