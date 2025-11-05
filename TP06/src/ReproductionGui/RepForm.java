package ReproductionGui;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;


public class RepForm extends Application{
	
	public void start(Stage stage) throws Exception {
	    stage.setTitle("Formulaire");
	    
	    BorderPane pane = new BorderPane();
	    
	    Label lb1= new Label("Formulaire d'inscription");
	    
	    
	    
	    Label etc = new Label("Etat civil :");
	    ToggleGroup group1 = new ToggleGroup();
	    RadioButton button1= new RadioButton("Mr");
	    button1.setSelected(true);
	    button1.setToggleGroup(group1);
	    RadioButton button2= new RadioButton("Mme");
	    button2.setToggleGroup(group1);
	    
	    Label nom = new Label("Nom :");
	    TextField chN = new TextField();
	    
	    Label prenom = new Label("Prenom :");
	    TextField chP = new TextField();
	    
	    Button btn2 = new Button("Soumettre");
	    
	    HBox hb1 = new HBox();
	    HBox hb2 = new HBox();
	    HBox hb3 = new HBox();
	    
	    
	    
	    hb1.getChildren().addAll(etc, button1, button2);
	    hb2.getChildren().addAll(nom, chN);
	    hb3.getChildren().addAll(prenom, chP);
	    
	    VBox vb = new VBox();
	    vb.getChildren().addAll(lb1,hb1,hb2,hb3,btn2);
	    
	    pane.setCenter(vb);
	    Scene scene = new Scene(pane, 400, 200);
	    stage.setScene(scene);
	    stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
