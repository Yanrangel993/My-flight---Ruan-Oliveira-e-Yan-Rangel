import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
public class GerenciadorAeronaves {
    private final static HashMap<String,Aeronave> aeronaves = new HashMap<>();
    private static GerenciadorAeronaves adiciona = null;


    public void addAeronave(Aeronave aeronave){
        aeronaves.put(aeronave.getCodigo(),aeronave);
    }

    public void listaTodas(){
        System.out.println(" --------- Todas as Aeronaves --------- ");
        for (Aeronave i : aeronaves.values()){
            System.out.println(i);
        }
    }

    public Aeronave buscaPorCodigo(String codigo){
        for (Aeronave i: aeronaves.values()){
            if (i.getCodigo().equalsIgnoreCase(codigo)){
                return i;
            }
        }
        return null;
    }

    public boolean leArquivo(String nomeArq) {
        Path path1 = Paths.get(nomeArq);
        try (BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("utf8"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] dados = line.split(";");
                String cod = String.valueOf(Integer.parseInt(dados[0]));
                int capacidade = Integer.parseInt(line);
                Aeronave aeronave = new Aeronave(cod,dados[1],capacidade);
                adiciona.addAeronave(aeronave);
            }
        }
        catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
        return true;
    }
    public String relatorio() {
        StringBuilder rel = new StringBuilder("");
        for (Aeronave a : aeronaves.values()) {
            rel.append(a.toString());
            rel.append("\n");
        }
        return rel.toString();
    }


}
