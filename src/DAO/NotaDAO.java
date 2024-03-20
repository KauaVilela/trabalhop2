package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexão.conexao;
import entity.Aluno;
import entity.Disciplina;
import entity.Nota;

public class NotaDAO {
    public void cadastrarnota(Nota nota, Aluno aluno, Disciplina disciplina){
        String sql = "INSERT INTO NOTA (ID, NOTAP1, NOTAP2, ALUNO_ID, DISCIPLINA_ID) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, nota.getId());
            ps.setDouble(2, nota.getNotap1());
            ps.setDouble(3, nota.getNotap2());
            ps.setInt(4, aluno.getId());
            ps.setInt(5, disciplina.getId());
            ps.execute();
            ps.close();
            conexao.getConexao().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void excluirnota(Nota nota){
        String sql = "DELETE FROM NOTA WHERE ID = ?";
        PreparedStatement ps = null;
        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, nota.getId());
            ps.execute();
            ps.close();
            conexao.getConexao().close();
    } catch (Exception e) {
        e.printStackTrace();
    }    
}
    
}
