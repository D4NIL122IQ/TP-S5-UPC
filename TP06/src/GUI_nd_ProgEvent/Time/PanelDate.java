package GUI_nd_ProgEvent.Time;

import java.util.Date;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class PanelDate extends BorderPane {
	
	private Date dateActuel;
	
	public PanelDate() {
		Label lab = new Label("Date : "+ new Date());
		Button btn = new Button("Mettre à jour la date");
		
		btn.setOnAction(new DateHandler(lab));
		btn.setStyle("-fx-alignment: center;");
		this.setCenter(lab);
		this.setBottom(btn);
		
	}
}
