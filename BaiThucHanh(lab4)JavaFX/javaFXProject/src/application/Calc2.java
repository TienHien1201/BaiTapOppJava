package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calc2 extends Application{

	@Override
	public void start(Stage tage) throws Exception {
//		Tạo 1 GridPane chứa phần giao diện
		GridPane gridPane = new GridPane();
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		gridPane.setPadding(new Insets(10));
		
		TextField textFile = new TextField();
		Button button1 = new Button("Cl");
		Button button2 = new Button("+");
		Button button3 = new Button("-");
		Button button4 = new Button("+-");
		Button button5 = new Button("=");
		Button button6 = new Button(".");
		Button number1 = new Button("1");
		Button number2 = new Button("2");
		Button number3 = new Button("3");
		Button number4 = new Button("4");
		Button number5 = new Button("5");
		Button number6 = new Button("6");
		Button number7 = new Button("7");
		Button number8 = new Button("8");
		Button number9 = new Button("9");
		
		gridPane.add(button1, 1, 4);
		
		
	}
public static void main(String[] args) {
	launch(args);
}
}
