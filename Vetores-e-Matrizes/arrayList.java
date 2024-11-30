import java.util.ArrayList;
class Main{
    public static void main(String[] args) {
        ArrayList<String> estados = new ArrayList<String>();
        estados.add("Minas Gerais");
        estados.add("São Paulo");
        estados.add("Rio Grande do Sul");

        estados.remove("Minas Gerais");

        estados.contains("Amazonas");
    }
}