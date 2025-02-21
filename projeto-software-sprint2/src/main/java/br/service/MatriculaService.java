// MatriculaService.java
package br.service;

import br.model.Aluno;
import br.model.Disciplina;

public class MatriculaService {
    public boolean realizarMatricula(Aluno aluno, Disciplina disciplina) {
        return disciplina.adicionarAluno(aluno);
    }
}