// Aluno.java
package br.model;

import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private String senha;
    private List<Disciplina> disciplinasMatriculadas;

    public Aluno(String nome, String matricula, String senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getSenha() {
        return senha;
    }

    public List<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void matricular(Disciplina disciplina) {
        disciplinasMatriculadas.add(disciplina);
    }

    public void cancelarMatricula(Disciplina disciplina) {
        disciplinasMatriculadas.remove(disciplina);
    }
}