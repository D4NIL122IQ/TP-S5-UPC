package BtnInteraction;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ChangeMe extends Application{
	
	@Override
	public void start(Stage stage) throws Exception{
		stage.setTitle("Bouton");
		
		PanelCouleurBouton pane = new PanelCouleurBouton();
		
		//PanelTempsEntreDeuxClics pane = new PanelTempsEntreDeuxClics();
		Scene scene = new Scene(pane,  400, 200);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
	}
	
	public static void main(String []args){
		launch(args);
	}
}
