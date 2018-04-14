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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

public class AdminController implements Initializable{
////commun � chaque fen�tre des espaces
	@FXML private AnchorPane leftPane;
	@FXML private Button menu;
	@FXML private Button dec;
	@FXML private Button home;
	@FXML private Button infos;
	@FXML private Button cours;
	@FXML private Button planning;
	private boolean vis = false;
	////
	
	@FXML private Button addAgent;
	@FXML private Button modifAgent;
	@FXML private Button addCours;
	@FXML private Button suppCours;
	@FXML private Button addExam;
	@FXML private Button suppExam;
	
	public void initialize(URL location, ResourceBundle resources) {
		Image menuIcon = new Image("icon/menu.png",40,40,false,false);
		Image decoIcon = new Image("icon/deco.png",40,40,false,false);
		menu.setGraphic(new ImageView(menuIcon));
		dec.setGraphic(new ImageView(decoIcon));
		home.setVisible(vis);
		infos.setVisible(vis);
		cours.setVisible(vis);
		planning.setVisible(vis);
		
		addAgent.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				addAgent.setStyle("-fx-background-color: black");
				addAgent.setTextFill(Color.ORANGE);
			}
		});
		addAgent.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				addAgent.setStyle("-fx-background-color: orange");
				addAgent.setTextFill(Color.BLACK);
			}
		});
		
		modifAgent.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				modifAgent.setStyle("-fx-background-color: black");
				modifAgent.setTextFill(Color.ORANGE);
			}
		});
		modifAgent.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				modifAgent.setStyle("-fx-background-color: orange");
				modifAgent.setTextFill(Color.BLACK);
			}
		});
		
		addCours.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				addCours.setStyle("-fx-background-color: black");
				addCours.setTextFill(Color.ORANGE);
			}
		});
		addCours.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				addCours.setStyle("-fx-background-color: orange");
				addCours.setTextFill(Color.BLACK);
			}
		});
		
		suppCours.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				suppCours.setStyle("-fx-background-color: black");
				suppCours.setTextFill(Color.ORANGE);
			}
		});
		suppCours.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				suppCours.setStyle("-fx-background-color: orange");
				suppCours.setTextFill(Color.BLACK);
			}
		});
		
		addExam.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				addExam.setStyle("-fx-background-color: black");
				addExam.setTextFill(Color.ORANGE);
			}
		});
		addExam.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				addExam.setStyle("-fx-background-color: orange");
				addExam.setTextFill(Color.BLACK);
			}
		});
		
		suppExam.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				suppExam.setStyle("-fx-background-color: black");
				suppExam.setTextFill(Color.ORANGE);
			}
		});
		suppExam.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				suppExam.setStyle("-fx-background-color: orange");
				suppExam.setTextFill(Color.BLACK);
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
			infos.setVisible(vis);
			cours.setVisible(vis);
			planning.setVisible(vis);
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
	
	// m�thode pour aller dans diff�rents espaces
	@FXML
	private void goInAction(ActionEvent event) {
		if(event.getSource() == addAgent) {
			try {
				Main.changeScene("modifInfosInfos.fxml");
			} catch (IOException e) {
				System.err.println(e.getMessage());
				System.out.println("Impossible d'afficher la page de cr�ation des infos !");
			}
		}
		if(event.getSource() == modifAgent) {
			try {
				Main.changeScene("modifInfosInfos.fxml");
			} catch (IOException e) {
				System.err.println(e.getMessage());
				System.out.println("Impossible d'afficher la page de cr�ation des infos !");
			}
		}
		if(event.getSource() == addCours) {
			// ajouter fonction ouvrir un fichier
		}
		if(event.getSource() == suppCours) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Information");
			alert.setHeaderText("Disponible prochainement.");
			alert.showAndWait();
		}
		if(event.getSource() == addExam) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Information");
			alert.setHeaderText("Ce n'est pas la p�riode des examens");
			alert.showAndWait();
		}
		if(event.getSource() == suppExam) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Information");
			alert.setHeaderText("Il n'y a pas d'examens � supprimer");
			alert.showAndWait();
		}
	}
}
