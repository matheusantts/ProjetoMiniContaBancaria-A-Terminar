void main() {

}

public class Main {
    public void MenuInicial () {
        // Menu Inical
        System.out.println("----------");


        int opcao = 0;
        switch (opcao) {
            case 1:
                // Login
                break;
            case 2:
                // Criar Conta
                break;
            case 3:
                System.out.println("Saindo...");
                System.out.println("Volte sempre");
                break;
            default:
                System.out.println("Oopcao Invalida!");
                MenuInicial();
        }
    }
    public static void main(String[] args) {

    }
}