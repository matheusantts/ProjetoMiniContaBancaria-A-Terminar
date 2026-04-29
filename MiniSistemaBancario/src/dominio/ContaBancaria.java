package dominio;

public class ContaBancaria {
    private String titular;
    private int numeroDaConta;
    private double saldo;
    private String senhaConta;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
        System.out.println("DEPOSITO CONCLUIDO!");
        System.out.println("Valor do deposito: " + saldo);
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void saque(double valorSaque) {
        if (this.saldo < valorSaque) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.saldo -= valorSaque;
        System.out.println("SAQUE CONCLUIDO!");
        System.out.println("Valor do saque: " + valorSaque);
        System.out.println("Saldo atual: " + this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setSenhaConta(String senhaConta) {
        this.senhaConta = senhaConta;
    }

}
