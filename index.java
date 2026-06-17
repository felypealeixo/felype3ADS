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

public class Principal {
    public static void main(String[] args) {
        // Criando os objetos
        Carro meuCarro = new Carro();
        Moto minhaMoto = new Moto();

        // Aumentando a velocidade
        meuCarro.aumentarVelocidade(40);
        minhaMoto.aumentarVelocidade(30);

        // Exibindo os resultados
        meuCarro.mostrarVelocidade();
        minhaMoto.mostrarVelocidade();
    }
}
