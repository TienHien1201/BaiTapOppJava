package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class JavaFXSample2 extends Application {
	
	@Override
	public void start(Stage stage1) throws Exception {
		Line line = new Line(0,0,600,300); 
		line.setStroke(Color.WHITE);
		
		Line line1 = new Line(600,0,0,300);
		line.setStroke(Color.WHITE);
		line.setStrokeWidth(7);//Kích cỡ ngang Nét vẽ
		
		Group group = new Group(line, line1);
		Scene scene = new Scene(group, 600,300);
	scene.setFill(Color.GREEN);
	
	stage1.setTitle("Sample1 App");
	stage1.setScene(scene);
	stage1.show();
	
	}
	public static void main(String[] args) {
		launch(args);
	}
}
