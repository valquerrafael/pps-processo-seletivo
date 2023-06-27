import handler.*;
import model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("Doutorado", 25);
        Titulo titulo2 = new Titulo("Mestrado", 18);
        Titulo titulo3 = new Titulo("Especialista", 10);

        Experiencia experiencia1 = new Experiencia(
                "Magisterio em IF", 6, 1, 12
        );
        Experiencia experiencia2 = new Experiencia(
                "Magisterio em educação superior", 3, 1, 7
        );
        Experiencia experiencia3 = new Experiencia(
                "Magisterio em ensino médio", 8, 1, 6
        );

        Candidato candA = new Candidato(
                "4.266.073",
                "Valquer",
                69,
                List.of(new Titulo[]{titulo1, titulo2, titulo3}),
                List.of(new Experiencia[]{experiencia1, experiencia2, experiencia3})
        );
        Candidato candB = new Candidato(
                "5.177.184",
                "Rita",
                100,
                List.of(new Titulo[]{titulo2, titulo3}),
                List.of(new Experiencia[]{experiencia1, experiencia2})
        );
        Candidato candC = new Candidato(
                "6.388.295",
                "Targino",
                70,
                List.of(new Titulo[]{titulo1, titulo2, titulo3}),
                List.of(new Experiencia[]{experiencia2, experiencia3})
        );

        Handler desempenho = new DesempenhoHandler();
        Handler titulo = new TituloHandler();
        Handler experiencia = new ExperienciaHandler();
        Handler total = new TotalHandler();

        desempenho.setNext(titulo);
        titulo.setNext(experiencia);
        experiencia.setNext(total);

        List<Candidato> candidatos = new ArrayList<>(Arrays.asList(candA, candB, candC));

        for (Candidato candidato : candidatos) {
            desempenho.handle(candidato);
        }

        candidatos.sort(Comparator.comparing(Candidato::getPontuacaoTotal).reversed());

        for (Candidato candidato : candidatos) {
            System.out.println();
            System.out.println((candidatos.indexOf(candidato) + 1) + "° Lugar - " + candidato.getNome() +  " - " + candidato.getPontuacaoTotal() + " pontos");
        }
    }
}
