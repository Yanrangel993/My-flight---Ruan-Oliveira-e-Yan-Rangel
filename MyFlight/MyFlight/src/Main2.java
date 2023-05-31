public class Main2 {
    public static void main(String[] args) {
        //nova main usando leitura de arquivos
        //ta errado
        System.out.println("----- Aeronaves  -----");
        GerenciadorAeronaves ga1 = new GerenciadorAeronaves();

        System.out.println("\n--- Lendo Aeronaves ----");

        ga1.leArquivo("airlines.dat");
        System.out.println(ga1.toString());
        System.out.println(ga1.relatorio());

        System.out.println(" ---------------------------------");
    }
}
