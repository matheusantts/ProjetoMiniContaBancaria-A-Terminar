package menu;

import autenticacao.Cadastro;
import autenticacao.Login;

import java.util.Scanner;

public class MenuInicial {
    Scanner leitor = new Scanner(System.in);
    Cadastro cadastro = new Cadastro();
    Login login = new Login();

    public int imprimirMenuInical() {
        System.out.println("-----MENU INICIAL-----");
        System.out.println("ESCOLHA UMA OPCAO: ");
        System.out.println(" ");
        System.out.println("1 - Login: ");
        System.out.println("2 - Criar Conta: ");
        System.out.println("3 - Sair: ");

        return leitor.nextInt();
    }

    public void menuInicial() {
        int opcao = imprimirMenuInical();
        switch (opcao) {
            case 1:
                login.login();
                break;
            case 2:
                cadastro.cadastro();
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
