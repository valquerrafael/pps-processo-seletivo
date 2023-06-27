package handler;

import model.Candidato;
import model.Titulo;

public class TituloHandler extends BaseHandler {

    @Override
    public void handle(Candidato candidato) {
        int pontuacao = 0;

        for (Titulo titulo : candidato.getTitulos()) {
            pontuacao += titulo.getPontuacao();
        }

        candidato.setPontuacaoTitulos(pontuacao);

        System.out.println(candidato.getNome() + " - Nota prova de titulos (dimensão de títulos): " + candidato.getPontuacaoTitulos());

        if (this.next != null) {
            this.next.handle(candidato);
        }
    }

}
