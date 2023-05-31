import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
public class GerenciadorVoo {
    private static HashMap<String,Voo> voos = new HashMap<>();
    public void addVoo(Voo voo ){
        voos.put(voo.toString(),voo);
    }
    public void listarTodos(){
        System.out.println(" ---------- Todos os Voos ---------- ");
        for (Voo i : voos.values()){
            System.out.println(i);
        }
    }
    public String buscaPorData(int dia, int mes, int ano){
        StringBuilder sb = new StringBuilder(" ");
        LocalDate data = LocalDate.of(ano, mes, dia);
        for (Voo v : voos.values()){
            if (v.getDatahora().toLocalDate().equals(data)){
                sb.append(v.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
//    .toLocalDate
//    localDate of(int ano, int mes, int dia)
