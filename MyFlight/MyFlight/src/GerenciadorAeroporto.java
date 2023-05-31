import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class GerenciadorAeroporto{
    private static HashMap<String, Aeroporto> aeroportos = new HashMap();

    public void addAeroporto(Aeroporto aeroporto){

        aeroportos.put(aeroporto.getCodigo(), aeroporto);
    }

    public Geo getGeo(String cod){
        for(Aeroporto i : aeroportos.values()){
            if(i.getCodigo().equals(cod)) {
                return i.getGeo();
            }
        }
        return null;
    }

    public void listaTodos(){
        System.out.println("--- Todos os Aeroportos ---");
        for (Aeroporto i: aeroportos.values()){
            System.out.println(i);
        }
    }

    public Aeroporto buscaPorCodigo(String cod){
        return aeroportos.get(cod);
    }

    public String ordenaDescricaoAp(){
        StringBuilder sb = new StringBuilder();
        for (Aeroporto i : aeroportos.values()){
            sb.append(i.toString() + " \n ");
        }
        return sb.toString();
    }
}
