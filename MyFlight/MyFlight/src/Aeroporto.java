public class Aeroporto {
    private String codigo;
    private String nome;
    private Geo geo;

    public Aeroporto(String codigo,String nome,double latitude,double longitude) {
        geo = new Geo(latitude,longitude);
        this.codigo = codigo;
        this.nome = nome;
        geo.setLatitude(latitude);
        geo.setLongitude(longitude);
    }

    public Geo getGeo(){
        return geo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return "Codigo: " + codigo + " Nome: " + nome + " Latitude: " + geo.getLatitude() + " Longitude: " + geo.getLongitude();
    }
}
