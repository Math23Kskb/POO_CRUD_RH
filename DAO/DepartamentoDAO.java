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
            stmt.setString(3, departamento.getEndereco());
            stmt.setInt(4, departamento.getDdd());
            stmt.setInt(5, departamento.getTelefone());
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
                departamento.setEndereco(rs.getString("ENDERECO"));
                departamento.setDdd(rs.getInt("DDD"));
                departamento.setTelefone(rs.getInt("TELEFONE"));
                departamentos.add(departamento);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departamentos;
    }
}