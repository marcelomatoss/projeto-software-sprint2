// SistemaDeMatriculas.java
package br.service;

import br.model.Aluno;
import br.model.Disciplina;

public class SistemaDeMatriculas {
    public boolean efetuarMatricula(Aluno aluno, Disciplina disciplina) {
        return disciplina.adicionarAluno(aluno);
    }
}