package pojo;

public class Lavadora {
    private String Plan_de_lavado;
    private int Capacidad;
    private boolean Llena;
    private String Estado;
    private int ContadorTiempoLavado;
    private String EstadoLavado;
    private String Puerta;
    private String Pantalla;
    private int RevolucionesPorMinuto;
    private int TemperaturaAgua;
    private String Cajetil;
    private int CapacidadCajetil;
    private String TamborLavadora;
    private String Detergente;
    private boolean EnProcesoDeLavado;
    private boolean DetergenteSuficiente;

    private int pesoActual;

    public Lavadora(int Capacidad, String Plan_lavado) {
        this.Capacidad = Capacidad;
        this.Plan_de_lavado = Plan_lavado;
        this.Llena = false;
        this.Estado = "Apagada";
        this.ContadorTiempoLavado = 60;
        this.EstadoLavado = "Esperando";
        this.Puerta = "Cerrada";
        this.Pantalla = "Apagada";
        this.RevolucionesPorMinuto = 120;
        this.TemperaturaAgua = 20;
        this.Cajetil = "Cerrado";
        this.CapacidadCajetil = 100;
        this.TamborLavadora = "Vacío";
        this.Detergente = "";
        this.EnProcesoDeLavado = false;
        this.DetergenteSuficiente = false;
        this.pesoActual = 0;
    }

    public String abrirPuerta() {
        if (EnProcesoDeLavado) {
            Puerta = "Cerrada";
            Estado = "Error";
            return "No se puede abrir la puerta mientras está lavando.";
        } else {
            Puerta = "Abierta";
            return "Puerta abierta.";
        }
    }

    public String Introducir_Prenda(Prenda prenda) {
        if (Puerta.equals("Cerrada")) {
            Estado = "Error";
            return "Error: La puerta está cerrada.";
        }
        pesoActual = 0;
        int nuevoPeso = pesoActual + prenda.obtenerPeso();

        if (nuevoPeso > Capacidad) {
            Estado = "Error";
            return "Error: No se puede agregar la prenda. El peso total excede la capacidad de la lavadora.";
        }
        pesoActual = nuevoPeso;

        if ((pesoActual == Capacidad) || pesoActual < Capacidad) {
            Estado = "Apagada";
            Llena = true;
        }
        return "Prenda cargada correctamente: " + prenda.obtenerTipo() + " Color: " + prenda.obtenerColor() + " Nivel Suciedad: " + prenda.obtenerNivelSuciedad();
    }

    public String CerrarPuerta() {
        if (Estado.equals("Error")){
            Puerta = "Abierta";
            Estado = "Error";
            return "Error: No se va a cerrar la puerta debido al exceso de peso de la ropa. Introduzca otra prenda más ligera.";
        }else {
            Puerta = "Cerrada";
            return "Puerta cerrada.";
        }
    }

    public String Encender() {
        if (pesoActual > Capacidad) {
            Estado = "Error";
            return "Error: La lavadora está sobrecargada. No se puede encender.";
        } else if (Puerta.equals("Abierta")) {
            Estado = "Error";
            return "Error: Cierre la puerta de la lavadora antes de encender la lavadora";
        } else {
            Estado = "Encendida";
            return "Lavadora encendida.";
        }
    }

    public void DefinirPlanLavado(String plan, int ContadorLavado, int Rev_Min, int Temp_Agua) {
        this.Plan_de_lavado = plan;
        this.ContadorTiempoLavado= ContadorLavado;
        this.RevolucionesPorMinuto = Rev_Min;
        this.TemperaturaAgua=Temp_Agua;
    }

    public String AbrirCajetil() {
        if (Estado.equals("Error")){
            Cajetil = "Cerrado";
            return "Error: El Cajetil no debe ser abierto";
        }else {
            Cajetil = "Abierto";
            return "Cajetil abierto.";
        }
    }

    public String IntroducirDetergente(int cantidad) {
        if (Estado.equals("Error")){
            return "Error: Detergente No Introducido";
        } else if (cantidad>0) {
            this.DetergenteSuficiente = true;
            return "Detergente introducido.";
        } else {
            return "No hay suficiente detergente.";
        }
    }

    public String CerrarCajetil() {
        if (Cajetil.equals("Cerrado")){
            return "Error: El Cajetil ya está cerrado";
        }else {
            Cajetil = "Cerrado";
            return "Cajetil cerrado.";
        }
    }

    public String IniciarLavado() {
        if (Estado.equals("Error")) {
            Estado = "Error";
            return "Error de Lavado: No se puede iniciar el lavado.";
        }
        if (Puerta.equals("Abierta") || !DetergenteSuficiente || !Llena) {
            Estado = "Error";
            return "Error de Lavado: Verifique que la puerta esté cerrada con ropa dentro y que haya suficiente detergente.";
        }else {
            EnProcesoDeLavado = true;
            EstadoLavado = "Lavando";
            return "Lavado iniciado con el plan: " + Plan_de_lavado;
        }
    }

    public String FinalizarLavado() {
        if (Estado.equals("Error")) {
            return "No se pudo finalizar el lavado";
        }else {
            EnProcesoDeLavado = false;
            EstadoLavado = "Encendida";
            return "Lavado finalizado.";
        }
    }

    public String RetirarRopa() {
        if (EstadoLavado.equals("Lavando")){
            return "Error: No se puede retirar la ropa mientras está lavando.";
        }
        if (Puerta.equals("Cerrada")){
            return "Error: Abra la puerta para poder retirar la ropa";
        }else if (!Llena) {
            return "No hay ropa dentro de la lavadora.";
        } else {
            pesoActual = 0;
            Llena = false;
            return "Ropa retirada.";
        }
    }

    public String Apagar() {
        Estado = "Apagada";
        return "Lavadora apagada.";
    }
}

