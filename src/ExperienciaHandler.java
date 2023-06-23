public class ExperienciaHandler extends BaseHandler {

    @Override
    public void handle(Candidato candidato) {
        int pontuacao = 0;

        for (Experiencia experiencia : candidato.getExperiencias()) {
            pontuacao += experiencia.getPontuacao();
        }

        candidato.setPontuacaoExperiencias(pontuacao);

        System.out.println(candidato.getNome() + " - Nota prova de titulos (dimensão de experiencias): " + candidato.getPontuacaoExperiencias());

        if (this.next != null) {
            this.next.handle(candidato);
        }
    }

}
