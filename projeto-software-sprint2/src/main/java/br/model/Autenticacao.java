// Autenticacao.java
package br.model;

public class Autenticacao {
    public boolean login(String matricula, String senha) {
        return matricula.equals("admin") && senha.equals("1234");
    }
    
    public void logout() {
        System.out.println("Usuário deslogado.");
    }
}