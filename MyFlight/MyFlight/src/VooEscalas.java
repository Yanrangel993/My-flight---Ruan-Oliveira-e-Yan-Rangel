import com.sun.source.tree.BreakTree;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo {
    private Rota rotaFinal;

    public VooEscalas(int ano, int mes, int dia, int horas, int minutos,
                      long duracao, Rota rota, Status status,Rota rotaFinal) {
        super(ano, mes, dia, horas, minutos, duracao, rota, status);
        this.rotaFinal = rotaFinal;
    }

    public VooEscalas(Rota rota,Rota rotaFinal,LocalDateTime dataHora,
                      Duration duration) {
        super(rota,dataHora,duration);
        this.rotaFinal = rotaFinal;
    }

    public LocalDateTime getDatahora(){
        return datahora;
    }

    public Rota getRotaFinal(){
        return rotaFinal;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " + rotaFinal;
    }
}
