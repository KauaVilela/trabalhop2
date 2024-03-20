package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexão.conexao;
import entity.Professor;

public class ProfessorDAO {
    public void cadastrarprofessor(Professor professor){
    String sql = "INSERT INTO PROFESSOR (ID, NOME, DATANASCIMENTO, EMAIL, TELEFONE , TIPO, NUMERO_FUNCIONARIO) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, professor.getId());
            ps.setString(2, professor.getNome());
            ps.setString(3, professor.getDataNascimento());
            ps.setString(4, professor.getEmail());
            ps.setString(5, professor.getTelefone());
            ps.setString(6, professor.getTipo());
            ps.setString(7, professor.getNumeroDeFuncionario());
            ps.execute();
            ps.close();
            conexao.getConexao().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void excluirprofessor(Professor professor){
        String sql = "DELETE FROM PROFESSOR WHERE ID = ?";
        PreparedStatement ps = null;
        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, professor.getId());
            ps.execute();
            ps.close();
            conexao.getConexao().close();
    } catch (Exception e) {
        e.printStackTrace();
    }    
}
    
}
