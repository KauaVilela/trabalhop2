package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexão.conexao;
import entity.Disciplina;
import entity.Professor;

public class DisciplinaDAO {
    public void cadastrardisciplina(Disciplina disciplina, Professor professor) {
        String sql = "INSERT INTO DISCIPLINA (ID, NOME, CARGAHORARIA, PROFESSOR_ID) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, disciplina.getId());
            ps.setString(2, disciplina.getNome());
            ps.setInt(3, disciplina.getCargaHoraria());
            ps.setInt(4, professor.getId());
            ps.execute();
            ps.close();
            conexao.getConexao().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void excluirdisciplina(Disciplina disciplina) {
        String sql = "DELETE FROM DISCIPLINA WHERE ID = ?";
        PreparedStatement ps = null;
        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, disciplina.getId());
            ps.execute();
            ps.close();
            conexao.getConexao().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
