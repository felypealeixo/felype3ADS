package carro_eletrico;
class CarroEletrico {
    private String modelo;
    private int velocidadeAtual;
    private int cargaBateria;

    public CarroEletrico(String modelo) {
        this.modelo = modelo;
        this.velocidadeAtual = 0;
        this.cargaBateria = 100;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getCargaBateria() {
        return cargaBateria;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        if (cargaBateria == 0) {
            throw new IllegalStateException("Não é possível acelerar: a bateria está em 0%.");
        }
        if (velocidadeAtual >= 120) {
            throw new IllegalStateException("Não é possível acelerar: o carro já está na velocidade máxima de 120 km/h.");
        }

        velocidadeAtual += 20;

        if (velocidadeAtual > 120) {
            velocidadeAtual = 120;
        }

        cargaBateria -= 5;

        if (cargaBateria < 0) {
            cargaBateria = 0;
        }
    }

    public void frear() {
        velocidadeAtual -= 20;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public void carregarBateria() {
        if (velocidadeAtual != 0) {
            throw new IllegalStateException("Não é possível carregar a bateria com o carro em movimento.");
        }
        cargaBateria = 100;
    }
}

