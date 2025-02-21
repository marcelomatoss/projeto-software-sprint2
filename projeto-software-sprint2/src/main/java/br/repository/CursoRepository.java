// CursoRepository.java
package br.repository;

import br.model.Curso;
import java.util.ArrayList;
import java.util.List;

public class CursoRepository {
    private List<Curso> cursos = new ArrayList<>();

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public List<Curso> listarCursos() {
        return cursos;
    }
}