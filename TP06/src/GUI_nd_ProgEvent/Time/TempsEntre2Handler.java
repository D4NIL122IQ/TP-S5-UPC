package GUI_nd_ProgEvent.Time;

import java.util.Date;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class TempsEntre2Handler implements EventHandler<ActionEvent> {
	private Label lab;
	private Temps temps;
	public TempsEntre2Handler(Label lab, Temps tp) {
		this.lab = lab;
		temps = tp;
	}
	
	@Override
	public void handle(ActionEvent event) {
		if(!temps.isStart()) {
			temps.start();
			lab.setText("Chrono lancé !" );
		}else {
			lab.setText("Stoop ! Temps ecouler : "+  temps.stop() +"ms");
		}
		
	}
}
