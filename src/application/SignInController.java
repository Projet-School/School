package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
public class SignInController {

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
	@FXML private TextField langParle; 
	
	@FXML private Button buttonSignIn;
	@FXML private Button buttonHome;
	
	@FXML
	private void signInAction(ActionEvent event) {
		
		if(id.getText().isEmpty() || mail.getText().isEmpty() || password.getText().isEmpty() || nom.getText().isEmpty() || prenom.getText().isEmpty() || dateNaiss.getText().isEmpty() || lieuNaiss.getText().isEmpty() || langParle.getText().isEmpty() || nivEtude.getText().isEmpty() || domEtude.getText().isEmpty() || genre.getSelectionModel().isEmpty()) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Information");
			alert.setHeaderText("Il manque des informations !");
			alert.showAndWait();
		}
		else {
			try {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Information");
				alert.setHeaderText("Votre inscription a été pris en compte.");
				alert.setContentText("Vous allez être redirigé sur la page de connexion.");
				alert.showAndWait();
				
				Main.changeScene("Connexion.fxml");
			} catch (IOException e) {
			}
		}
	}
	
	@FXML
	private void homeAction(ActionEvent event) {
		try {
			Main.changeScene("Connexion.fxml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
