package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class HboxLayout extends Application{

	@Override
	public void start(Stage stage1) throws Exception {
		HBox hBox = new HBox();
		hBox.setSpacing(30); //Setting the space
		hBox.setPadding(new Insets(20,20,20,20));//Top, right, bottom, left
	
		Group group = new Group(hBox);
		Scene scene = new Scene(group,600,400);
		scene.setFill(Color.AQUA);
		
		stage1.setTitle("Sample app");
		stage1.setScene(scene);
		stage1.show();
	}

 public static void main(String[] args) {
	launch(args);
}
}
