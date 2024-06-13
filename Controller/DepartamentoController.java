package Controller;

import DAO.DepartamentoDAO;
import Model.Departamento;

import java.util.List;

public class DepartamentoController {
    private DepartamentoDAO departamentoDAO;

    public DepartamentoController() {
        this.departamentoDAO = new DepartamentoDAO();
    }

    public void adicionarDepartamento(String cnpj, String nome, String endereco, int ddd, int telefone) {
        Departamento departamento = new Departamento();
        departamento.setCnpj(cnpj);
        departamento.setNome(nome);
        departamento.setEndereco_dep(endereco);
        departamento.setDdd_dep(ddd);
        departamento.setTelefone_dep(telefone);
        departamentoDAO.adicionarDepartamento(departamento);
    }

    public List<Departamento> listarDepartamentos() {
        return departamentoDAO.listarDepartamentos();
    }

    public void atualizarDepartamento(int codDep, String cnpj, String nome, String endereco, int ddd, int telefone) {
        Departamento departamento = new Departamento(codDep, cnpj, nome, endereco, ddd, telefone);
        departamentoDAO.atualizarDepartamento(departamento);
    }

    public void excluirDepartamento(int codDep) {
        departamentoDAO.excluirDepartamento(codDep);
    }
}
