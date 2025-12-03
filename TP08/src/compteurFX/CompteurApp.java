package compteurFX;

import java.util.Date;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CompteurApp extends Application {
	private int compteur = 0;
	private Label labCmpt = new Label(" " + compteur);
	private Date date = new Date();
	private Label labDate = new Label( date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());

	private void incrementeCompteur() {
		compteur++;
		labCmpt.setText(" " + compteur);
	}
	
	private void updateDate() {
		labDate.setText( " " +date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
	}
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
	BorderPane pane= new BorderPane();
	pane.setCenter(labCmpt);
	pane.setTop(labDate);
	Scene scene= new Scene(pane, 200, 200);
	Thread thread= new Thread(new Runnable() {
		@Override
		public void run() {
		Runnable updater= new Runnable() {
		@Override
		public void run() { incrementeCompteur (); updateDate();}
		}; // Fin new Runnable
		while (true) {
		try {
		Thread.sleep(1000);
		} catch (InterruptedException ex) {}
		Platform.runLater(updater);
		}
		} }); // Fin new Thread()
		thread.setDaemon(true);
		thread.start();
	stage.setScene(scene);
	stage.show();
	}
}
