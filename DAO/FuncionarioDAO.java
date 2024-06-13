package DAO;

import Model.Funcionario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
    private Connection connection;

    public FuncionarioDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "usuario", "senha");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        String sql = "INSERT INTO FUNCIONARIO (CPF, PRIMEIRO_NOME, ULTIMO_NOME, ENDERECO_FUNC, DATA_NASC, DDD_FUNC, TELEFONE_FUNC, DEPARTAMENTO_COD_DEP) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, funcionario.getCpf());
            stmt.setString(2, funcionario.getPrimeiro_nome());
            stmt.setString(3, funcionario.getUltimo_nome());
            stmt.setString(4, funcionario.getEndereco_func());
            stmt.setDate(5, new java.sql.Date(funcionario.getData_nasc().getTime()));
            stmt.setInt(6, funcionario.getDdd_func());
            stmt.setInt(7, funcionario.getTelefone_func());
            stmt.setInt(8, funcionario.getDepartamento_cod_dep());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Funcionario> listarFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM FUNCIONARIO";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setCod_func(rs.getInt("COD_FUNC"));
                funcionario.setCpf(rs.getString("CPF"));
                funcionario.setPrimeiro_nome(rs.getString("PRIMEIRO_NOME"));
                funcionario.setUltimo_nome(rs.getString("ULTIMO_NOME"));
                funcionario.setEndereco_func(rs.getString("ENDERECO_FUNC"));
                funcionario.setData_nasc(rs.getDate("DATA_NASC"));
                funcionario.setDdd_func(rs.getInt("DDD_FUNC"));
                funcionario.setTelefone_func(rs.getInt("TELEFONE_FUNC"));
                funcionario.setDepartamento_cod_dep(rs.getInt("DEPARTAMENTO_COD_DEP"));
                funcionarios.add(funcionario);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return funcionarios;
    }

    public void atualizarFuncionario(Funcionario funcionario) {
        String sql = "UPDATE FUNCIONARIO SET CPF = ?, PRIMEIRO_NOME = ?, ULTIMO_NOME = ?, ENDERECO_FUNC = ?, DATA_NASC = ?, DDD_FUNC = ?, TELEFONE_FUNC = ?, DEPARTAMENTO_COD_DEP = ? WHERE COD_FUNC = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, funcionario.getCpf());
            stmt.setString(2, funcionario.getPrimeiro_nome());
            stmt.setString(3, funcionario.getUltimo_nome());
            stmt.setString(4, funcionario.getEndereco_func());
            stmt.setDate(5, new java.sql.Date(funcionario.getData_nasc().getTime()));
            stmt.setInt(6, funcionario.getDdd_func());
            stmt.setInt(7, funcionario.getTelefone_func());
            stmt.setInt(8, funcionario.getDepartamento_cod_dep());
            stmt.setInt(9, funcionario.getCod_func());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirFuncionario(int cod_func) {
        String sql = "DELETE FROM FUNCIONARIO WHERE COD_FUNC = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, cod_func);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
