package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.*;

public class ConnectedController implements Initializable {

	@FXML Button menu;
	@FXML Button dec;
	
	public void initialize(URL location, ResourceBundle resources) {
		Image menuIcon = new Image("icon/menu.png",40,40,false,false);
		Image decoIcon = new Image("icon/deco.png",40,40,false,false);
		menu.setGraphic(new ImageView(menuIcon));
		dec.setGraphic(new ImageView(decoIcon));
	}

	@FXML
	private void showMenuAction(ActionEvent event) {
		
	}
	
	@FXML
	private void decoAction(ActionEvent event) {
		try {
			Main.changeScene("Connexion.fxml");
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Information");
			alert.setHeaderText("Vous avez été déconnecté avec succès");
			alert.showAndWait();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.out.println("Impossible de vous déconnecter !");
		}
	}
}
