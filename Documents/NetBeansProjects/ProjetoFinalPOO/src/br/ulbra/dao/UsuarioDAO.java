package br.ulbra.dao;

import br.ulbra.config.ConnectionFactory;
import br.ulbra.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    private Connection con;

    public UsuarioDAO() throws SQLException {
        con = new ConnectionFactory().getConnection();
    }

    // Método para validar o login (email e senha)
    public boolean validarLogin(String email, String senha) {
        
        String sql = "SELECT * FROM usuario WHERE emailusu = ? AND senhausu = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            // Substituindo os parâmetros na consulta SQL
            stmt.setString(1, email);
            stmt.setString(2, senha);

            // Executa a consulta
            ResultSet rs = stmt.executeQuery();

            // Se encontrar algum usuário com o email e a senha fornecidos
            if (rs.next()) {
                // O login foi bem-sucedido
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Se não encontrar o usuário, o login falha
        return false;
    }
    
    
}
