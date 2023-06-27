package model;

public class Titulo {

    private final String nome;
    private final int pontuacaoMaxima;

    public Titulo(String nome, int pontuacaoMaxima) {
        this.nome = nome;
        this.pontuacaoMaxima = pontuacaoMaxima;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacaoMaxima;
    }

}
