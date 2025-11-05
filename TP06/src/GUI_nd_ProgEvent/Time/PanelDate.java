package GUI_nd_ProgEvent.Time;

import java.util.Date;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.Date;
/* quesion 1 
 * public class PanelDate extends BorderPane {
*	
*	private Date dateActuel;
*	
*	public PanelDate() {
*		Label lab = new Label("Date : "+ new Date());
*		Button btn = new Button("Mettre à jour la date");
*		
*		btn.setOnAction(new DateHandler(lab));
*		btn.setStyle("-fx-alignment: center;");
*		this.setCenter(lab);
*		this.setBottom(btn);
*		
*	}
}*/


//question 3  avec classe interne non anonyme
/*public class PanelDate extends BorderPane {
	private Date dateActuel;

	public PanelDate() {
		Label lab = new Label("Date : " + new Date());
		Button btn = new Button("Mettre à jour la date");
		btn.setOnAction(new DateHandlerI(lab));
		btn.setStyle("-fx-alignment: center;");
		this.setCenter(lab);
		this.setBottom(btn);
	}



	public class DateHandlerI implements EventHandler<ActionEvent> {
		private Label lab;
		public DateHandlerI(Label lab) {
			this.lab = lab;
		}
		
		@Override
		public void handle(ActionEvent event) {
			lab.setText("Date : " +new Date());
		}
	}

}*/

//question avec classe interne anonyme
/*public class PanelDate extends BorderPane {
	private Date dateActuel;
	private Label lab;
	public PanelDate() {
		lab = new Label("Date : " + new Date());
		Button btn = new Button("Mettre à jour la date");
		btn.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                lab.setText("Date : " +new Date());
            }
        });
		btn.setStyle("-fx-alignment: center;");
		this.setCenter(lab);
		this.setBottom(btn);
	}
}*/

//question 1 avec une lambda expression
public class PanelDate extends BorderPane {
	private Date dateActuel;
	private Label lab;
	public PanelDate() {
		lab = new Label("Date : " + new Date());
		Button btn = new Button("Mettre à jour la date");
		btn.setOnAction(event -> lab.setText("Date : " +new Date()));
		btn.setStyle("-fx-alignment: center;");
		this.setCenter(lab);
		this.setBottom(btn);
	}
}