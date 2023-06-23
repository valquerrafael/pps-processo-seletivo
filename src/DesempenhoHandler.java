public class DesempenhoHandler extends BaseHandler {

    @Override
    public void handle(Candidato candidato) {
        System.out.println(candidato.getNome() + " - Nota prova de desempenho: " + candidato.getPontuacaoDesempenho());
        if (candidato.getPontuacaoDesempenho() >= 70) {
            if (this.next != null) {
                this.next.handle(candidato);
            }
        } else {
            System.out.println(candidato.getNome() + " eliminado na prova de desempenho!");
        }
    }

}
