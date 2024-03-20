package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexão.conexao;
import entity.Gestoracademico;

public class GestoracademicoDAO {
    public void cadastrargestor(Gestoracademico Gestoracademico){
        String sql = "INSERT INTO GESTOR_ACADEMICO (ID, NOME, DATANASCIMENTO, EMAIL, TELEFONE , TIPO, SETOR) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, Gestoracademico.getId());
            ps.setString(2, Gestoracademico.getNome());
            ps.setString(3, Gestoracademico.getDataNascimento());
            ps.setString(4, Gestoracademico.getEmail());
            ps.setString(5, Gestoracademico.getTelefone());
            ps.setString(6, Gestoracademico.getTipo());
            ps.setString(7, Gestoracademico.getSetor());
            ps.execute();
            ps.close();
            conexao.getConexao().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void excluirgestor(Gestoracademico gestoracademico){
        String sql = "DELETE FROM GESTOR_ACADEMICO WHERE ID = ?";
        PreparedStatement ps = null;
        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, gestoracademico.getId());
            ps.execute();
            ps.close();
            conexao.getConexao().close();
    } catch (Exception e) {
        e.printStackTrace();
    }    
}
    
}
