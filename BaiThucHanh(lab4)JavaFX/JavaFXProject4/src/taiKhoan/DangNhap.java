package taiKhoan;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DangNhap {
private static TextField textFile1 = new TextField();
private static PasswordField textFile2 = new PasswordField();

public static void giaoDienChinh(final Stage stage1, Button button) {
	//Chuẩn bị cảnh vật (Scene) để đưa lên sân khấu 1 (Stage / sân khấu / cửa sổ)
	
	Text text1 = new Text("Tài Khoản:");
	text1.setLayoutX(50);
	text1.setLayoutY(35);
	
	textFile1 = new TextField();
	textFile1.setLayoutX(110);
	textFile1.setLayoutY(20);
	
	Text text2 = new Text("Mật Khẩu:");
	text2.setLayoutX(50);
	text2.setLayoutY(65);

	textFile2 = new PasswordField();
	textFile2.setLayoutX(110);
	textFile2.setLayoutY(20);
	
	button.setText("Đăng Nhập");
	button.setLayoutX(110);
	button.setLayoutY(100);
	
	Group group1 = new Group();
	group1.getChildren().addAll(text1, textFile1, text2, textFile2, button);
	Scene scene = new Scene(group1,320, 150);
	
//	Mở sân khấu thứ nhất (Stage) ---> cửa sổ thứ 1
	stage1.setTitle("Đăng nhập");
	stage1.setScene(scene);
	stage1.show();
}
public static void xuLy() {
//	Chuẩn bị cảnh vật (Scene) để đưa lên sân khấu 2 (Stage)
	String taiKhoan = textFile1.getText();
	String matKhau = textFile2.getText();
	
	Label label = new Label();
	label.setText("Bạn Vừa Nhập Tài Khoản " + taiKhoan + ", Mật Khẩu: " + matKhau);
	Group group2 = new Group();
	group2.getChildren().add(label);
	Scene scene2 = new Scene(group2, 270 ,100);
	scene2.setFill(Color.YELLOWGREEN);

//	Mở sân khấu thứ 2 (Stage) ---> cửa sổ thứ 2
	Stage stage2 = new Stage();
	stage2.setTitle("Xử lý đăng nhập");
	stage2.setScene(scene2);
	stage2.show();
	
}

}
