package calc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Calc extends Application{

	@Override
	public void start(Stage stage1) throws Exception {
		//FlowPane
		FlowPane flowPane = new FlowPane();
		TextField textFile1 = new TextField();
		TextField textFile2 = new TextField();
		TextField textFile3 = new TextField();
		Button button1 = new Button();
		Button button2 = new Button();
		
		GiaoDien gd = new GiaoDien(flowPane, textFile1, textFile2, textFile3, button1, button2);
		gd.giaoDien();
		
		//Trình diễn trên sân khấu
		Scene scene = new Scene(flowPane,200, 200);
	    stage1.setTitle("Calc");
	    stage1.setResizable(false);
	    
	    stage1.setScene(scene);
	    stage1.show();
		
	}
public static void main(String[] args) {
	launch(args);
}
}
