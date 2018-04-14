package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	public static Stage stage;
	
	@Override
	public void start(Stage primaryStage) {                 
		try {
			stage = primaryStage;
			Parent root = FXMLLoader.load(getClass().getResource("/application/Connexion.fxml"));
			stage.setTitle("Accueil");
			stage.setScene(new Scene(root));
			stage.sizeToScene(); 
			stage.show();
		} catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	// méthode pour changer de scene 
	public static void changeScene(String sceneName) throws IOException {
		Parent root = FXMLLoader.load(Main.class.getResource(sceneName));
		stage.setScene(new Scene(root));
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
