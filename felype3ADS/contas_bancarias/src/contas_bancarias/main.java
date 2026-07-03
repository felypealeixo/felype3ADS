

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Novo saldo: R$ " + saldo);
        }
    }

    public void exibirDados() {
        System.out.println("\n--- Dados da Conta ---");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("CPF: " + cpf);
        System.out.println("Banco: " + nomeBanco);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
