package View;

import Controller.ProjetoController;
import Model.Projeto;

import java.util.List;

public class ProjetoView {
    public static void listarProjetos() {
        ProjetoController projetoController = new ProjetoController();
        List<Projeto> projetos = projetoController.listarProjetos();

        System.out.println("=== Lista de Projetos ===");
        for (Projeto projeto : projetos) {
            System.out.println("Código: " + projeto.getCodProj());
            System.out.println("Nome: " + projeto.getNomeProj());
            System.out.println("Data de Início: " + projeto.getDataInicio());
            System.out.println("Data de Término: " + projeto.getDataFim());
            System.out.println("==========================");
        }
    }

    public static void adicionarProjeto(String nome, String dataInicio, String dataFim) {
        ProjetoController projetoController = new ProjetoController();
        projetoController.adicionarProjeto(nome, dataInicio, dataFim);
    }

    public static void atualizarProjeto(int codProj, String nome, String dataInicio, String dataFim) {
        ProjetoController projetoController = new ProjetoController();
        projetoController.atualizarProjeto(codProj, nome, dataInicio, dataFim);
    }

    public static void excluirProjeto(int codProj) {
        ProjetoController projetoController = new ProjetoController();
        projetoController.excluirProjeto(codProj);
    }
}
