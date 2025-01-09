package br.com.alura.screenmatch.modelos;

public class Musica extends Titulo {

    private double duracaoMinutos;
    private String feat;

    public double getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(double duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getFeat() {
        return feat;
    }

    public void setFeat(String feat) {
        this.feat = feat;
    }

    private boolean temFeat() {
        return feat != null && !feat.isEmpty();
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println(getNome());
        System.out.println(getArtista());
        System.out.println(getDuracaoMinutos());
        System.out.println(getAnoLancamento());
        if (temFeat()){
            System.out.println("Feat. " + getFeat());
        }
        System.out.println("Total de avaliações: " + getTotalAvaliacoes());
        System.out.println("Média de avaliações: " + pegaMedia());
    }
}
