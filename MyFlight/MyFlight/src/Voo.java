import java.time.LocalDateTime;
import java.time.Duration;
public class Voo {

    public enum Status { CONFIRMADO, ATRASADO, CANCELADO }
    LocalDateTime datahora;
    Duration duracao;
    private  Rota  rota;
    private Status status;

    public Voo(int ano,int mes,int dia,int horas,int minutos, long duracao, Rota rota, Status status) {
        this.datahora  = LocalDateTime.of(ano, mes, dia, horas, minutos);
        this.duracao = Duration.ofMinutes(duracao);
        this.rota = rota;
        this.status = status;
    }
    public Voo(long duracao, Rota rota, Status status) {
        this.datahora = LocalDateTime.of(2016,8,12,12,0);
        this.duracao = Duration.ofMinutes(duracao);
        this.rota = rota;
        this.status = status;
    }
    public Voo(Rota rota,LocalDateTime datahora,Duration duration){
        this.rota = rota;
        this.duracao = duration;
        this.datahora = datahora;
    }

    public LocalDateTime getDatahora()
    {
        return datahora;
    }
    @Override
    public String toString() {
        return "Data: " + datahora.toLocalDate() + " Horario: " + datahora.getHour() + ":" + datahora.getMinute() + " Duração: "
                + duracao+ " status: " + status;
        //  + " Rota: " + rota
    }
}