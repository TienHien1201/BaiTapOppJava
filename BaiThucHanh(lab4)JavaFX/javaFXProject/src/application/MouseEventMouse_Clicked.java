package application;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventMouse_Clicked extends Application{

	@Override
	public void start(Stage stage1) throws Exception {
		Text t = new Text(30,30,"Click on the circle to change is color");
		t.setStroke(Color.WHITE);
		
		Circle shape = new Circle(150,150,100);
		shape.setStroke(Color.BLUE);
		shape.setStrokeWidth(3);
		shape.setFill(Color.RED);
		
//		Creating the mouse event handler
		/*EventHandler<MouseEvent> biến cố con chuột có nghĩa là tương tác của 
		 * người dùng để thục hiện 1 việc gì đó ví dụ click.....*/ 
		EventHandler<MouseEvent> event = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent e) {
            shape.setFill(Color.YELLOW);
            t.setStroke(Color.YELLOW);
				
			}};
//			Register the event filter
			shape.addEventFilter(MouseEvent.MOUSE_CLICKED, event);
			Group root = new Group(shape,t);
			Scene scene = new Scene(root,600,400);
			scene.setFill(Color.BLACK);
			
			stage1.setTitle("Sample app");
			stage1.setScene(scene);
			stage1.show();
			
	}
public static void main(String[] args) {
	launch(args);
}
}
