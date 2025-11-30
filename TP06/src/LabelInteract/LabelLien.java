package LabelInteract;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class LabelLien extends Label{
	public LabelLien(String lab) {
		super(lab);
		setTextFill(Color.BLACK);
		setOnMouseEntered(event -> setTextFill(Color.RED));
		setOnMouseExited(event -> setTextFill(Color.BLACK));
	}
	
}
