package menu;

import dominio.ContaBancaria;

import java.util.Scanner;

public class MenuPrincipal {
    ContaBancaria contaBancaria = new ContaBancaria();
    Scanner leitor = new Scanner(System.in);

    public void menuPrincipal() {
        int opcao = imprimeMenuPrincipal();
        switch (opcao) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                System.out.println("Opcao Invalida!");
                menuPrincipal();
        }
    }

    public int imprimeMenuPrincipal() {
        System.out.println("-----SISTEMA BANCARIO-----");
        System.out.println(" ");
        System.out.println("ESCOLHA UMA OPCAO: ");
        System.out.println("1: Deposito");
        System.out.println("2: Saque");
        System.out.println("3: Consulta de Saldo");
        System.out.println("4: Sair");

        return leitor.nextInt();
    }
}
