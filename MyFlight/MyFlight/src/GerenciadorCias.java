import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
public class GerenciadorCias {
    private  static HashMap<String,CiaAerea> empresas = new HashMap<>();
    private static GerenciadorCias adicionaC = null;


    public void addCia(CiaAerea ciaAerea){
        empresas.put(ciaAerea.getCodigo(),ciaAerea);
    }

    public void listaTodas(){
        System.out.println(" ---------- Todas as Cias ---------- ");
        for (CiaAerea i : empresas.values()){
            System.out.println(i);
        }
    }

    public CiaAerea buscaPorCodigo(String codigo) {
        return empresas.get(codigo);
    }

    public CiaAerea buscaPorNome(String nome) {
        return empresas.get(nome);
    }
}
