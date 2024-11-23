package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import java.util.Date;

import javafx.application.Application;
import javafx.stage.Stage;

public class ButtonSetOnAction extends Application{

	@Override
	public void start(Stage stage1) throws Exception {
		//Button
	Button button = new Button("Show Time");
		button.setLayoutX(20);
		button.setLayoutY(20);
		
		//Label
		Label label = new Label("");
		label.setLayoutX(100);
		label.setLayoutY(20);
		label.setFont(Font.font("Serif",FontWeight.BOLD, FontPosture.REGULAR,27));
		label.setTextFill(Color.BLUE);
		
//		Bắt phím nhấn nghĩa là khi có hành động vào nút này thì nó sẽ thực hiện chức năng
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
//				new Date().toString() lấy ngày giờ của hệ thống xuất ra kiểu string
				label.setText(new Date().toString());/*Thông báo đã thực hiện chức năng
				ví dụ nhấn vào là show ra time hoặc ta có thể để chữ thông bất kì khi nhấn 
				và nó sẽ xuất chức năng ra màn hình */ 
			}
		});
		
		Group group = new Group(button,label);	
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
