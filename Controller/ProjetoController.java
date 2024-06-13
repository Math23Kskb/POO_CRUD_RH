package Controller;

import DAO.ProjetoDAO;
import Model.Projeto;

import java.time.LocalDate;
import java.util.List;

public class ProjetoController {
    private ProjetoDAO projetoDAO;

    public ProjetoController() {
        this.projetoDAO = new ProjetoDAO();
    }

    public void adicionarProjeto(String nome, String dataInicio, String dataFim) {
        Projeto projeto = new Projeto();
        projeto.setNomeProj(nome);
        projeto.setDataInicio(LocalDate.parse(dataInicio));
        projeto.setDataFim(LocalDate.parse(dataFim));
        projetoDAO.adicionarProjeto(projeto);
    }

    public List<Projeto> listarProjetos() {
        return projetoDAO.listarProjetos();
    }

    public void atualizarProjeto(int codProj, String nome, String dataInicio, String dataFim) {
        Projeto projeto = new Projeto(codProj, nome, dataInicio, dataFim);
        projetoDAO.atualizarProjeto(projeto);
    }

    public void excluirProjeto(int codProj) {
        projetoDAO.excluirProjeto(codProj);
    }
}
