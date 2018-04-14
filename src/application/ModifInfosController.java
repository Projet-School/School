package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ModifInfosController implements Initializable{

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
	
	// m�thode pour initialiser la page avec les informations de la personne concern�
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

	// m�thode pour retourner � la page d'accueil
	@FXML
	private void homeAction(ActionEvent event) {
		try {
			Main.changeScene("Connected.fxml");
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
			} catch (IOException er) {
				er.printStackTrace();
			}
		}
	}
		
	// m�thode pour sauvegarder les changements
	@FXML
	private void saveAction(ActionEvent event) {
		// appliquer les changements dans la base de donn�es
		
	}
	
	// m�thode pour supprimer un agent
	@FXML
	private void suppAgentAction(ActionEvent event) {
		// appliquer les changements dans la base de donn�es
			
	}
}
