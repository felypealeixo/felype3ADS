public class ContaBancaria {

    private String nomeCliente;
    private String cpf;
    private String nomeBanco;
    private String agencia;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, String cpf, String nomeBanco,
                         String agencia, String numeroConta) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.nomeBanco = nomeBanco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = 500.00; 
    }

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
}