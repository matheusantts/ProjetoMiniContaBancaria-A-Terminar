package dominio;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraDeDados {

    public void leituraDeArquivo() throws IOException {
        String caminhoArquivo = "MiniSistemaBancario/dados/dados.txt";
        BufferedReader leitor = null;
        try {
            FileReader leitorArquivo = new FileReader(caminhoArquivo);
            leitor = new BufferedReader(leitorArquivo);
            String linha;
            do {
                linha = leitor.readLine();
            } while (linha != null);
        } catch (Exception erro) {
            System.out.println("Houve um problema ao receber os dados: " + erro.getMessage());
        } finally {
            if (leitor != null) {
                leitor.close();
            }
        }
    }

    public String ler(String caminhoArquivo) throws Exception {
        String conteudo = "";

        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha = leitor.readLine();
            while (linha != null) {
                conteudo += linha;
                linha = leitor.readLine();
                if (linha != null) {
                    conteudo += "\n";
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao ler dados");
        }

        return conteudo;
    }

    public void lerTodasAsLinhas(String caminhoArquivo) throws Exception {
        try {
            Path caminhos = Paths.get(caminhoArquivo);
            List<String> resultadoLista = Files.readAllLines(caminhos);
            String conteudo = String.join("\n", resultadoLista);
            System.out.println(conteudo);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao ler dados");
        }
    }
}
