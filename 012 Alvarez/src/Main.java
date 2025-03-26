public class Main {
    public static void main(String[] args) {

        Empleados em = new Empleados("pepe", "esponja", "calle A", "12/10/2024", 1500, 0);

        em.toString();

        Clientes cl = new Clientes("pepa", "Ardilla", "CalleB", 0);

        em.toString();

        Repartidor rep = new Repartidor ("felix", "Cangrejo", "CalleD", "4/6/2020", 1800, "bicicleta", true);

        rep.toString();

    }
}