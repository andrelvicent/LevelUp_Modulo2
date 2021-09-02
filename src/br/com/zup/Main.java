package br.com.zup;

import jdk.swing.interop.SwingInterOpUtils;

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
            System.out.println("Digite 3: Para remover um aluno da lista usando o email");
            System.out.println("Digite 4: Para sair do programa");

            // Ler opção desejada do menu
            opcao = leitor.nextInt();
            leitor.nextLine();

            // Cadastrar um usuário
            if (opcao == 1) {

                // Entrada de dados
                System.out.println("Digite o nome Completo do aluno: ");
                String nome = leitor.nextLine();
                System.out.println("Digite o seu telefone: ");
                String telefone = leitor.nextLine();
                System.out.println("Digite o seu e-mail: ");
                String email = leitor.nextLine();

                // Verificar emails duplicados
                if (alunos.size() != 0) {
                    for (String verificarChave : alunos.keySet()) {

                        if (verificarChave.equals(email)) {
                            System.out.println("Este email já foi cadastrado.");
                        } else {
                            alunos.put(email, "Nome: " + nome + " Telefone: " + telefone);
                            System.out.println("Usuário cadastrado com sucesso. ");
                        }
                    }
                } else {
                    alunos.put(email, "Nome: " + nome + " Telefone: " + telefone);
                    System.out.println("Usuário cadastrado com sucesso. ");
                }

            }

            // Listar usuários cadastrados
            else if (opcao == 2) {

                for (String chaveAluno : alunos.keySet()) {
                    System.out.println("Contato: " + alunos.get(chaveAluno) + " Email: " + chaveAluno);
                }

            }

            // Remover um usuário pelo email
            else if (opcao == 3) {
                System.out.println("Por favor, digite o email a ser deletado: ");
                String emailDeletado = "";
                String emailASerDeletado = leitor.nextLine();

                for (String emailAluno : alunos.keySet()) {

                    if (emailAluno.equals(emailASerDeletado)) {
                        System.out.println("Email deletado com sucesso. ");
                        emailDeletado = emailASerDeletado;
                        // alunos.remove(emailASerDeletado);
                        // break; Outra possibilidade
                    } else {
                        System.out.println("Email não encontrado. ");
                    }
                }
                alunos.remove(emailDeletado);
            }

            // Sair do menu
            else if (opcao == 4) {
                chave = false;
            }

            // Mensagem de erro para opções inválidas
            else {
                System.out.println("Por favor, digite um valor válido. ");
            }
        }
    }
}
