package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

// la classe controller de la page Connected.fxml
public class ConnectedController implements Initializable {

	@FXML AnchorPane leftPane;
	@FXML Button menu;
	@FXML Button dec;
	@FXML Button home;
	@FXML Button infos;
	@FXML Button cours;
	@FXML Button planning;
	
	@FXML Button espEtudiant;
	@FXML Button espEnseignant;
	@FXML Button espAdmin;
	@FXML Button espCompta;
	boolean vis = false;
	
	// Méthode pour initialiser la page avec les icones
	public void initialize(URL location, ResourceBundle resources) {
		Image menuIcon = new Image("icon/menu.png",40,40,false,false);
		Image decoIcon = new Image("icon/deco.png",40,40,false,false);
		menu.setGraphic(new ImageView(menuIcon));
		dec.setGraphic(new ImageView(decoIcon));
		home.setVisible(vis);
		infos.setVisible(vis);
		cours.setVisible(vis);
		planning.setVisible(vis);
	}

	// méthode pour afficher ou non le menu
	@FXML
	private void showMenuAction(ActionEvent event) {
		if(vis) {
			vis = false;
			leftPane.setStyle("-fx-background-color: white");
			home.setVisible(vis);
			infos.setVisible(vis);
			cours.setVisible(vis);
			planning.setVisible(vis);
		} else {
			vis = true;
			leftPane.setStyle("-fx-background-color: silver");
			home.setVisible(vis);
			infos.setVisible(vis);
			cours.setVisible(vis);
			planning.setVisible(vis);
		}
	}
	
	// méthode pour déconnecter la personne
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
	
	// méthode pour retourner à l'accueil
	@FXML
	private void homeAction(ActionEvent event) {
		try {
			Main.changeScene("Connected.fxml");
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.out.println("Impossible de retourner à l'accueil !");
		}
	}
	
	// méthode pour aller dans différents espaces
	@FXML
	private void goInAction(ActionEvent event) {
		if(event.getSource() == espEtudiant) {
			try {
				Main.changeScene("SpaceStudent.fxml");
			} catch (IOException e) {
				System.err.println(e.getMessage());
				System.out.println("Impossible d'aller dans l'espace étudiant !");
			}
		}
		if(event.getSource() == espEnseignant) {
			try {
				Main.changeScene("SpaceTeacher.fxml");
			} catch (IOException e) {
				System.err.println(e.getMessage());
				System.out.println("Impossible d'aller dans l'espace enseignant !");
			}
		}
		if(event.getSource() == espAdmin) {
			try {
				Main.changeScene("SpaceAdmin.fxml");
			} catch (IOException e) {
				System.err.println(e.getMessage());
				System.out.println("Impossible d'aller dans l'espace administratif !");
			}
		}
		if(event.getSource() == espCompta) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Information");
			alert.setHeaderText("Cette espace sera disponible plus tard");
			alert.showAndWait();
		}
	}
	
	@FXML
	private void mouseAction(Event e) {
		if(e.getEventType() == MouseEvent.MOUSE_ENTERED) {
			//
		}
	}
}
