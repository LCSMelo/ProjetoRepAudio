package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {

    private String interprete;

    private String album;

    private String genero;

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 20000){
            return 10;
        } else {
            return 8;
        }
    }
}



