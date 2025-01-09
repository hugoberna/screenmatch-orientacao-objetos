import br.com.alura.screenmatch.modelos.Albuns;
import br.com.alura.screenmatch.modelos.Musica;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setNome("Teste");
        minhaMusica.setArtista("Akon");
        minhaMusica.setAnoLancamento(2024);

        minhaMusica.exibeFichaTecnica();

        Albuns meuAlbum = new Albuns();

        meuAlbum.setNome("Testando");
        meuAlbum.setArtista("Hugo");
        meuAlbum.setAnoLancamento(2024);
        meuAlbum.setQuantidadeDeFaixas(10);

        meuAlbum.exibeFichaTecnica();




    }
}