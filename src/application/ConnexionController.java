package application;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
	 
// le controller du fichier Connexion.fxml
public class ConnexionController {
	
		@FXML
		private TextField id;
		
		@FXML
		private PasswordField password;
		
		@FXML
		private Button but;
		
		@FXML
		private Label error;
	
		private String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
		private String login = "root";
		private String passwd = "";
		Connection cn = null;
		Statement st = null;
		
		public void connect() {
			try {
				//Etape 1 : Chargement du driver
				Class.forName("com.mysql.jdbc.Driver");
				//Etape 2 : récupération de la connexion
				cn = DriverManager.getConnection(url, login, passwd);
				st = cn.createStatement();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			catch (ClassNotFoundException f) {
				f.printStackTrace();
			} 
		}
		
		public void close() {
			try {
				//Etape 5 : libérer ressources de la mémoire
				cn.close();
				st.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public boolean connexion (String login, String mdp) {
			connect();
			ResultSet rs = null;
			Boolean b = false;
			try {
				String sql = "SELECT login, passwd FROM connexion WHERE login = ?";
				PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
				ps.setString(1, login);
				rs = ps.executeQuery();
				while (rs.next()) {
					if((login.equals(rs.getString("login"))) && (mdp.equals(rs.getString("passwd")))){
						b = true;
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				close();
			}
			return b;
		}
	
		@FXML
		private void connexionAction(ActionEvent event) {
			if(id.getText().isEmpty()) {
				error.setVisible(true);
				password.setText("");
			}	
			if(connexion(id.getText(), password.getText())) {	
				try {
					Parent home_page = FXMLLoader.load(getClass().getResource("Connected.fxml"));
					Scene home_scene = new Scene(home_page);
					Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
					home_stage.setScene(home_scene);
					home_stage.show();
				} catch (IOException e) {
					System.out.println("Impossible d'afficher la page !");
				}
			}
			else {
				error.setVisible(true);
				password.setText("");
			}		
			
		}
		
}
