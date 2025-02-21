// DisciplinaRepository.java
package br.repository;

import br.model.Disciplina;
import java.util.ArrayList;
import java.util.List;

public class DisciplinaRepository {
    private List<Disciplina> disciplinas = new ArrayList<>();

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> listarDisciplinas() {
        return disciplinas;
    }
}