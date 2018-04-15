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
public class ConnexionController {
	
		@FXML private TextField id;
		
		@FXML private PasswordField password;
		
		@FXML private Button buttonCon;
		@FXML private Button buttonSign;
		@FXML private Label error;
	
		private String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
		private String login = "root";
		//private String passwd = "";
		private String passwd = "d";
		Connection cn = null;
		Statement st = null;
		
		// m�thode pour se connecter � la base de donn�es
		public void connect() {
			try {
				//Etape 1 : Chargement du driver
				Class.forName("com.mysql.jdbc.Driver");
				//Etape 2 : r�cup�ration de la connexion
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
				//Etape 3 : lib�rer ressources de la m�moire
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
		
		//Permet de r�cup�rer les informations d'une personne gr�ce � son login
		public ArrayList<String> info(String login) {		
			connect();
			ResultSet rs = null;
			ResultSet rs2 = null;
			ArrayList<String> info = new ArrayList<String>();
			String statut = null;
			String i = null;
			String sql2 = "";
			int cpt = 1;
			int max;
			try {
				String sql = "SELECT idConnexion, statut FROM connexion WHERE login = ?";
				PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
				ps.setString(1, login);
				rs = ps.executeQuery();
				while (rs.next()) {
					statut = rs.getString("statut");
					i = rs.getString("idConnexion");
				}
				if(statut.equals("enseignant")) {
					sql2 = "SELECT * FROM enseignant WHERE Id_Connexion = ?";
					max = 7;
				}
				else {
					sql2 = "SELECT * FROM etudiant WHERE Id_Connexion = ?";
					max = 4;
				}
				PreparedStatement ps2 = (PreparedStatement) cn.prepareStatement(sql2);
				ps2.setString(1, i);
				rs2 = ps2.executeQuery();
				while (rs2.next()) {
					while(cpt <= max){
						info.add(rs2.getString(cpt));
						cpt++;
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				close();
			}
			return info;			
		}
		
		//Permet de r�cup�rer le statut d'une personne
		public String statut(String login) {
			connect();
			String statut = null;;
			ResultSet rs = null;
			try {
				String sql = "SELECT statut FROM connexion WHERE login = ?";
				PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
				ps.setString(1, login);
				rs = ps.executeQuery();
				while (rs.next()) {
					statut = rs.getString("statut");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				close();
			}
			return statut;
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