package conta.model;

public abstract class Conta {
    private int numeroConta;
    private int agencia;
    private int tipo;
    private String titular;
    private double saldo;

    public Conta(int numeroConta, int agencia, int tipo, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if (this.getSaldo() < valor) {
            System.out.println("Saldo insuficiente!\n");
            return false;
        }
        this.setSaldo(this.getSaldo() - valor);
        return true;
    }

    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public void statusConta() {
        String tipo = "";

        switch (this.tipo) {
            case 1:
                tipo = "Conta Corrente";
                break;

            case 2:
                tipo = "Conta Poupan�a";
                break;
        }

        System.out.println("\nDados da Conta");
        System.out.println("Numero da Conta: " + this.getNumeroConta());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Tipo da Conta: " + tipo);
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: " + this.getSaldo());

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
