
public class CiaAerea implements Comparable<CiaAerea> {
    private static int totalCias = 0;

    private String codigo;
    private String nome;

    public CiaAerea(String codigo, String nome) {
        totalCias ++;
        this.codigo = codigo;
        this.nome = nome;
    }
    public static int getTotalCias(){
        return totalCias;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public String toString() {
        return "Codigo: " + codigo + " Nome: " + nome;
    }

    public int compareTo(CiaAerea outra) {
        return nome.compareTo(outra.nome);
    }
}
