package dominio;

public class ContaBancaria {
    private String titular;
    private int numeroDaConta;
    private double saldo;
    private String senhaConta;


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

}
