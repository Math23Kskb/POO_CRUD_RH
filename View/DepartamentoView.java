package View;

import DAO.DepartamentoDAO;
import Model.Departamento;
import java.util.List;

public class DepartamentoView {
    public static void listarDepartamentos() {
        DepartamentoDAO departamentoDAO = new DepartamentoDAO();
        List<Departamento> departamentos = departamentoDAO.listarDepartamentos();

        System.out.println("=== Lista de Departamentos ===");
        for (Departamento departamento : departamentos) {
            System.out.println("Código: " + departamento.getCodDep());
            System.out.println("CNPJ: " + departamento.getCnpj());
            System.out.println("Nome: " + departamento.getNome());
            System.out.println("Endereço: " + departamento.getEndereco());
            System.out.println("DDD: " + departamento.getDdd());
            System.out.println("Telefone: " + departamento.getTelefone());
            System.out.println("==============================");
        }
    }

}
