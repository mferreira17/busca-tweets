package dev.bearded.apibuscatweets.model;

public class Tweet {

    private String usuario;
    private String nomeTela;
    private String texto;
    private String urlImagemPerfil;

    public Tweet(String usuario, String nomeTela, String texto, String urlImagemPerfil) {
        this.usuario = usuario;
        this.nomeTela = nomeTela;
        this.texto = texto;
        this.urlImagemPerfil = urlImagemPerfil;
    }

    public String getNomeTela() {
        return nomeTela;
    }

    public void setNomeTela(String nomeTela) {
        this.nomeTela = nomeTela;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUrlImagemPerfil() {
        return urlImagemPerfil;
    }

    public void setUrlImagemPerfil(String urlImagemPerfil) {
        this.urlImagemPerfil = urlImagemPerfil;
    }


}
