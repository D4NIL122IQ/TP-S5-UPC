package GUI_nd_ProgEvent.Time;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class PanelTempsEntreDeuxClics extends BorderPane {
	private Temps tps;
	public PanelTempsEntreDeuxClics() {
		Label lb = new Label("En arret");
		tps = new Temps();
		Button btn = new Button("Clic !");
		
		btn.setOnAction(new TempsEntre2Handler(lb,tps));
		
		this.setCenter(lb);
		this.setBottom(btn);
	}
}
