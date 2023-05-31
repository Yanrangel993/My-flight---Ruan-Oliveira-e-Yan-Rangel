public class Rota implements Comparable<CiaAerea>{
    private CiaAerea companhia;
    private Aeroporto origem;
    private Aeroporto destino;
    private Aeronave aeronave;

    public Rota(CiaAerea companhia, Aeroporto origem,Aeroporto destino, Aeronave aeronave) {
        this.companhia = companhia;
        this.origem = origem;
        this.destino = destino;
        this.aeronave = aeronave;
    }

    public int compareTo(CiaAerea outra){
        return companhia.getNome().compareTo(outra.getNome());
    }

    public CiaAerea getCompanhiaAerea(){
        return  companhia;
    }

    public void setCompanhiaA(CiaAerea companhia){
        this.companhia = companhia;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem){
        this.origem = origem;
    }

    public Aeroporto getDestino(){
        return destino;
    }
    public void setDestino(Aeroporto destino){
        this.destino = destino;
    }

    public Aeronave getAeronave(){
        return aeronave;
    }

    @Override
    public String toString() {
        return "Cia Aerea: " + companhia.getNome() + " Origem: " + origem.getCodigo() + " Destino: " + destino.getCodigo() + " Aeronave: " + aeronave.getCodigo();
    }
}
