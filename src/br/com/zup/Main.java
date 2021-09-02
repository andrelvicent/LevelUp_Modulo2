package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> alunos = new HashMap<String, String>();
        boolean chave = true;
        System.out.println("---- Seja bem vindo ao André Classroom ----");
        int opcao = 0;

        while (chave == true) {

            // Menu - Apresentar uma série de opcoes pro usuario
            System.out.println("Digite 1: Para cadastrar um aluno");
            System.out.println("Digite 2: Para exibir a lista");
            System.out.println("Digite 3: Para sair do programa");

            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                // Cadastrar um aluno
                System.out.println("Digite o nome Completo do aluno: ");
                String nome = leitor.nextLine();
                System.out.println("Digite o seu telefone: ");
                String telefone = leitor.nextLine();
                System.out.println("Digite o seu e-mail: ");
                String email = leitor.nextLine();

                // Fazendo o cadastro
                alunos.put(email, "Nome: " + nome + " Telefone: " + telefone);
            } else if (opcao == 2) {

                for (String chaveAluno : alunos.keySet()) {
                    System.out.println("Contato: " + alunos.get(chaveAluno) + " Email: " + chaveAluno);
                }

            } else if (opcao == 3) {
                // Sair do menu
                chave = false;
            } else {
                System.out.println("Por favor, digite um valor válido. ");
            }
        }


    }
}
