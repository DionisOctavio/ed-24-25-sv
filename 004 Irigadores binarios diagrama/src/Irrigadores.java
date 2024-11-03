public class Irrigadores {


    public static void ejecutarInstruccion(String instruccion) {
        System.out.println("Ejecutando instrucción: " + instruccion);
    }

    public static void riegaDosHoras() {
        ejecutarInstruccion("Subir irrigador 150cm → 00000100 10010110");

        ejecutarInstruccion("Conectar irrigados 100L 12rpm → 00010000 11001000 00001100");

        ejecutarInstruccion("Esperar 2h → 01000000 0001110001000000");

        ejecutarInstruccion("Desconectar irrigador → 00011000 0001110001000000");
    }

    public static void main(String[] args) {
        riegaDosHoras();
    }
}