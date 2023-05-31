import java.util.ArrayList;
import java.util.HashMap;
public class GerenciadorRota implements Comparable<Rota>{
    private static  ArrayList<Rota> rotas = new ArrayList<Rota>();
    public void addRota(Rota rota){
        rotas.add(rota);
    }

    public int compareTo(Rota outra){
        for(Rota i : rotas){
            return i.getCompanhiaAerea().getNome().compareTo(outra.getCompanhiaAerea().getNome());
        }
        return 0;
    }

    public String ordenaDescricaoR(){
        StringBuilder sb = new StringBuilder();
        rotas.sort((Rota r1, Rota r2) -> r1.getCompanhiaAerea().getNome().compareTo(r2.getCompanhiaAerea().getNome()));
        for (Rota i: rotas){
            sb.append(i.toString() + "\n");
        }
        return sb.toString();
    }
    public void listaTodas(){
        System.out.println(" --- Todas as Rotas --- ");
        for (Rota i : rotas){
            System.out.println(i);
        }
    }
    public Rota buscaPorOrigem(String origem){
        for (Rota i:  rotas){
            if (i.getOrigem().getCodigo().equalsIgnoreCase(origem)){
                return i;
            }
        }
        return null;
    }
}
