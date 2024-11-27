package src;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "teste@email.com", "123456");
       

        Logar logar = new Logar(user);
        boolean success = logar.logar("teste@email.com", "123456");

        if (success) {
            System.out.println("Login bem-sucedido!" + "Bem vindo " + user.getEmail());
        } else {
            System.out.println("Email ou senha incorretos.");
        }

        ContaController controller = new ContaController();

        controller.depositarNaConta(user, 1000.0);
        controller.sacarDaConta(user, 500.0);
        controller.consultarSaldo(user);
    }
}
