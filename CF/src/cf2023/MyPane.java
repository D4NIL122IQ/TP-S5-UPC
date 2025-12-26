package cf2023;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

public class MyPane extends VBox{
	
	public MyPane() {
		TextField text = new TextField();
		Button btn = new Button("Convertir");
		CheckBox ckb = new CheckBox("GBP");
		Label lab = new Label("");
		
		btn.setOnAction(e -> {
			try {
				double t = Double.parseDouble(text.getText());
				if(ckb.isSelected()) {
					lab.setText(t + "euros = " + t*0.87 + "livre sterling");
				}else {
					lab.setText(t + "euros = " + t*1.1 + "Dollar");
				}
			}catch(Exception t) {
				lab.setText("Il faut entrer un nombre !");
			}
			
		});
		this.getChildren().add(text);
		this.getChildren().add(btn); 
		this.getChildren().add(ckb);
		this.getChildren().add(lab);

	}

}
