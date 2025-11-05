package GUI_nd_ProgEvent.compteur;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class CompteurHandler implements EventHandler<ActionEvent> {
	private Label lab;
	private Compteur compteur;

	public CompteurHandler(Label lab, Compteur cpt) {
		this.lab = lab;
		compteur = cpt;
	}

	@Override
	public void handle(ActionEvent event) {
		compteur.incrementer();
		lab.setText("−−>" + compteur.getValeur());
	}
}