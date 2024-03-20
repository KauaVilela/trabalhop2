package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexão.conexao;
import entity.Aluno;


/**
 * AlunoDAO
 */
public class AlunoDAO {
    public void cadastraraluno(Aluno aluno){
        String sql = "INSERT INTO Aluno (ID, NOME, DATA_NASCIMENTO, EMAIL, TELEFONE ,TIPO, MATRICULA) VALUES (?, ?, ?, ?, ?,?, ?)";
        PreparedStatement ps = null;
        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, aluno.getId());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getDataNascimento());
            ps.setString(4, aluno.getEmail());
            ps.setString(5, aluno.getTelefone());
            ps.setString(6, aluno.getTipo());
            ps.setString(7, aluno.getMatricula());
            ps.execute();
            ps.close();
            conexao.getConexao().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }       
    }
    public void excluirAluno(Aluno aluno){
        String sql = "DELETE FROM Aluno WHERE ID = ?";
        PreparedStatement ps = null;
        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, aluno.getId());
            ps.execute();
            ps.close();
            conexao.getConexao().close();
    } catch (Exception e) {
        e.printStackTrace();
    }    
}
}