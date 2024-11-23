package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Shape2D extends Application{

	@Override
	public void start(Stage stage1) throws Exception {
		  Text t = new Text(30,70,"Thu Nghiem TXT");
		    t.setStroke(Color.BLUE);
		    t.setFill(Color.BLACK);
		    t.setStrokeWidth(2);
		    t.setFont(Font.font("Serif", FontWeight.BOLD,FontPosture.REGULAR,47));  
		Group group = new Group(t);
	    Scene scene = new Scene(group,600,300);
	  
	    scene.setFill(Color.AQUA);
	  
	    stage1.setTitle("Sample app");
	   stage1.setScene(scene);
	   stage1.show();

	   
	}

	public static void main(String[] args) {
		launch(args);
	}
}
