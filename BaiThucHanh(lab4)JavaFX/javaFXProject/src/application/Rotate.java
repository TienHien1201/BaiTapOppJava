package application;



import javafx.util.Duration;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Rotate extends Application{
	
	@Override
	public void start(Stage stage1) throws Exception {
		
		Polygon shape = new Polygon(
		200, 50, 320, 50, 370,150,320,250,200,250,150,150); 
		shape.setFill(Color.BLUE);
		Group group = new Group(shape);
		Scene scene = new Scene(group, 600,400);
		scene.setFill(Color.BLACK);
		RotateTransition rotate = new RotateTransition();
		rotate.setDuration(Duration.millis(6000));
		rotate.setNode(shape);
		rotate.setByAngle(-360);
		rotate.setCycleCount(5);
		rotate.setAutoReverse(false);
		rotate.play();
		
		stage1.setTitle("Sample app");
		   stage1.setScene(scene);
		   stage1.show();	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
launch(args);
	}
}
