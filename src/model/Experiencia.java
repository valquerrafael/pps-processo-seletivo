package model;

public class Experiencia {

    private final String nome;
    private final int periodo;
    private final int pontuacaoPeriodo;
    private final int pontuacaoMaxima;

    public Experiencia(String nome, int periodo, int pontuacaoPeriodo, int pontuacaoMaxima) {
        this.nome = nome;
        this.periodo = periodo;
        this.pontuacaoPeriodo = pontuacaoPeriodo;
        this.pontuacaoMaxima = pontuacaoMaxima;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return Math.min(periodo * pontuacaoPeriodo, pontuacaoMaxima);
    }

}
