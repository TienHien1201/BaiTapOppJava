package application;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Calc extends Application{

	@Override
	public void start(Stage tage) throws Exception {
		//FlowPane chổ chứa giống goup
		FlowPane flowPan = new FlowPane();
		
		flowPan.setHgap(10);
		flowPan.setVgap(10);
		flowPan.setPadding(new Insets(15,15,15,15));
		
		//Text file
		TextField texField1 = new TextField();
		TextField textField2 = new TextField();
	flowPan.getChildren().addAll(texField1,textField2);	
		
	//Button
	Button button1 = new Button("+");
	Button button2 = new Button("-");
	flowPan.getChildren().addAll(button1,button2);
	
	//TextFile3
	TextField textField3 = new TextField();
	textField3.setPrefWidth(80);
	textField3.setPrefHeight(30);
	flowPan.getChildren().addAll(textField3);
	
	//Bắt sự kiện nhấn nút cộng
	button1.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			int t1, t2;
			/*Vì nhập vào là text tức là chuỗi nên khi cộng
			 * nó sẽ cộng chuỗi nên phải chuyển qua int mới 
			 * thực hiện tính toán được*/
			t1 = Integer.parseInt(texField1.getText());
			t2 = Integer.valueOf(textField2.getText());
			textField3.setText(String.valueOf(t1 + t2));
			
		}
	});
	
	//Bắt sự kiện nhấn nút trừ
	button2.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			int t1, t2;
			/*Vì nhập vào là text tức là chuỗi nên khi cộng
			 * nó sẽ cộng chuỗi nên phải chuyển qua int mới 
			 * thực hiện tính toán được*/
			t1 = Integer.parseInt(texField1.getText());
			t2 = Integer.valueOf(textField2.getText());
			textField3.setText(String.valueOf(t1 - t2));	
		}
	});
	
	Scene scene = new Scene(flowPan, 200,200);
	tage.setTitle("Calc");
	tage.setResizable(false);
	tage.setScene(scene);
	tage.show();
	}

public static void main(String[] args) {
		launch(args);
	}
}
