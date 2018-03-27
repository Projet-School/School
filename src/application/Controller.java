package application;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.stage.Window;
	 
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
			//Window win = but.getScene().getWindow();
			if(id.getText().isEmpty()) {
				error.setVisible(true);
				password.setText("");
			}
			
			if(password.getText().isEmpty() || password.getText() != "password") {
				error.setVisible(true);
				password.setText("");
			}
		}
		
}
