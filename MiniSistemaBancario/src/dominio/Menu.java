package dominio;

import java.util.Scanner;

public class Menu {

    public void menuInicial () {
        Scanner leitor = new Scanner(System.in);
        System.out.println("-----MENU INICIAL-----");
        // menu
        System.out.print("ESCOLHA UMA OPCAO: ");
        int opcao = leitor.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("-----LOGIN-----");
                break;
            case 2:
                System.out.println("-----CRIAR CONTA-----");
                break;
            case 3:
                System.out.println("Saindo...");
                System.out.println("Volte sempre");
                break;
            default:
                System.out.println("Oopcao Invalida!");
                menuInicial();
        }
    }
}
