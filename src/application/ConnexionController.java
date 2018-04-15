package application;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
	 
// le controller du fichier Connexion.fxml
public class ConnexionController extends Connexion {
	
		public ConnexionController() {
			super(cn);
		}
	
		@FXML private TextField id;
		
		@FXML private PasswordField password;
		
		@FXML private Button buttonCon;
		@FXML private Button buttonSign;
		@FXML private Label error;
		
		
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
	
		// M�thode pour r�cup�rer ce que l'utilisateur a tap� et compar�
		@FXML
		private void connexionAction(ActionEvent event) {
			// si c'est le bouton pour s'inscrire
			if(event.getSource()== buttonSign) {
				try {
					Main.changeScene("SignIn.fxml");
				} catch (IOException e) {
					System.err.println(e.getMessage());
					System.out.println("Impossible d'afficher la page d'inscription !");
				}
			}
			else { // si c'est le bouton connexion
				if(connexion(id.getText(), password.getText())) {	
	 				try {
						Main.changeScene("Connected.fxml");
						System.out.println(info(id.getText()));
	 				} catch (IOException e) {
						System.err.println(e.getMessage());
						System.out.println("Impossible d'afficher la page home !");
	 				}
	 			}
				else {
					error.setVisible(true);
					password.setText("");
				}			
			}
		}
		
		// m�thode pour se connecter en appuyant sur entrer 
		@FXML
		private void keyAction(KeyEvent e) {
			if(e.getCode() == KeyCode.ENTER) {
				if(id.getText().isEmpty()) {
					error.setVisible(true);
					password.setText("");
				}
				
				if(!password.getText().equals("password")) {
					error.setVisible(true);
					password.setText("");
				}
				else {
					try {
						Main.changeScene("Connected.fxml");
					} catch (IOException er) {
						System.err.println(er.getMessage());
						System.out.println("Impossible d'afficher la page home !");
					}
				}
			}
		}
}