package application;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;// Thư viện hình tròn
import javafx.scene.shape.Rectangle;// Thư viện hình vuông
import javafx.stage.Stage;
import javafx.util.Duration;

public class Scale extends Application{

	@Override
	public void start(Stage stage1) throws Exception {
//		Creating scale Stransition
//		Circle shape = new Circle(300,200,20);// Hình tròn
		Rectangle shape = new Rectangle(300,200,30,30);//Hình Vuông
		shape.setStroke(Color.BLUE);
		shape.setStrokeWidth(3);
        shape.setFill(Color.RED);		
		
        ScaleTransition scale = new ScaleTransition();
        scale.setDuration(Duration.millis(3000));// time nhanh hay chậm của 1 chu kì
        scale.setNode(shape);
        
//        Setting the dimensions for scaling
        scale.setByX(5);// Trục ngang
        scale.setByY(5);// Trục dọc
        
        scale.setCycleCount(5);
        scale.setAutoReverse(true);//True phóng to rôi thu nhỏ lại, False chỉ phóng to
        scale.play();
        
        Group group = new Group(shape);
        Scene scene = new Scene(group, 600, 400);
        scene.setFill(Color.BLACK);
        stage1.setTitle("Sample app");
        stage1.setScene(scene);
        stage1.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
