package View;

import Controller.FuncionarioController;
import Model.Funcionario;

import java.util.List;
import java.util.Date;

public class FuncionarioView {

    public static void listarFuncionarios() {
        FuncionarioController funcionarioController = new FuncionarioController();
        List<Funcionario> funcionarios = funcionarioController.listarFuncionarios();

        System.out.println("=== Lista de Funcionários ===");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Código: " + funcionario.getCod_func());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Nome: " + funcionario.getPrimeiro_nome() + " " + funcionario.getUltimo_nome());
            System.out.println("Endereço: " + funcionario.getEndereco_func());
            System.out.println("Data de Nascimento: " + funcionario.getData_nasc());
            System.out.println("DDD: " + funcionario.getDdd_func());
            System.out.println("Telefone: " + funcionario.getTelefone_func());
            System.out.println("Departamento: " + funcionario.getDepartamento_cod_dep());
            System.out.println("==============================");
        }
    }

    public static void adicionarFuncionario(String cpf, String primeiroNome, String ultimoNome, String enderecoFunc, Date dataNasc, int ddd, int telefone, int departamentoCodDep) {
        FuncionarioController funcionarioController = new FuncionarioController();
        funcionarioController.adicionarFuncionario(cpf, primeiroNome, ultimoNome, enderecoFunc, dataNasc, ddd, telefone, departamentoCodDep);
    }

    public static void atualizarFuncionario(int codFunc, String cpf, String primeiroNome, String ultimoNome, String enderecoFunc, Date dataNasc, int ddd, int telefone, int departamentoCodDep) {
        FuncionarioController funcionarioController = new FuncionarioController();
        funcionarioController.atualizarFuncionario(codFunc, cpf, primeiroNome, ultimoNome, enderecoFunc, dataNasc, ddd, telefone, departamentoCodDep);
    }

    public static void excluirFuncionario(int codFunc) {
        FuncionarioController funcionarioController = new FuncionarioController();
        funcionarioController.excluirFuncionario(codFunc);
    }
}
