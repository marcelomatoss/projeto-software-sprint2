// MatriculaController.java
package br.controller;

import br.model.Aluno;
import br.model.Disciplina;

public class MatriculaController {
    public boolean matricularAluno(Aluno aluno, Disciplina disciplina) {
        return disciplina.adicionarAluno(aluno);
    }
}