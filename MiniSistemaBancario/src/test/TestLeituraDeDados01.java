package test;

import dominio.LeituraDeDados;

import javax.swing.*;

public class TestLeituraDeDados01 {
    public static void main(String[] args) throws Exception {
        LeituraDeDados leitura = new LeituraDeDados();

        String caminhoArquivo = "/home/matheus/Documentos/GitHub/ProjetoMiniContaBancaria-A-Terminar/MiniSistemaBancario/dados/dados.txt";

        String resultado = leitura.ler(caminhoArquivo);
        System.out.println(resultado);

    }
}
