package carro_moto;

class Moto {
    int velocidade;

    // Construtor para iniciar a velocidade
    Moto() {
        this.velocidade = 0;
    }

    void aumentarVelocidade(int incremento) {
        velocidade += incremento;
    }

    void mostrarVelocidade() {
        System.out.println("Velocidade da Moto: " + velocidade + " km/h");
    }
}