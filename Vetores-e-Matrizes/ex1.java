class Main{
    public static void main(String[] args) {
        int[] passaroPorDia = {2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1};

        int totalPassaros = 0;
        int passaroPrimeira = 0;
        int passaroSegunda = 0;

        for (int i = 0; i < passaroPorDia.length; i++) {
            totalPassaros += passaroPorDia[i];
        }
        System.out.println("A soma total de passaros é: " + totalPassaros);

        for (int i = 0; i < 7; i++) {
            passaroPrimeira += passaroPorDia[i];
        }
        System.out.println("A soma de passaros na primeira semana é: " + passaroPrimeira);

        for (int i = 7; i < passaroPorDia.length; i++) {
            passaroSegunda += passaroPorDia[i];
        }
        System.out.println("A soma de passaros na primeira semana é: " + passaroSegunda);
    }
}