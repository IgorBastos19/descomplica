package src;

public class Conta {
    private double saldo;

    public Conta(){
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depositado com sucesso: " + valor);
            System.out.println("Seu saldo agora é de: " + saldo);
        } else {
            System.out.println("Valor inválido para deposito.");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso: " + valor);
            System.out.println("Seu saldo agora é de: " + saldo);
        }
    }

    public double consultarSaldo(){
        return saldo;
    }
}
