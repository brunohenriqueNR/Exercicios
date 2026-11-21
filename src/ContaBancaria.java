
public class ContaBancaria {

    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (!titular.isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não pode ser negativo!");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado!");
        }
    }

    public void sacar(double valor) throws SaldoInsuficienteException {

        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque!");
        }

        saldo -= valor;
        System.out.println("Saque realizado!");
    }
}
