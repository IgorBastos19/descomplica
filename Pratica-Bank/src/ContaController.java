package src;

public class ContaController {
    public void depositarNaConta(User user, double valor){
        user.getConta().depositar(valor);
    }

    public void sacarDaConta(User user, double valor){
        user.getConta().sacar(valor);
    }

    public double consultarSaldo(User user){
        return user.getConta().consultarSaldo();
    }
}
