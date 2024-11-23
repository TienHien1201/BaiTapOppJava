package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEventKeyTyped extends Application{

	@Override
	public void start(Stage stage1) throws Exception {
		Text t = new Text(30,30,"Input a letter R/G/B: ");
		t.setStroke(Color.WHITE);
		
		TextField tF = new TextField();
		tF.setLayoutX(200);
		tF.setLayoutY(10);
		
		Circle shape = new Circle(150, 150,100);
		shape.setStroke(Color.BLUE);
		shape.setStrokeWidth(3);
		shape.setFill(Color.GREY);
		
//		Handling the key typed event
		
		/* EventHandler<KeyEvent>() biến cố bàn phím có
		nghĩa là tương tác của  người dùng để thục hiện 1 việc gì đó
		 ví dụ Nhập từ bàn phím rồi thực hiện câu lênh...*/
		EventHandler<KeyEvent> e1 = new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent e) {
             /*String c Lấy tất cả những gì trong lúc nhập vào*/				
			String c = tF.getText();
			if (c.trim().toUpperCase().equals("R"))
			shape.setFill(Color.RED);
			if(c.trim().toUpperCase().equals("G"))
				shape.setFill(Color.GREEN);
			if (c.trim().toUpperCase().equals("B"))
				shape.setFill(Color.BLUE);
			}};
		
//			Adding and event handler to the text feld
tF.addEventHandler(KeyEvent.KEY_TYPED, e1);

//          Handing the mouse clicked event(on circle)  
			EventHandler<MouseEvent> e2 = new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent e) {
					shape.setStroke(Color.GOLD);	
				}};
				
//				Adding the event handler to the circle
				shape.addEventHandler(MouseEvent.MOUSE_CLICKED, e2);/*shape.addEventHandler
				Chỉ click vào đường tròn thì mới thực hiện */
				
				
			Group group = new Group(shape,tF ,t);
			Scene scene = new Scene(group,600,400);
			scene.setFill(Color.BLACK);
			
			stage1.setTitle("Sample app");
			stage1.setScene(scene);
			stage1.show();
			
	}

	public static void main(String[] args) {
		launch(args);
	}
}
