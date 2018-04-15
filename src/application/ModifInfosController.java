package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mysql.jdbc.PreparedStatement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ModifInfosController extends Connexion implements Initializable {

	public ModifInfosController() {
		super(cn);
	}

	@FXML private TextField id;
	@FXML private TextField mail;
	@FXML private TextField password;
	@FXML private TextField nom; 
	@FXML private TextField prenom; 
	@FXML private ChoiceBox<String> genre; 
	@FXML private TextField dateNaiss; 
	@FXML private TextField lieuNaiss;
	@FXML private TextField nivEtude; 
	@FXML private TextField domEtude; 
	@FXML private ChoiceBox<String> function; 
	@FXML private Button buttonHome;
	@FXML private Button buttonSave;
	@FXML private Button buttonSuppAgent;
	
	public void modif(String nom, String prenom, String statut, String login, String passwd) {
		connect();
		String sql = null;
		String sql2 = null;
		try {
			sql = "UPDATE connexion SET login = ?, passwd = ? WHERE login = ?";
			PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
			ps.setString(1, login);
			ps.setString(2, passwd);
			ps.setString(3, login);
			ps.executeUpdate();
			String s = statut(login);
			String id = id(login);
			if (s.equals("Enseignant")) {
				sql2 = "UPDATE enseignant SET nomEnseignant = ?, prenomEnseignant = ? WHERE Id_Connexion = ?";
			}
			else {
				sql2 = "UPDATE etudiant SET nomEtudiant = ?, prenomEtudiant = ? WHERE Id_Connexion = ?";
			}
			PreparedStatement ps2 = (PreparedStatement) cn.prepareStatement(sql2);
			ps2.setString(1, nom);
			ps2.setString(2, prenom);
			ps2.setString(3, id);
			ps2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	
	// méthode pour initialiser la page avec les informations de la personne concerné
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

	// méthode pour retourner à la page d'accueil
	@FXML
	private void homeAction(ActionEvent event) {
		try {
			Main.changeScene("Connected.fxml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// méthode pour intéragir avec la touche échap et retourner à l'accueil
	@FXML
	private void keyAction(KeyEvent e) {
		if(e.getCode() == KeyCode.ESCAPE) {
			try {
				Main.changeScene("Connected.fxml");
			} catch (IOException er) {
				er.printStackTrace();
			}
		}
	}
		
	// méthode pour sauvegarder les changements
	@FXML
	private void saveAction(ActionEvent event) {
		// appliquer les changements dans la base de données
	}
	
	// méthode pour supprimer un agent
	@FXML
	private void suppAgentAction(ActionEvent event) {
		// appliquer les changements dans la base de données
			
	}
}
