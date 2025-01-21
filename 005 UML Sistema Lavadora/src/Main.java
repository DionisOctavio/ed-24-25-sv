import pojo.Lavadora;

public class Main {
    public static void main(String[] args) {
        Lavadora lavadora1 = new Lavadora(10, "Xiaomi");
        Lavadora lavadora2 = new Lavadora(16, "Balay");
        Lavadora lavadora3 = new Lavadora(10, "Xiaomi");

        lavadora1.abrirPuerta();
        lavadora2.abrirPuerta();
        lavadora3.abrirPuerta();

        lavadora1.cargar(8);
        lavadora3.cargar(12);


        lavadora1.programarLavado("Delicado");
        lavadora2.programarLavado("Intensivo");

        lavadora1.iniciarLavado();
        lavadora3.iniciarLavado();

        lavadora1.abrirPuerta();
    }
}
