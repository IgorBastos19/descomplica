class Main{
    public static void main(String[] args) {
        int valor;
        //informando que tem 5 espaços
        int[][] dados = new int[3][3];

        /*
        dados [0][1] = 1;
        dados [0][2] = 2;
        dados [0][3] = 3;
        */

       for(int i = 0; i<3; i++)
        for (int j = 0; j<3; j++)
            dados[i][j] = j;
     
        for(int i = 0; i<3; i++)
        for (int j = 0; j<3; j++)
            System.out.println(dados[i][j]);

        
    }
}