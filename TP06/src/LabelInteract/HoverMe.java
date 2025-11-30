package LabelInteract;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class HoverMe extends Application{
	
	@Override
	public void start(Stage stage) throws Exception{
		stage.setTitle("Bouton");
		
		LabelLien lab = new LabelLien("Survole moi");
		
		BorderPane pane = new BorderPane();
		pane.setCenter(lab);
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
