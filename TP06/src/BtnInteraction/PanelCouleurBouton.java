package BtnInteraction;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;



public class PanelCouleurBouton extends BorderPane {
	Label lab;
	Button btn1;
	Button btn2;
	public PanelCouleurBouton() {
		lab = new Label("Je change de couleur.");
		btn1 = new Button("Couleur rouge");
		btn2 = new Button("Couleur verte");
		
		btn1.setOnAction(event -> lab.setTextFill(Color.RED));
		btn2.setOnAction(event -> lab.setTextFill(Color.GREEN));
		
		this.setTop(lab);
		this.setCenter(btn1);
		this.setBottom(btn2);
	}
}
