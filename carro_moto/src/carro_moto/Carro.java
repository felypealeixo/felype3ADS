package carro_moto;

class Carro {
    int velocidade;

    // Construtor para iniciar a velocidade
    Carro() {
        this.velocidade = 0;
    }

    void aumentarVelocidade(int incremento) {
        velocidade += incremento;
    }

    void mostrarVelocidade() {
        System.out.println("Velocidade do Carro: " + velocidade + " km/h");
    }
}