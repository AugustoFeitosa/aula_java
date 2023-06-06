package lutador;

public class Lutador {
    //Atributos
    private String nomeLutador;
    private String nacionalidade;
    private int idadeLutador;
    private double alturaLutador;
    private int pesoLutador;
    private String categoriaDePeso;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos
    public Lutador(String nomeLutador, String nacionalidade, int idadeLutador, double alturaLutador, int pesoLutador) {
        this.nomeLutador = nomeLutador;
        this.nacionalidade = nacionalidade;
        this.idadeLutador = idadeLutador;
        this.alturaLutador = alturaLutador;
        this.pesoLutador = pesoLutador;
    }

    public String getNomeLutador() {
        return nomeLutador;
    }

    public void setNomeLutador(String nomeLutador) {
        this.nomeLutador = nomeLutador;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdadeLutador() {
        return idadeLutador;
    }

    public void setIdadeLutador(int idadeLutador) {
        this.idadeLutador = idadeLutador;
    }

    public double getAlturaLutador() {
        return alturaLutador;
    }

    public void setAlturaLutador(double alturaLutador) {
        this.alturaLutador = alturaLutador;
    }

    public int getPesoLutador() {
        return pesoLutador;
    }


    public void setPesoLutador(int pesoLutador) {
        this.pesoLutador = pesoLutador;
    }

    public String getCategoriaDePeso() {
        return categoriaDePeso;
    }

    public void setCategoriaDePeso(String categoriaDePeso) {
        this.categoriaDePeso = categoriaDePeso;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar(){

    }
    
    public void status(){

    }
    public int ganharLuta(){

    }
    public int perderLuta(){

    }

    public int empatarLuta(){

    }
}
