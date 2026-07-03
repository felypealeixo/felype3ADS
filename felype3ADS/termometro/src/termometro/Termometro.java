package termometro;

public class Termometro {
    private double temperatura;

    
    public Termometro() {
        this.temperatura = 20.0;
    }

    
    public double getTemperatura() {
        return temperatura;
    }

    
    public void setTemperatura(double temperatura) {
        if (temperatura >= -10.0 && temperatura <= 50.0) {
            this.temperatura = temperatura;
        } else {
            System.out.println("Aviso: temperatura inválida! O valor deve estar entre -10.0°C e 50.0°C.");
        }
    }
}