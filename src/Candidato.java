import java.util.List;

public class Candidato {

    private final String rg;
    private final String nome;
    private final int pontuacaoDesempenho;
    private final List<Titulo> titulos;
    private final List<Experiencia> experiencias;
    private int pontuacaoTitulos;
    private int pontuacaoExperiencias;

    public Candidato(String rg, String nome, int pontuacaoDesempenho, List<Titulo> titulos, List<Experiencia> experiencias) {
        this.rg = rg;
        this.nome = nome;
        this.pontuacaoDesempenho = pontuacaoDesempenho;
        this.titulos = titulos;
        this.experiencias = experiencias;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacaoDesempenho() {
        return pontuacaoDesempenho;
    }

    public List<Titulo> getTitulos() {
        return titulos;
    }

    public List<Experiencia> getExperiencias() {
        return experiencias;
    }

    public int getPontuacaoTitulos() {
        return pontuacaoTitulos;
    }

    public void setPontuacaoTitulos(int pontuacaoTitulos) {
        this.pontuacaoTitulos = pontuacaoTitulos;
    }

    public int getPontuacaoExperiencias() {
        return pontuacaoExperiencias;
    }

    public void setPontuacaoExperiencias(int pontuacaoExperiencias) {
        this.pontuacaoExperiencias = pontuacaoExperiencias;
    }

    public int getPontuacaoTotal() {
        return pontuacaoDesempenho + pontuacaoTitulos + pontuacaoExperiencias;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "rg='" + rg + '\'' +
                ", nome='" + nome + '\'' +
                ", pontuacaoDesempenho=" + pontuacaoDesempenho +
                ", titulos=" + titulos +
                ", experiencias=" + experiencias +
                ", pontuacaoTitulos=" + pontuacaoTitulos +
                ", pontuacaoTotal=" + getPontuacaoTotal() +
                '}';
    }
}
