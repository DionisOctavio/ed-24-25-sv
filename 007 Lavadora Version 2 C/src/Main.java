import pojo.Lavadora;
import pojo.Prenda;

public class Main {
    public static void main(String[] args) {
        Lavadora lavadora1 = new Lavadora(10, "Corto");
        Lavadora lavadora2 = new Lavadora(10, "Rápido");
        Lavadora lavadora3 = new Lavadora(15, "Ecológico");

        Prenda prenda1 = new Prenda("Pantalón", "Negro", 5, "Muy sucio");
        Prenda prenda2= new Prenda("Abrigo","Blanco",16,"Muy sucio");
        Prenda prenda3= new Prenda("Chaqueta","Beige",5,"Casi Limpio");
        Prenda prenda4= new Prenda("Calcetines","Blancos",1,"Muy sucio");
        Prenda prenda5= new Prenda("Ropa Interior","Negra",1,"Sucio");
        Prenda prenda6= new Prenda("Blusa","Rosa",1,"Sucio");
        Prenda prenda7= new Prenda("Jersey","Lila",4,"Casi Limpio");
        Prenda prenda8= new Prenda("Sudadera","Negra",4,"Muy sucio");
        Prenda prenda9= new Prenda("Camiseta","Roja",2,"Muy sucio");
        Prenda prenda10= new Prenda("Top","Burdeos",1,"Muy sucio");

        System.out.println("Abriendo las puertas de las 3 lavadoras:");
        System.out.println(lavadora1.abrirPuerta());
        System.out.println(lavadora2.abrirPuerta());
        System.out.println(lavadora3.abrirPuerta());
        System.out.println();

        prenda2.set_Suciedad("Sucio");
        prenda8.set_Suciedad("Sucio");
        prenda10.set_Suciedad("Sucio");

        lavadora1.Introducir_Prenda(prenda1);
        lavadora3.Introducir_Prenda(prenda2);
        lavadora2.Introducir_Prenda(prenda3);
        lavadora3.Introducir_Prenda(prenda4);
        lavadora2.Introducir_Prenda(prenda5);
        lavadora1.Introducir_Prenda(prenda6);
        lavadora2.Introducir_Prenda(prenda7);
        lavadora1.Introducir_Prenda(prenda8);
        lavadora3.Introducir_Prenda(prenda9);
        lavadora2.Introducir_Prenda(prenda10);
        System.out.println();

        lavadora1.DefinirPlanLavado("Corto",20,120,10);
        lavadora2.DefinirPlanLavado("Rápido",30,150,10);
        lavadora3.DefinirPlanLavado("Ecológico",50,120,10);

        System.out.println("Ejecutando Plan De Lavado Lavadora 1: Con Error De Capacidad");
        lavadora1.DefinirPlanLavado("Corto",20,120,10);
        System.out.println(lavadora1.abrirPuerta());
        System.out.println(lavadora1.Introducir_Prenda(prenda1));
        System.out.println(lavadora1.Introducir_Prenda(prenda2));
        System.out.println(lavadora3.Introducir_Prenda(prenda4));
        System.out.println(lavadora3.Introducir_Prenda(prenda5));
        System.out.println(lavadora1.CerrarPuerta());
        System.out.println(lavadora1.AbrirCajetil());
        System.out.println(lavadora1.IntroducirDetergente(1));
        System.out.println(lavadora1.CerrarCajetil());
        System.out.println(lavadora1.Encender());
        System.out.println(lavadora1.IniciarLavado());
        System.out.println(lavadora1.FinalizarLavado());
        System.out.println(lavadora1.abrirPuerta());
        System.out.println(lavadora1.RetirarRopa());
        System.out.println(lavadora1.Apagar());
        System.out.println();

        System.out.println("Ejecutando Plan De Lavado Lavadora 2: Abrir Puerta Mientras Lava");
        lavadora2.DefinirPlanLavado("Rápido",30,150,10);
        System.out.println(lavadora2.abrirPuerta());
        System.out.println(lavadora2.Introducir_Prenda(prenda1));
        System.out.println(lavadora2.Introducir_Prenda(prenda5));
        System.out.println(lavadora2.Introducir_Prenda(prenda10));
        System.out.println(lavadora2.Introducir_Prenda(prenda4));
        System.out.println(lavadora2.CerrarPuerta());
        System.out.println(lavadora2.AbrirCajetil());
        System.out.println(lavadora2.IntroducirDetergente(1));
        System.out.println(lavadora2.CerrarCajetil());
        System.out.println(lavadora2.Encender());
        System.out.println(lavadora2.IniciarLavado());
        System.out.println(lavadora2.abrirPuerta());
        System.out.println(lavadora2.FinalizarLavado());
        System.out.println(lavadora2.RetirarRopa());
        System.out.println(lavadora2.Apagar());
        System.out.println();

        System.out.println("Ejecutando Plan De Lavado Lavadora 3: Bien Ejecutado");
        lavadora3.DefinirPlanLavado("Ecológico",50,120,10);
        System.out.println(lavadora3.abrirPuerta());
        System.out.println(lavadora3.Introducir_Prenda(prenda1));
        System.out.println(lavadora3.Introducir_Prenda(prenda6));
        System.out.println(lavadora3.Introducir_Prenda(prenda10));
        System.out.println(lavadora3.Introducir_Prenda(prenda9));
        System.out.println(lavadora3.CerrarPuerta());
        System.out.println(lavadora3.AbrirCajetil());
        System.out.println(lavadora3.IntroducirDetergente(1));
        System.out.println(lavadora3.CerrarCajetil());
        System.out.println(lavadora3.Encender());
        System.out.println(lavadora3.IniciarLavado());
        System.out.println(lavadora3.FinalizarLavado());
        System.out.println(lavadora3.abrirPuerta());
        System.out.println(lavadora3.RetirarRopa());
        System.out.println(lavadora3.Apagar());
        System.out.println();
    }
}