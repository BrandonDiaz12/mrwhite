import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecutarScriptSQL {

    public static void main(String[] args) {
        String url =
        String usuario = 
        String senha = 

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            Statement statement = conexao.createStatement();

            // Execute cada comando SQL do seu script aqui
            String scriptSQL = "CREATE DATABASE IF NOT EXISTS nome_do_banco;";
            statement.executeUpdate(scriptSQL);

            // Adicione mais comandos SQL conforme necessário

            statement.close();
            conexao.close();
            System.out.println("Script SQL executado com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao executar o script SQL: " + e.getMessage());
        }
    }
}