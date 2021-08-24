package br.unisul.aula.primeirospring.model;

public class Mensagem {
    private int codigo;
    private String titulo;
    private String mensagem;

    public Mensagem() {
    }

    public Mensagem(int codigo, String titulo, String mensagem) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.mensagem = mensagem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
