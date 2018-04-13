package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
	 
// le controller du fichier Connexion.fxml
public class ConnexionController {

		@FXML
		private TextField id;
		
		@FXML
		private PasswordField password;
		
		@FXML
		private Button buttonCon;
		
		@FXML
		private Button buttonSign;
		
		@FXML
		private Label error;
		
		@FXML
		private void connexionAction(ActionEvent event) {
		if(event.getSource()== buttonSign) {
			try {
				Main.changeScene("SignIn.fxml");
			} catch (IOException e) {
				System.err.println(e.getMessage());
				System.out.println("Impossible d'afficher la page d'inscription !");
			}
		}
		
		else {
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
				} catch (IOException e) {
					System.err.println(e.getMessage());
					System.out.println("Impossible d'afficher la page home !");
				}
			}
		}
		}
		
}
