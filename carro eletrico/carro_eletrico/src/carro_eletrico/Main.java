package carro_eletrico;

public class Main {
    public static void main(String[] args) {
        CarroEletrico carro = new CarroEletrico("Tesla Model 3");

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Velocidade: " + carro.getVelocidadeAtual() + " km/h");
        System.out.println("Bateria: " + carro.getCargaBateria() + "%");
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            try {
                carro.acelerar();
                System.out.println("Aceleração " + i + ": " +
                        carro.getVelocidadeAtual() + " km/h, " +
                        carro.getCargaBateria() + "% de bateria");
            } catch (IllegalStateException e) {
                System.out.println("Erro ao acelerar: " + e.getMessage());
                break;
            }
        }

        try {
            System.out.println("\nTentando carregar a bateria em movimento...");
            carro.carregarBateria();
        } catch (IllegalStateException e) {
            System.out.println("Erro ao carregar: " + e.getMessage());
        }

        while (carro.getVelocidadeAtual() > 0) {
            carro.frear();
            System.out.println("Freando: " + carro.getVelocidadeAtual() + " km/h");
        }

        try {
            System.out.println("\nCarregando bateria com o carro parado...");
            carro.carregarBateria();
            System.out.println("Bateria recarregada: " + carro.getCargaBateria() + "%");
        } catch (IllegalStateException e) {
            System.out.println("Erro ao carregar: " + e.getMessage());
        }
    }
}