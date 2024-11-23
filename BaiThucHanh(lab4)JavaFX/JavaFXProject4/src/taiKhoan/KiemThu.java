package taiKhoan;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class KiemThu extends Application{

	@Override
	public void start(final Stage stage1) {
	//Tạo 1 nút nhấn ở sân khấu thứ nhất (Nút nhấn thứ nhất) và hiển thị (Show) sân khấu ra màn hình
		Button button = new Button("");
		DangNhap.giaoDienChinh(stage1, button);
		
		
		//Khi nút được nhấn, cửa sổ thứ hai được tạo ra
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent even) {
				DangNhap.xuLy();
				
			}
		});
	}
public static void main(String[] args) {
	launch(args);
}
}
