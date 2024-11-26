class Main {
    public static void main(String[] args) {
        //Matriz do exercicio
        int[][] matriz = {{9,8,7}, {5,3,2}, {6,6,7}};

        //Vetores para armazenar o maior e menor elemento de cada linha e coluna
        int[] maiorLinha = new int[3];
        int[] menorColuna = new int[3];

        //Inicializando os vetores com valores iniciais
        for (int i = 0; i < matriz.length; i++) {
            maiorLinha[i] = 0;
        }

        //Inicializando os vetores com valores iniciais
        for (int i = 0; i < matriz.length; i++) {
            menorColuna[i] = 10;
        }
        
        //maior elemento na linha 0
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[0][i] > maiorLinha[0]){
                maiorLinha[0] = matriz[0][i];
            }
        }

        //maior elemento na linha 1
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[1][i] > maiorLinha[1]){
                maiorLinha[1] = matriz[1][i];
            }
        }

        //maior elemento na linha 2
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[2][i] > maiorLinha[2]){
                maiorLinha[2] = matriz[2][i];
            }
        }

         //menor elemento na coluna 0
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[i][0] < menorColuna[0]){
                menorColuna[0] = matriz[i][0];
            }
        }

        //menor elemento na coluna 1
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[i][1] > menorColuna[1]){
                menorColuna[1] = matriz[i][1];
            }
        }

        //menor elemento na coluna 2
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[i][2] < menorColuna[2]){
                menorColuna[2] = matriz[i][2];
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                if(maiorLinha[i] == menorColuna[j]){
                    System.out.println("Elemento com maior valor na linha " + i + " e menor valor na coluna " + j + ": " + maiorLinha[i]);
                    System.out.println(maiorLinha[2]);
                    break;
                }
            }
        }
    }
}