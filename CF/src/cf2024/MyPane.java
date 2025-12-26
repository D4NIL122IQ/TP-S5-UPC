package cf2024;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class MyPane extends BorderPane{
	public MyPane() {
		Button btn1 = new Button("Afficher");
		Button btn2 =new Button("Annuler");
		Label lab = new Label();
		Label labErr = new Label();
		TextArea area = new TextArea();
		area.setPrefRowCount(3);
		
		btn2.setOnAction(e -> {lab.setText("");});
		btn1.setOnAction(e -> {
			if(area.getText().length() != 0) {
				lab.setText(area.getText());
				labErr.setText("");
			}else {
				labErr.setText("Zone de saisie vide");
			}
			});
		this.setTop(lab);
		this.setLeft(btn1);
		this.setRight(btn2);
		this.setCenter(labErr);
		this.setBottom(area);
	}
}
