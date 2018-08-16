
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class SdzConnection {

	/**
	 * URL de connection
	 */
	private static String url = "jdbc:postgresql://localhost:5432/Ecole";

	/**
	 * Nom du user
	 */
	private static String user = "postgres";

	/**
	 * Mot de passe du user
	 */
	private static String passwd = "root";

	/**
	 * Objet Connection
	 */
	private static Connection connect;

	/**
	 * Méthode qui va retourner notre instance et la créer si elle n'existe pas...
	 * 
	 * @return
	 */
	public static Connection getInstance() {
		if (connect == null) {
			try {
				connect = DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "ERREUR DE CONNEXION ! ",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		return connect;
	}
}