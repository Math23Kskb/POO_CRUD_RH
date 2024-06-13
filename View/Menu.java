package View;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Menu {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void exibirMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Menu Principal ===");
            System.out.println("1. Gerenciar Funcionários");
            System.out.println("2. Gerenciar Projetos");
            System.out.println("3. Gerenciar Departamentos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (escolha == 0) {
                break;
            }

            switch (escolha) {
                case 1:
                    gerenciarFuncionarios(scanner);
                    break;
                case 2:
                    gerenciarProjetos(scanner);
                    break;
                case 3:
                    gerenciarDepartamentos(scanner);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void gerenciarFuncionarios(Scanner scanner) {
        while (true) {
            System.out.println("=== Gerenciar Funcionários ===");
            System.out.println("1. Listar Funcionários");
            System.out.println("2. Adicionar Funcionário");
            System.out.println("3. Atualizar Funcionário");
            System.out.println("4. Excluir Funcionário");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (escolha == 0) {
                break;
            }

            switch (escolha) {
                case 1:
                    FuncionarioView.listarFuncionarios();
                    break;
                case 2:
                    adicionarFuncionario(scanner);
                    break;
                case 3:
                    atualizarFuncionario(scanner);
                    break;
                case 4:
                    excluirFuncionario(scanner);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void adicionarFuncionario(Scanner scanner) {
        try {
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Primeiro Nome: ");
            String primeiroNome = scanner.nextLine();
            System.out.print("Último Nome: ");
            String ultimoNome = scanner.nextLine();
            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();
            System.out.print("Data de Nascimento (dd/MM/yyyy): ");
            Date dataNasc = sdf.parse(scanner.nextLine());
            System.out.print("DDD: ");
            int ddd = scanner.nextInt();
            System.out.print("Telefone: ");
            int telefone = scanner.nextInt();
            System.out.print("Código do Departamento: ");
            int departamentoCodDep = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            FuncionarioView.adicionarFuncionario(cpf, primeiroNome, ultimoNome, endereco, dataNasc, ddd, telefone, departamentoCodDep);
        } catch (ParseException e) {
            System.out.println("Data inválida.");
        }
    }

    private static void atualizarFuncionario(Scanner scanner) {
        try {
            System.out.print("Código do Funcionário: ");
            int codFunc = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Primeiro Nome: ");
            String primeiroNome = scanner.nextLine();
            System.out.print("Último Nome: ");
            String ultimoNome = scanner.nextLine();
            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();
            System.out.print("Data de Nascimento (dd/MM/yyyy): ");
            Date dataNasc = sdf.parse(scanner.nextLine());
            System.out.print("DDD: ");
            int ddd = scanner.nextInt();
            System.out.print("Telefone: ");
            int telefone = scanner.nextInt();
            System.out.print("Código do Departamento: ");
            int departamentoCodDep = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            FuncionarioView.atualizarFuncionario(codFunc, cpf, primeiroNome, ultimoNome, endereco, dataNasc, ddd, telefone, departamentoCodDep);
        } catch (ParseException e) {
            System.out.println("Data inválida.");
        }
    }

    private static void excluirFuncionario(Scanner scanner) {
        System.out.print("Código do Funcionário: ");
        int codFunc = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        FuncionarioView.excluirFuncionario(codFunc);
    }

    private static void gerenciarProjetos(Scanner scanner) {
        while (true) {
            System.out.println("=== Gerenciar Projetos ===");
            System.out.println("1. Listar Projetos");
            System.out.println("2. Adicionar Projeto");
            System.out.println("3. Atualizar Projeto");
            System.out.println("4. Excluir Projeto");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (escolha == 0) {
                break;
            }

            switch (escolha) {
                case 1:
                    ProjetoView.listarProjetos();
                    break;
                case 2:
                    adicionarProjeto(scanner);
                    break;
                case 3:
                    atualizarProjeto(scanner);
                    break;
                case 4:
                    excluirProjeto(scanner);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void adicionarProjeto(Scanner scanner) {
        System.out.print("Nome do Projeto: ");
        String nome = scanner.nextLine();
        System.out.print("Data de Início (yyyy-MM-dd): ");
        String dataInicio = scanner.nextLine();
        System.out.print("Data de Término (yyyy-MM-dd): ");
        String dataFim = scanner.nextLine();

        ProjetoView.adicionarProjeto(nome, dataInicio, dataFim);
    }

    private static void atualizarProjeto(Scanner scanner) {
        System.out.print("Código do Projeto: ");
        int codProj = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Nome do Projeto: ");
        String nome = scanner.nextLine();
        System.out.print("Data de Início (yyyy-MM-dd): ");
        String dataInicio = scanner.nextLine();
        System.out.print("Data de Término (yyyy-MM-dd): ");
        String dataFim = scanner.nextLine();

        ProjetoView.atualizarProjeto(codProj, nome, dataInicio, dataFim);
    }

    private static void excluirProjeto(Scanner scanner) {
        System.out.print("Código do Projeto: ");
        int codProj = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        ProjetoView.excluirProjeto(codProj);
    }

    private static void gerenciarDepartamentos(Scanner scanner) {
        while (true) {
            System.out.println("=== Gerenciar Departamentos ===");
            System.out.println("1. Listar Departamentos");
            System.out.println("2. Adicionar Departamento");
            System.out.println("3. Atualizar Departamento");
            System.out.println("4. Excluir Departamento");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (escolha == 0) {
                break;
            }

            switch (escolha) {
                case 1:
                    DepartamentoView.listarDepartamentos();
                    break;
                case 2:
                    adicionarDepartamento(scanner);
                    break;
                case 3:
                    atualizarDepartamento(scanner);
                    break;
                case 4:
                    excluirDepartamento(scanner);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void adicionarDepartamento(Scanner scanner) {
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("DDD: ");
        int ddd = scanner.nextInt();
        System.out.print("Telefone: ");
        int telefone = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        DepartamentoView.adicionarDepartamento(cnpj, nome, endereco, ddd, telefone);
    }

    private static void atualizarDepartamento(Scanner scanner) {
        System.out.print("Código do Departamento: ");
        int codDep = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("DDD: ");
        int ddd = scanner.nextInt();
        System.out.print("Telefone: ");
        int telefone = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        DepartamentoView.atualizarDepartamento(codDep, cnpj, nome, endereco, ddd, telefone);
    }

    private static void excluirDepartamento(Scanner scanner) {
        System.out.print("Código do Departamento: ");
        int codDep = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        DepartamentoView.excluirDepartamento(codDep);
    }
}
