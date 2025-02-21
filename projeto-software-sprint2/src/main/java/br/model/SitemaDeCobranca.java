// SistemaDeCobranca.java
package br.service;

import br.model.Aluno;

public class SistemaDeCobranca {
    public void notificarCobranca(Aluno aluno) {
        System.out.println("Cobrança enviada para o aluno: " + aluno.getNome());
    }
}