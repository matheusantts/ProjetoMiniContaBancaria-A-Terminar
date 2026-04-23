package menu;

import dominio.ContaBancaria;

import java.util.Scanner;

public class MenuPrincipal {
    ContaBancaria contaBancaria = new ContaBancaria();
    Scanner leitor = new Scanner(System.in);

    public void menuPrincipal() {
        int opcao = imprimeMenuPrincipal();
    }

    public int imprimeMenuPrincipal() {
        System.out.println("-----SISTEMA BANCARIO-----");

        return leitor.nextInt();
    }
}
