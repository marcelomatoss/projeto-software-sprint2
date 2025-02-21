// Disciplina.java
package br.model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String codigo;
    private Professor professor;
    private List<Aluno> alunosMatriculados = new ArrayList<>();
    private final int capacidadeMaxima = 60;

    public Disciplina(String nome, String codigo, Professor professor) {
        this.nome = nome;
        this.codigo = codigo;
        this.professor = professor;
    }

    public boolean adicionarAluno(Aluno aluno) {
        if (alunosMatriculados.size() < capacidadeMaxima) {
            alunosMatriculados.add(aluno);
            return true;
        }
        return false;
    }
}