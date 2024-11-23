package cuaSo;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CuaSo {
public static void cuaSo1(final Stage tage1, Button button) {
	//Chuẩn bị cảnh vật (Scene) đưa lên sân khấu 1 (Stage/ Sân Khấu / Cửa sổ)
	button.setText("Mở của sổ thứ hai");
	button.setLayoutX(200);
	button.setLayoutY(50);
	
	Group group1 = new Group();
	group1.getChildren().add(button);
	Scene scene = new Scene(group1, 500, 300);

	
	//Mở sân khấu thứ nhất (Stage) ---> Cửa sổ thứ 1
	tage1.setTitle("Cửa sổ 1");
	tage1.setScene(scene);
	tage1.show();	
}

public static void cuaSo2(final Stage stage1) {
	//Chuẩn bị cảnh vật (Scene) đưa lên sân khấu 2 (Stage)
	Label label = new Label("Đây là cửa sổ thứ 2");
	Group group2 = new Group();
	group2.getChildren().add(label);
	Scene scene2 = new Scene(group2, 300,150);
	scene2.setFill(Color.LIGHTGREEN);
	
	//Mở sân khấu thứ hai (Stage) ---> cửa sổ thứ 2
	Stage  stage2 = new Stage();
	stage2.setTitle("Cửa sổ thứ 2");
	stage2.setScene(scene2);
	
	//Khi mở của sổ thứ 2 thì k cho phép thao tác vào cửa sổ thứ nhất
	stage2.initModality(Modality.WINDOW_MODAL);
	stage2.initOwner(stage1);
	
	stage2.show();
	
	
	
}
}
