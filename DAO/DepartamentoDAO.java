package DAO;

import Model.Departamento;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoDAO {
    private Connection connection;

    public DepartamentoDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "usuario", "senha");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void adicionarDepartamento(Departamento departamento) {
        String sql = "INSERT INTO DEPARTAMENTO (CNPJ, NOME, ENDERECO, DDD, TELEFONE) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, departamento.getCnpj());
            stmt.setString(2, departamento.getNome());
            stmt.setString(3, departamento.getEndereco_dep());
            stmt.setInt(4, departamento.getDdd_dep());
            stmt.setInt(5, departamento.getTelefone_dep());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Departamento> listarDepartamentos() {
        List<Departamento> departamentos = new ArrayList<>();
        String sql = "SELECT * FROM DEPARTAMENTO";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Departamento departamento = new Departamento();
                departamento.setCodDep(rs.getInt("COD_DEP"));
                departamento.setCnpj(rs.getString("CNPJ"));
                departamento.setNome(rs.getString("NOME"));
                departamento.setEndereco_dep(rs.getString("ENDERECO"));
                departamento.setDdd_dep(rs.getInt("DDD"));
                departamento.setTelefone_dep(rs.getInt("TELEFONE"));
                departamentos.add(departamento);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departamentos;
    }

    public void atualizarDepartamento(Departamento departamento) {
        String sql = "UPDATE DEPARTAMENTO SET CNPJ = ?, NOME = ?, ENDERECO = ?, DDD = ?, TELEFONE = ? WHERE COD_DEP = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, departamento.getCnpj());
            stmt.setString(2, departamento.getNome());
            stmt.setString(3, departamento.getEndereco_dep());
            stmt.setInt(4, departamento.getDdd_dep());
            stmt.setInt(5, departamento.getTelefone_dep());
            stmt.setInt(6, departamento.getCodDep());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirDepartamento(int codDep) {
        String sql = "DELETE FROM DEPARTAMENTO WHERE COD_DEP = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codDep);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
