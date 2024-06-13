package View;

import Controller.DepartamentoController;
import Model.Departamento;

import java.util.List;

public class DepartamentoView {
    public static void listarDepartamentos() {
        DepartamentoController departamentoController = new DepartamentoController();
        List<Departamento> departamentos = departamentoController.listarDepartamentos();

        System.out.println("=== Lista de Departamentos ===");
        for (Departamento departamento : departamentos) {
            System.out.println("Código: " + departamento.getCodDep());
            System.out.println("CNPJ: " + departamento.getCnpj());
            System.out.println("Nome: " + departamento.getNome());
            System.out.println("Endereço: " + departamento.getEndereco_dep());
            System.out.println("DDD: " + departamento.getDdd_dep());
            System.out.println("Telefone: " + departamento.getTelefone_dep());
            System.out.println("==============================");
        }
    }

    public static void adicionarDepartamento(String cnpj, String nome, String endereco, int ddd, int telefone) {
        DepartamentoController departamentoController = new DepartamentoController();
        departamentoController.adicionarDepartamento(cnpj, nome, endereco, ddd, telefone);
    }

    public static void atualizarDepartamento(int codDep, String cnpj, String nome, String endereco, int ddd, int telefone) {
        DepartamentoController departamentoController = new DepartamentoController();
        departamentoController.atualizarDepartamento(codDep, cnpj, nome, endereco, ddd, telefone);
    }

    public static void excluirDepartamento(int codDep) {
        DepartamentoController departamentoController = new DepartamentoController();
        departamentoController.excluirDepartamento(codDep);
    }
}
