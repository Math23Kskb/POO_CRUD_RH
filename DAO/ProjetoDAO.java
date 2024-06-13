package DAO;

import Model.Projeto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProjetoDAO {
    private Connection connection;

    public ProjetoDAO() {
        this.connection = DatabaseConnection.getConnection();
    }

    public void adicionarProjeto(Projeto projeto) {
        String sql = "INSERT INTO PROJETO (NOME, DATA_INICIO, DATA_FIM) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, projeto.getNomeProj());
            stmt.setDate(2, Date.valueOf(projeto.getDataInicio()));
            stmt.setDate(3, Date.valueOf(projeto.getDataFim()));
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Projeto> listarProjetos() {
        List<Projeto> projetos = new ArrayList<>();
        String sql = "SELECT * FROM PROJETO";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Projeto projeto = new Projeto();
                projeto.setCodProj(rs.getInt("COD_PROJ"));
                projeto.setNomeProj(rs.getString("NOME"));
                projeto.setDataInicio(rs.getDate("DATA_INICIO").toLocalDate());
                projeto.setDataFim(rs.getDate("DATA_FIM").toLocalDate());
                projetos.add(projeto);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return projetos;
    }

    public void atualizarProjeto(Projeto projeto) {
        String sql = "UPDATE PROJETO SET NOME = ?, DATA_INICIO = ?, DATA_FIM = ? WHERE COD_PROJ = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, projeto.getNomeProj());
            stmt.setDate(2, Date.valueOf(projeto.getDataInicio()));
            stmt.setDate(3, Date.valueOf(projeto.getDataFim()));
            stmt.setInt(4, projeto.getCodProj());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirProjeto(int codProj) {
        String sql = "DELETE FROM PROJETO WHERE COD_PROJ = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codProj);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
