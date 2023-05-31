public class Main {
    public static void main(String[] args) {
        //CiaAerea e gerenciadorCias
        System.out.println("\n--------------------- CIAS ---------------------");

        CiaAerea c1 = new CiaAerea("JJ","Latam linhas aereas");
        CiaAerea c2 = new CiaAerea("G3","Gol linhas aereas");
        CiaAerea c3 = new CiaAerea("TP","TAP portugal");
        CiaAerea c4 = new CiaAerea("AD","Azul linhas aereas");

        GerenciadorCias gc1 = new GerenciadorCias();

        gc1.addCia(c1);
        gc1.addCia(c2);
        gc1.addCia(c3);
        gc1.addCia(c4);

        //todas as cias
        gc1.listaTodas();
        //total de cias
        System.out.println("\n");
        System.out.println("Total de Cias Aereas criadas: " + CiaAerea.getTotalCias());

        System.out.println("\n --- Busca Por Codigo Cias ---");

        System.out.println(gc1.buscaPorCodigo("JJ"));
        System.out.println(gc1.buscaPorCodigo("G3"));
        System.out.println(gc1.buscaPorCodigo("TP"));
        System.out.println(gc1.buscaPorCodigo("AD"));

        System.out.println("\n --- Busca por nome Cias ---");

        System.out.println(gc1.buscaPorNome("latam linhas aereas"));
        System.out.println(gc1.buscaPorNome("Gol linhas aereas"));
        System.out.println(gc1.buscaPorNome("TAP portugal"));
        System.out.println(gc1.buscaPorNome("Azul linhas aereas"));

        //Aeronasves e gerenciador de arenaves
        System.out.println("\n--------------------- AERONAVES ---------------------");

        GerenciadorAeronaves ga1 = new GerenciadorAeronaves();

        Aeronave a1 = new Aeronave("733","Boeing 737-300",140);
        Aeronave a2 = new Aeronave("73G","Boeing 737-700",126);
        Aeronave a3 = new Aeronave("380","Airbus Industrie A380",644);
        Aeronave a4 = new Aeronave("764","Boeing 767-400",140);

        ga1.addAeronave(a1);
        ga1.addAeronave(a2);
        ga1.addAeronave(a3);
        ga1.addAeronave(a4);

        ga1.listaTodas();

        System.out.println("\n --- Busca por nome Aeronaves ---");

        System.out.println(ga1.buscaPorCodigo("733"));
        System.out.println(ga1.buscaPorCodigo("73G"));
        System.out.println(ga1.buscaPorCodigo("380"));
        System.out.println(ga1.buscaPorCodigo("764"));


        //Aeroporto e gerenciador de aeroporto
        System.out.println("\n--------------------- AEROPORTOS ---------------------");

        Aeroporto ap1 = new Aeroporto("POA","Salgado Filho Intl Apt",-29.9939,-51.1711);
        Aeroporto ap2 = new Aeroporto("GRU","São Paulo Guarulhos Intl Apt",-23.4356,-46.4731);
        Aeroporto ap3 = new Aeroporto("LIS","Lisbon",38.7742,-9.1342);
        Aeroporto ap4 = new Aeroporto("MIA","Miami International Apt",25.7933,-80.2906);

        GerenciadorAeroporto gap = new GerenciadorAeroporto();

        gap.addAeroporto(ap1);
        gap.addAeroporto(ap2);
        gap.addAeroporto(ap3);
        gap.addAeroporto(ap4);

        gap.listaTodos();

        System.out.println("\n --- Busca Por Codigo Aeroporto ---");

        System.out.println(gap.buscaPorCodigo("POA"));
        System.out.println(gap.buscaPorCodigo("GRU"));
        System.out.println(gap.buscaPorCodigo("LIS"));
        System.out.println(gap.buscaPorCodigo("MIA"));

        System.out.println("\n --- Compara Aerorto ---");
        System.out.println(gap.ordenaDescricaoAp());

        //Rotas e gerenciador de Rotas
        System.out.println("\n--------------------- Rotas ---------------------");

        Rota r1 = new Rota(c1,ap1,ap2,a1);
        Rota r2 = new Rota(c1,ap2,ap1,a1);
        Rota r3 = new Rota(c3,ap4,ap3,a2);
        Rota r4 = new Rota(c1,ap1,ap2,a1);

        GerenciadorRota gr1 = new GerenciadorRota();

        gr1.addRota(r1);
        gr1.addRota(r2);
        gr1.addRota(r3);
        gr1.addRota(r4);

        gr1.listaTodas();

        System.out.println("\n --- Busca por Origem Rotas");//

        System.out.println(gr1.buscaPorOrigem("POA"));
        System.out.println(gr1.buscaPorOrigem("GRU"));
        //System.out.println(gr1.buscaPorOrigem("LIS"));
        System.out.println(gr1.buscaPorOrigem("MIA"));

        System.out.println("\n --- Compara Rotas---");

        System.out.println(gr1.ordenaDescricaoR());

        //Voos e gerenciador de Voo
        System.out.println("\n--------------------- Voos ---------------------");

        Voo v1 = new Voo(2016,8,10,8,10,90,r1, Voo.Status.ATRASADO);
        Voo v2 = new Voo(2017,9,11,15,25,120,r2,Voo.Status.CONFIRMADO);
        Voo v3 = new Voo(2018,10,15,12,20,120,r3,Voo.Status.CANCELADO);

        GerenciadorVoo gv1 = new GerenciadorVoo();

        gv1.addVoo(v1);
        gv1.addVoo(v2);
        gv1.addVoo(v3);

        gv1.listarTodos();

        //Arrumei
        System.out.println("\n -------- Busca por data --------- ");

        System.out.println(gv1.buscaPorData(10,8,2016));
        System.out.println(gv1.buscaPorData(11,9,2017));
        System.out.println(gv1.buscaPorData(15,10,2018));

        System.out.println("\n ----- Calculando Distancias entre Pontos -----");

        Geo g1 = gap.getGeo("POA");
        Geo g2 = gap.getGeo("GRU");

        System.out.println("Distancia calculada de POA ate GRU: " + Geo.distancia(g1,g2));

        System.out.println("\n --------- Voo Varias Escalas ---------");

        VooVariasEscalas vve1 = new VooVariasEscalas(2016,8,10,5,45,120,r1, Voo.Status.CONFIRMADO);
        vve1.addRota(r2);
        VooVariasEscalas vve2 = new VooVariasEscalas(2017,9,11,6,50,110,r2, Voo.Status.CANCELADO);
        vve2.addRota(r3);
        VooVariasEscalas vve3 = new VooVariasEscalas(2018,10,12,7,20,90,r3, Voo.Status.ATRASADO);
        vve3.addRota(r4);

        System.out.println("\n ---- Voo Varias Escalas 1 ---- ");
        System.out.println(vve1.toString());

        System.out.println("\n ---- Voo Varias Escalas 2 ---- ");
        System.out.println(vve2.toString());

        System.out.println("\n ---- Voo Varias Escalas 3 ---- ");
        System.out.println(vve3.toString());

    }
}