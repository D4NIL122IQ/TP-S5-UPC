package GUI_nd_ProgEvent.Time;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

import java.util.Date;



public class DateHandler implements EventHandler<ActionEvent> {
	private Label lab;
	public DateHandler(Label lab) {
		this.lab = lab;
	}
	
	@Override
	public void handle(ActionEvent event) {
		lab.setText("Date : " +new Date());
	}
}
