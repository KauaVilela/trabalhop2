package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexão.conexao;
import entity.Aluno;
import entity.Disciplina;

/**
 * AlunonaDisciplina
 */
public class AlunonaDisciplinaDAO {
    public void cadastrardisciplina(Disciplina disciplina, Aluno aluno) {
        String sql = "INSERT INTO AlunoDisciplina (aluno_id, disciplina_id) VALUES (?, ?)";
        PreparedStatement ps = null;
        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, aluno.getId());
            ps.setInt(2, disciplina.getId());
            ps.execute();
            ps.close();
            conexao.getConexao().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}