public class Aviao extends BaseVeiculos {

    private int numeroDosAssentos;
    private int codigoIdentificacao;
    private Float alcanceMax;
    private Float altitudeMax;
    private Float velocidadeMax;
    private int capacidadeTotal;
    
    public Int numeroDosAssentos() {
        return assentos;
    }
    public void setNumeroDosAssentos(int numeroDosAssentos) {
        this.numeroDosAssentos = numeroDosAssentos;
    }
    public int getCodigoIdentificacao() {
        return codigoIdentificacao;
    }
    public void setCodigoIdentificacao(String CodigoIdentificacao) {
        this.CodigoIdentificacao = CodigoIdentificacao;
    }
    public Float getAlcanceMax() {
        return alcanceMax;
    }
    public void setAlcanceMax(Float alcanceMax) {
        this.alcanceMax = alcanceMax;
    }
    public Float getAltitudeMax() {
        return altitudeMax;
    }
    public void setAltitudeMax(Float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }
    public Float getVelocidadeMax() {
        return velocidadeMax;
    }
    public void setVelocidadeMax(Float velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }
    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }
    
    public Aviao(int codigo, String chassi, String nome, String modelo, int anoModelo, int anoFabricacao,
            String fabricante, String nomeProprietario, String modelo2, int eixos, double pesoLiquido, double pesoTotal,
            int portas, int rodas, String tipoCombustivel, String estadoUF, String cidadeUF, String tipoVeiculo,
            int qtdeMotores, int qtdeOcupantes, int numeroDosAssentos, int CodigoIdentificacao, Float alcanceMax, Float altitudeMax,
            Float velocidadeMax, int capacidadeTotal) {
        super(codigo, chassi, nome, modelo, anoModelo, anoFabricacao, fabricante, nomeProprietario, modelo2, eixos,
                pesoLiquido, pesoTotal, portas, rodas, tipoCombustivel, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores,
                qtdeOcupantes);
        this.numeroDosAssentos = numeroDosAssentos;
        this.codigoIdentificacao = codigoIdentificacao;
        this.alcanceMax = alcanceMax;
        this.altitudeMax = altitudeMax;
        this.velocidadeMax = velocidadeMax;
        this.capacidadeTotal = capacidadeTotal;
    }
    @Override
    public void Imprimir() {
       
        System.out.println("\n\n");
        System.out.println("------------------------");
        System.out.println("Avião:");
        System.out.println("Código: " +this.codigo);
        System.out.println("Chassi: " +this.chassi);
        System.out.println("Nome: " +this.nome);
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Ano do Modelo: " +this.anoModelo);
        System.out.println("Ano de fabricacão: " +this.anoFabricacao);
        System.out.println("Fabricante: " +this.fabricante);
        System.out.println("Nome do Proprietário: " +this.nomeProprietario);
        System.out.println("Eixos: " +this.eixos);
        System.out.println("Peso Liquido: " +this.pesoLiquido);
        System.out.println("Peso Total: " +this.pesoTotal);
        System.out.println("Quantidade de Portas: " +this.portas);
        System.out.println("Quantidade de rodas: " +this.rodas);
        System.out.println("Tipo de Combustível: " +this.tipoCombustivel);
        System.out.println("Estado: " +this.estadoUF);
        System.out.println("Cidade: " +this.cidadeUF);
        System.out.println("Tipo de Veículo: " +this.tipoVeiculo);
        System.out.println("Quantidade de Motores: " +this.qtdeMotores);
        System.out.println("Quantidade de Ocupantes: " +this.qtdeOcupantes);
        System.out.println("Assentos: " +this.numeroDosAssentos);
        System.out.println("Número de Série: " +this.codigoIdentificacao);
        System.out.println("Alcance Máximo: " +this.alcanceMax);
        System.out.println("Altitude Máxima: " +this.altitudeMax);
        System.out.println("Velocidade Máxima: " +this.velocidadeMax);
        System.out.println("Capacidade Total: " +this.capacidadeTotal);
        System.out.println("------------------------");
    }
   
    @Override
    public String toString() {
        return "Aviao [numeroDosAssentos=" + numeroDosAssentos + ", codigoIdentificacao=" + codigoIdentificacao + ", alcanceMax=" + alcanceMax
                + ", altitudeMax=" + altitudeMax + ", velocidadeMax=" + velocidadeMax + ", capacidadeTotal="
                + capacidadeTotal + "]";
    }

}

