package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnetionFactory {
	public Connection getConnection() {
		String banco = System.getenv("tipoBanco");
		try {
			Connection conexao = DriverManager.getConnection("jdbc:" + banco + "://localhost:3306/Meubanco", "root",
					"203040"); // recebe a string de connexao

			return conexao; // retorna a conexão
		} catch (SQLException e) {

			throw new RuntimeException(e);
		}
	}

}