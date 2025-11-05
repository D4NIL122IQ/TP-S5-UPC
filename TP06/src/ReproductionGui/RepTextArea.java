package ReproductionGui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;

public class RepTextArea extends Application{
	@Override
	public void start(Stage stage) throws Exception {
	    stage.setTitle("Text Area");

	    BorderPane pane = new BorderPane();

	    // Labels
	    TextArea area = new TextArea();
	    area.setPrefRowCount(5);
	    
	    pane.setCenter(area);
	    // Boutons
	    Button btnAnnuler = new Button("Annuler");
	    Button btnEnvoy = new Button("Envoyer");
	    Button btnRetour = new Button("Retour");

	    HBox hbox = new HBox(10);
	    hbox.getChildren().addAll(btnRetour, btnEnvoy, btnAnnuler);
	    hbox.setStyle("-fx-padding: 10; -fx-alignment: center;");

	    pane.setBottom(hbox);

	    Scene scene = new Scene(pane, 400, 200);
	    stage.setScene(scene);
	    stage.show();
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
