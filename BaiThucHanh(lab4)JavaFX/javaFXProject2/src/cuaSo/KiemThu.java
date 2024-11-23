package cuaSo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class KiemThu extends Application{

	@Override
	public void start(Stage stage1) throws Exception {
//		Tạo 1 nút nhấn ở sân khấu thứ 1 (Cửa sổ 1) và hiển thị(Show) sân khấu ra màn hình
		Button button = new Button("");
		CuaSo.cuaSo1(stage1, button);
		
//		Khi nút được nhấn, cửa sổ thứ 2 được tạo ra
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent even) {
				CuaSo.cuaSo2(stage1);
				
			}
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
