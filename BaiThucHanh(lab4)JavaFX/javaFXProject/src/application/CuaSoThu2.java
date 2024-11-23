package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CuaSoThu2 extends Application{

	@Override
	public void start(Stage stage1) throws Exception {
		Group group = new Group();
		Scene scene = new Scene(group, 500,300);
		
	Button button = new Button("");
	button.setText("Mở cửa sổ thứ 2");
	button.setLayoutX(200);
	button.setLayoutY(50);
	group.getChildren().add(button);
	
	stage1.setTitle("Cửa sổ 1");
	stage1.setScene(scene);
	stage1.show();
	
	button.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent even) {
			Label label = new Label("Đây là cửa sổ thứ 2");
			Group group2 = new Group();
			group2.getChildren().add(label);
			Scene scene2 = new Scene(group2, 300, 150);
			scene2.setFill(Color.LIGHTGREEN);
			
			Stage stage2 = new Stage();
			stage2.setTitle("Cửa sổ thứ 2");
			stage2.setScene(scene2);
			stage2.initModality(Modality.WINDOW_MODAL);
			stage2.initOwner(stage1);
			stage2.show();
			
		}});
	}
public static void main(String[] args) {
	launch(args);
}
}
