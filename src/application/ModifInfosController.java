package application;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import com.mysql.jdbc.PreparedStatement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ModifInfosController extends Connexion implements Initializable {

	public ModifInfosController() {
		super(cn);
	}

	@FXML private TextField id;
	@FXML private TextField password;
	@FXML private TextField nom; 
	@FXML private TextField prenom; 
	@FXML private TextField matiere; 
	@FXML private Label labMatiere;
	@FXML private Label header;
	
	@FXML private Button buttonHome;
	@FXML private Button buttonSave;
	
	public void modif(String nom, String prenom, String login, String passwd) {
		connect();
		String sql = null;
		String sql2 = null;
		String s = null;
		String id = null;
		ResultSet rs = null;
		try {
			sql = "UPDATE connexion SET login = ?, passwd = ? WHERE login = ?";
			PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
			ps.setString(1, login);
			ps.setString(2, passwd);
			ps.setString(3, Main.getUser().getIdIndividu());
			ps.executeUpdate();
			String sql3 = "SELECT IdConnexion, statut FROM connexion WHERE login = ?";
			PreparedStatement ps3 = (PreparedStatement) cn.prepareStatement(sql3);
			ps3.setString(1, login);
			rs = ps3.executeQuery();
			while (rs.next()) {
				id = rs.getString("IdConnexion");
				s = rs.getString("statut");
			}
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
	

	// m�thode pour retourner � la page d'accueil
	@FXML
	private void homeAction(ActionEvent event) {
		try {
			Main.changeScene("Connected.fxml");
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Information");
			alert.setHeaderText("Les modifications n'ont pas �t� sauvegard� !");
			alert.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// m�thode pour int�ragir avec la touche �chap et retourner � l'accueil
	@FXML
	private void keyAction(KeyEvent e) {
		if(e.getCode() == KeyCode.ESCAPE) {
			try {
				Main.changeScene("Connected.fxml");
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Information");
				alert.setHeaderText("Les modifications n'ont pas �t� sauvegard� !");
				alert.showAndWait();
			} catch (IOException er) {
				er.printStackTrace();
			}
		}
	}
		
	// m�thode pour sauvegarder les changements
	@FXML
	private void saveAction(ActionEvent event) {
		// appliquer les changements dans la base de donn�es
		modif(nom.getText(), prenom.getText(), id.getText(), password.getText());
		
		Main.getUser().setIdIndividu(id.getText());
		Main.getUser().setPassword(password.getText());
		Main.getUser().setNomIndividu(nom.getText());
		Main.getUser().setPrenomIndividu(prenom.getText());
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information");
		alert.setHeaderText("Les modifications ont �t� sauvegard� !");
		alert.showAndWait();
		try {
			Main.changeScene("Connected.fxml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialize(URL arg0, ResourceBundle arg1) {
		id.setText(Main.getUser().getIdIndividu());
		password.setText(Main.getUser().getPassword());
		nom.setText(Main.getUser().getNomIndividu());
		prenom.setText(Main.getUser().getPrenomIndividu());
		
		if(Main.getUser().getStatut().equals("Enseignant")) {
			matiere.setVisible(true);
			labMatiere.setVisible(true);
			matiere.setText(Main.getUser().getMatiere());
		}
	}
}
