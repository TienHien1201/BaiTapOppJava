package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;


public class JavaFXSample1 extends Application {
	@Override
	public void start(Stage stage1) throws Exception {
		
		Group group = new Group();
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
