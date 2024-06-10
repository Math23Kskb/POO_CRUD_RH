package Controller;

import DAO.DepartamentoDAO;
import Model.Departamento;
import java.util.List;


public class DepartamentoController {
    private DepartamentoDAO departamentoDAO;

    public void add(Departamento departamento) {
        departamentoDAO.adicionarDepartamento(departamento);
    }

    public List<Departamento> getAllDepartamentos() {
        return departamentoDAO.listarDepartamentos();
    }
}
