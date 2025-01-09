package br.com.alura.screenmatch.modelos;

public class Albuns extends Titulo{

    private int quantidadeDeFaixas;

    public int getQuantidadeDeFaixas() {
        return quantidadeDeFaixas;
    }

    public void setQuantidadeDeFaixas(int quantidadeDeFaixas) {
        this.quantidadeDeFaixas = quantidadeDeFaixas;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Album: " + getNome());
        System.out.println(getArtista());
        System.out.println(getAnoLancamento());
        System.out.println(getQuantidadeDeFaixas() + " faixas");
        System.out.println("Total de avaliações: " + getTotalAvaliacoes());
        System.out.println("Média de avaliações: " + pegaMedia());
    }
}
