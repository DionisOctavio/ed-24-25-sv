import pojo.Lavadora;

public class Main {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora (10, "Xiaomi");
        Lavadora lavadora2 = new Lavadora (16, "Balay");
        Lavadora lavadora3 = new Lavadora (10, "Xiaomi");

        abrirPuerta(lavadora);
    }
}