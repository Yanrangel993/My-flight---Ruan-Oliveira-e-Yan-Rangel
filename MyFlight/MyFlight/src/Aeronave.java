public class Aeronave implements Comparable<Aeronave>{
    private String codigo;
    private String descricao;
    private int capacidade;

    public Aeronave(String codigo,String descricao,int capacidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.capacidade = capacidade;
    }
    public int compareTo(Aeronave aeroExemplo) {
        return descricao.compareTo(aeroExemplo.descricao);
    }
    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return  "Código: " + codigo + " Descrição: " + descricao + " Capacidade: " + capacidade;
    }
}
