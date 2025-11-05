package GUI_nd_ProgEvent.Time;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class DateActu extends Application{
	
	@Override
	public void start(Stage stage) throws Exception{
		stage.setTitle("Date");
		
		//PanelDate pane = new PanelDate();
		
		PanelTempsEntreDeuxClics pane = new PanelTempsEntreDeuxClics();
		Scene scene = new Scene(pane,  400, 200);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
	}
	
	public static void main(String []args){
		launch(args);
	}
}
