package autenticacao;

import dominio.ContaBancaria;

public class ServicoCadastro {
    ContaBancaria novoUsuario = new ContaBancaria();

    public boolean servicoCadastro() {
        return true;
    }

    public void ColetarDadosCadastro() {
        String nome = "Matheus";
        int numero = 1;
        double saldo = 0;
        String senha = "matheus123";

        verificaSenha(senha);

        // ler nome do titular
        // criar numero da conta (conta 1,2,3...)
        // setar saldo padrao em 0
        // ler senha, e criar variavel para verificar (se digitar errado a segunda vez obriga a digiar de novo

    }

    public void verificaSenha(String senha) {
        System.out.println("Digite sua senha novamente: ");
        String verificacao = "matheus123";

        if (verificacao != senha) {
            verificaSenha(senha);
        }
    }

    public void CadastroNoBancoDeDados() {

    }
}
