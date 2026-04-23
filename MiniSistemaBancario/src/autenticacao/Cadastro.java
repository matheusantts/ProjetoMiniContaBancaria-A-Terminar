package autenticacao;

import menu.MenuPrincipal;

public class Cadastro {
    ServicoCadastro servicoCadastro = new ServicoCadastro();
    ServicoLogin servicoLogin = new ServicoLogin();
    MenuPrincipal menuPrincipal = new MenuPrincipal();

    public void cadastro() {
        if (servicoCadastro.servicoCadastro()) {
            System.out.println("USUARIO CADASTRADO COM SUCESSO!");
            if (servicoLogin.servicoLogin()) {
                System.out.println("LOGIN EFETUADO COM SUCESSO!");
                menuPrincipal.menuPrincipal();
            }
        }
    }
}
