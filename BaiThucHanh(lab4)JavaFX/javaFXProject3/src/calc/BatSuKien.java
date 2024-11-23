package calc;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BatSuKien {
private Button button1;
private Button button2;
private TinhToan tinhToan;
public BatSuKien(Button button1, Button button2, TinhToan tinhToan) {
	super();
	this.button1 = button1;
	this.button2 = button2;
	this.tinhToan = tinhToan;
}

public void nutCong() {
	button1.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent even) {
	tinhToan.phepCong();
			
		}
	});
}

public void nutTru() {
	button2.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent even) {
	tinhToan.phepTru();;
			
		}
	});
}

}
