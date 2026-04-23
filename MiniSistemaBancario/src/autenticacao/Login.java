package autenticacao;

import menu.MenuPrincipal;

public class Login {
    public void login() {
        ServicoLogin servicoLogin = new ServicoLogin();
        MenuPrincipal menuPrincipal = new MenuPrincipal();

        if (servicoLogin.servicoLogin()) {
            System.out.println("LOGIN EFETUADO COM SUCESSO!");
            menuPrincipal.menuPrincipal();
        }
    }
}
