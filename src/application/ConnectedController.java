package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

// la classe controller de la page Connected.fxml
public class ConnectedController implements Initializable {

	//// commun � chaque fen�tre des espaces
	@FXML AnchorPane leftPane;
	@FXML Button menu;
	@FXML Button dec;
	@FXML Button home;
	@FXML Button infos;
	@FXML Button cours;
	@FXML Button planning;
	boolean vis = false;
	////
	
	@FXML Button espEtudiant;
	@FXML Button espEnseignant;
	@FXML Button espAdmin;
	@FXML Button espCompta;
	
	// M�thode pour initialiser la page avec les icones
	public void initialize(URL location, ResourceBundle resources) {
		Image menuIcon = new Image("icon/menu.png",40,40,false,false);
		Image decoIcon = new Image("icon/deco.png",40,40,false,false);
		menu.setGraphic(new ImageView(menuIcon));
		dec.setGraphic(new ImageView(decoIcon));
		home.setVisible(vis);
		infos.setVisible(vis);
		cours.setVisible(vis);
		planning.setVisible(vis);

		
		// Ev�nement souris entr�e et sortie pour l'espace �tudiant
		espEtudiant.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				espEtudiant.setStyle("-fx-background-color: black");
				espEtudiant.setTextFill(Color.ORANGE);
			}
		});
		espEtudiant.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				espEtudiant.setStyle("-fx-background-color: orange");
				espEtudiant.setTextFill(Color.BLACK);
			}
		});
		
		// Ev�nement souris entr�e et sortie pour l'espace enseignant
		espEnseignant.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				espEnseignant.setStyle("-fx-background-color: black");
				espEnseignant.setTextFill(Color.ORANGE);
			}
		});
		espEnseignant.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				espEnseignant.setStyle("-fx-background-color: orange");
				espEnseignant.setTextFill(Color.BLACK);
			}
		});
		
		// Ev�nement souris entr�e et sortie pour l'espace admin
		espAdmin.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				espAdmin.setStyle("-fx-background-color: black");
				espAdmin.setTextFill(Color.ORANGE);
			}
		});
		espAdmin.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				espAdmin.setStyle("-fx-background-color: orange");
				espAdmin.setTextFill(Color.BLACK);
			}
		});
		
		// Ev�nement souris entr�e et sortie pour l'espace compta
		espCompta.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				espCompta.setStyle("-fx-background-color: black");
				espCompta.setTextFill(Color.ORANGE);
			}
		});
		espCompta.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				espCompta.setStyle("-fx-background-color: orange");
				espCompta.setTextFill(Color.BLACK);
			}
		});
	}

	// m�thode pour afficher ou non le menu
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

			if(Main.getUser().getStatut().equals("Enseignant")) {
				cours.setDisable(true);
				planning.setVisible(vis);
				infos.setVisible(vis);
			}
			else {
				if(Main.getUser().getStatut().equals("Secr�taire")) {
					cours.setVisible(false);
					planning.setVisible(false);
					infos.setVisible(false);
				}
				else {
					cours.setVisible(vis);
					planning.setVisible(vis);
					infos.setVisible(vis);
				}
			}
		}
	}
	
	// m�thode pour d�connecter la personne
	@FXML
	private void decoAction(ActionEvent event) {
		try {
			Main.changeScene("Connexion.fxml");
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Information");
			alert.setHeaderText("Vous avez �t� d�connect� avec succ�s");
			alert.showAndWait();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.out.println("Impossible de vous d�connecter !");
		}
	}
	
	// m�thode pour retourner � l'accueil
	@FXML
	private void homeAction(ActionEvent event) {
		try {
			Main.changeScene("Connected.fxml");
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.out.println("Impossible de retourner � l'accueil !");
		}
	}
	
	// m�thode pour aller dans diff�rents espaces
	@FXML
	private void goInAction(ActionEvent event) {
		if(event.getSource() == espEtudiant) {
			if(Main.getUser().getStatut().equals("Secr�taire") || Main.getUser().getStatut().equals("Enseignant")) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Information");
				alert.setHeaderText("Cette espace est r�serv� aux �tudiants !");
				alert.showAndWait();
			}
			else {
				try {
					Main.changeScene("SpaceStudent.fxml");
				} catch (IOException e) {
					System.err.println(e.getMessage());
					System.out.println("Impossible d'aller dans l'espace �tudiant !");
				}
			}
		}
		if(event.getSource() == espEnseignant) {
			if(Main.getUser().getStatut().equals("Etudiant") || Main.getUser().getStatut().equals("Secr�taire")) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Information");
				alert.setHeaderText("Cette espace est r�serv� pour les enseignants !");
				alert.showAndWait();
			}
			else {
				try {
					Main.changeScene("SpaceTeacher.fxml");
				} catch (IOException e) {
					System.err.println(e.getMessage());
					System.out.println("Impossible d'aller dans l'espace enseignant !");
				}
			}
		}
		if(event.getSource() == espAdmin) {
			if(Main.getUser().getStatut().equals("Etudiant") || Main.getUser().getStatut().equals("Enseignant")) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Information");
				alert.setHeaderText("Cette espace est r�serv� � l'administrateur !");
				alert.showAndWait();
			}
			else {
				try {
					Main.changeScene("SpaceAdmin.fxml");
				} catch (IOException e) {
					System.err.println(e.getMessage());
					System.out.println("Impossible d'aller dans l'espace administratif !");
				}
			}
		}
		if(event.getSource() == espCompta) {
			if(Main.getUser().getStatut().equals("Etudiant") || Main.getUser().getStatut().equals("Enseignant")) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Information");
				alert.setHeaderText("Cette espace est r�serv� � l'administrateur !");
				alert.showAndWait();
			}
			else {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Information");
				alert.setHeaderText("Cette espace sera disponible tr�s prochainement.");
				alert.showAndWait();
			}
		}
	}
	
	// m�thode pour afficher la page de modification des informations
	@FXML
	private void changeInfos(ActionEvent event) {
		try {
			Main.changeScene("modifInfos.fxml");
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.out.println("Impossible d'afficher la page de modification des infos !");
		}
	}
	
	// m�thode pour afficher la page des cours
	@FXML
	private void coursAction(ActionEvent event) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information");
		alert.setHeaderText("Vous n'avez aucuns cours � t�l�charger");
		alert.showAndWait();
	}
	
	// m�thode pour afficher la page des examens avec dates
	@FXML
	private void examenAction(ActionEvent event) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information");
		alert.setHeaderText("Vous n'avez pas d'examens pendant les prochains mois");
		alert.showAndWait();
	}
}
