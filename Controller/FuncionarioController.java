package Controller;

import DAO.FuncionarioDAO;
import Model.Funcionario;

import java.util.List;

public class FuncionarioController {
    private FuncionarioDAO funcionarioDAO;

    public FuncionarioController() {
        this.funcionarioDAO = new FuncionarioDAO();
    }

    public void adicionarFuncionario(String cpf, String primeiroNome, String ultimoNome, String enderecoFunc, java.util.Date dataNasc, int ddd, int telefone, int departamentoCodDep) {
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf(cpf);
        funcionario.setPrimeiro_nome(primeiroNome);
        funcionario.setUltimo_nome(ultimoNome);
        funcionario.setEndereco_func(enderecoFunc);
        funcionario.setData_nasc(dataNasc);
        funcionario.setDdd_func(ddd);
        funcionario.setTelefone_func(telefone);
        funcionario.setDepartamento_cod_dep(departamentoCodDep);
        funcionarioDAO.adicionarFuncionario(funcionario);
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarioDAO.listarFuncionarios();
    }

    public void atualizarFuncionario(int codFunc, String cpf, String primeiroNome, String ultimoNome, String enderecoFunc, java.util.Date dataNasc, int ddd, int telefone, int departamentoCodDep) {
        Funcionario funcionario = new Funcionario(codFunc, cpf, primeiroNome, ultimoNome, enderecoFunc, dataNasc, ddd, telefone, departamentoCodDep);
        funcionarioDAO.atualizarFuncionario(funcionario);
    }

    public void excluirFuncionario(int codFunc) {
        funcionarioDAO.excluirFuncionario(codFunc);
    }
}
