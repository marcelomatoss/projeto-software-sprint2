// SistemaDeMatriculasTest.java
package br.test;

import br.model.Aluno;
import br.model.Disciplina;
import br.service.SistemaDeMatriculas;

public class SistemaDeMatriculasTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Marcelo Matos", "689916", "senha123");
        Disciplina disciplina = new Disciplina("Matemática", "MAT101", null);
        
        SistemaDeMatriculas sistema = new SistemaDeMatriculas();
        boolean resultado = sistema.efetuarMatricula(aluno, disciplina);
        
        System.out.println("Matrícula realizada: " + resultado);
    }
}