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
                System.out.println("-----DEPOSITO-----");
                System.out.print("\n Digite o valor a ser depositado: R$");
                double valorDeposito = leitor.nextDouble();
                contaBancaria.setSaldo(valorDeposito);
                menuPrincipal();
                break;
            case 2:
                System.out.println("-----SAQUE-----");
                System.out.print("\n Digite o valor de saque: R$");
                double valorSaque = leitor.nextDouble();
                contaBancaria.saque(valorSaque);
                menuPrincipal();
                break;
            case 3:
                System.out.println("-----CONSULTA DE SALDO-----");
                System.out.println("\nSeu saldo disponivel e de: R$" + contaBancaria.getSaldo());
                menuPrincipal();
                break;
            case 4:
                System.out.println("Encerrando...");
                System.out.println("Volte Sempre!");
                break;
            default:
                System.out.println("Opcao Invalida!");
                menuPrincipal();
        }
    }

    public int imprimeMenuPrincipal() {
        System.out.println("\n-----SISTEMA BANCARIO-----");
        System.out.println(" ");
        System.out.println("ESCOLHA UMA OPCAO: ");
        System.out.println("1: Deposito");
        System.out.println("2: Saque");
        System.out.println("3: Consulta de Saldo");
        System.out.println("4: Encerrar Servico");

        return leitor.nextInt();
    }
}
