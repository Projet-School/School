package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
	 
public class Controller {

		@FXML
		private TextField id;
		
		@FXML
		private PasswordField password;
		
		@FXML
		private Button but;
		
		@FXML
		private Label error;
		
		@FXML
		private void connexionAction(ActionEvent event) {
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
					Parent home_page = FXMLLoader.load(getClass().getResource("Connected.fxml"));
					Scene home_scene = new Scene(home_page);
					Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
					home_stage.setScene(home_scene);
					home_stage.show();
				} catch (IOException e) {
					System.out.println("Impossible d'afficher la page !");
				}
			}
		}
		
}
