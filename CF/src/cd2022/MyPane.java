package cd2022;




import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MyPane extends FlowPane {
	public MyPane() {
		Button btnp = new Button("Plus");
		Button btnm = new Button("Moins");
		
		
		
		TextField n1 = new TextField();
		TextField n2 = new TextField();
		
		Label lab = new Label("");
		
		btnp.setOnAction(e -> {
			try {
				double b1 = Double.parseDouble(n1.getText());
				double b2 = Double.parseDouble(n2.getText());
				
				lab.setText(""+ (b1 + b2));
			}catch(Exception t) {
				lab.setText("Il faut entrer un nombre");
			}
		});
		
		btnm.setOnAction(e -> {
			try {
				double b1 = Double.parseDouble(n1.getText());
				double b2 = Double.parseDouble(n2.getText());
				
				lab.setText(""+ (b1 - b2));
			}catch(Exception t) {
				lab.setText("Il faut entrer un nombre");
			}
		});
		
		this.getChildren().add(n1);
		this.getChildren().add(n2);
		this.getChildren().add(btnp);
		this.getChildren().add(btnm);
		this.getChildren().add(lab);

	}
}
