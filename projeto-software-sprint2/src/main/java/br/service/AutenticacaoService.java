// AutenticacaoService.java
package br.service;

public class AutenticacaoService {
    public boolean autenticar(String matricula, String senha) {
        return matricula.equals("admin") && senha.equals("1234");
    }
}