// Matricula.java
package br.model;

import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Disciplina disciplina;
    private Date data;

    public Matricula(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.data = new Date();
    }
}