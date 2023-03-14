package edu.daniel.projetos.desafiodominio;

public abstract class Conteudo {

    private String titulo;

    private String descricao;

    protected static double XP_PADRAO = 10d;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public static void setXpPadrao(double xpPadrao) {
        XP_PADRAO = xpPadrao;
    }
}