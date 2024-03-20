package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexão.conexao;
import entity.Pessoa;

public class PessoaDAO {
    public void cadastrarpessoa(Pessoa pessoa){
        String sql = "INSERT INTO PESSOA (ID, NOME, DATANASCIMENTO, EMAIL, TELEFONE , TIPO) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, pessoa.getId());
            ps.setString(2, pessoa.getNome());
            ps.setString(3, pessoa.getDataNascimento());
            ps.setString(4, pessoa.getEmail());
            ps.setString(5, pessoa.getTelefone());
            ps.setString(6, pessoa.getTipo());
            ps.execute();
            ps.close();
            conexao.getConexao().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void excluirpessoa(Pessoa pessoa){
        String sql = "DELETE FROM PESSOA WHERE ID = ?";
        PreparedStatement ps = null;
        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, pessoa.getId());
            ps.execute();
            ps.close();
            conexao.getConexao().close();
    } catch (Exception e) {
        e.printStackTrace();
    }    
}
    
}
