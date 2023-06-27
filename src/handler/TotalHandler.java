package handler;

import model.Candidato;

public class TotalHandler extends BaseHandler {

    @Override
    public void handle(Candidato candidato) {
        System.out.println(candidato.getNome() + " - Nota final: " + candidato.getPontuacaoTotal());
    }

}
