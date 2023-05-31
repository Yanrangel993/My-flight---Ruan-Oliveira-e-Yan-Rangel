import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends Voo{

    private ArrayList<Rota> rotas;
    public VooVariasEscalas(int ano, int mes, int dia, int horas, int minutos, long duracao, Rota rota, Status status) {
        super(ano, mes, dia, horas, minutos, duracao, rota, status);
        rotas = new ArrayList<>();
        rotas.add(rota);
    }

    public void addRota(Rota nova) {
        rotas.add(nova);
    }
    public VooVariasEscalas(long duracao, Rota rota, Status status) {
        super(duracao, rota, status);
    }

    public VooVariasEscalas(Rota rota, LocalDateTime datahora, Duration duration) {
        super(rota, datahora, duration);
    }

    @Override
    public String toString(){
        String res =  super.toString() + " -> " + " Voo Varias Escalas\n";
        for (Rota r : rotas){
            res = res + "\t" + r.toString() + "\n";
        }
        return res;
    }
}
