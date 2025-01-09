package br.com.alura.screenmatch.modelos;

public class Titulo {

    private String nome, artista;
    private int anoLancamento;
    private double somaAvaliacoes;
    private int totalAvaliacoes;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println(nome);
        System.out.println(artista);
        System.out.println(anoLancamento);
        System.out.println("Total de avaliações: " + totalAvaliacoes);
        System.out.println("Média de avaliações: " + pegaMedia());
    }

    public void avalia (double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }
}
