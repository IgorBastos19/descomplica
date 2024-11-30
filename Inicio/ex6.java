//Contagem Regressiva: Crie uma contagem regressiva de 10 até 0

public class ex6 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--){
            System.out.println(i);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }
}