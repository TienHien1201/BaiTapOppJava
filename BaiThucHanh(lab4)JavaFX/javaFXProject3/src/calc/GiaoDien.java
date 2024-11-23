package calc;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class GiaoDien {
private FlowPane flowPane;
private TextField textFile1;
private TextField textFile2;
private TextField textFile3;
private Button button1;
private Button button2;
public GiaoDien(FlowPane flowPane, TextField textFile1, TextField textFile2, TextField textFile3, Button button1,
		Button button2) {
	super();
	this.flowPane = flowPane;
	this.textFile1 = textFile1;
	this.textFile2 = textFile2;
	this.textFile3 = textFile3;
	this.button1 = button1;
	this.button2 = button2;
}

public void giaoDien() {
	//FlowPane
	flowPane.setHgap(10);
	flowPane.setVgap(10);
	flowPane.setPadding(new Insets(15,15,15,15));
	
	//Button
	button1 = new Button("+");
	button2 = new Button("-");
	
	//TextFile
	textFile3.setPrefWidth(80);
	textFile3.setPrefHeight(30);
	
	
	//Thêm tất cả các textFile và nút nhấn vào flowPane
	flowPane.getChildren().addAll(textFile1,textFile2,button1,button2,textFile3);
	
	//Bắt sự kiện tất cả các nút nhấn và xử lý
	TinhToan tinhToan = new TinhToan(textFile1, textFile2, textFile3);
	BatSuKien batSuKien = new BatSuKien(button1, button2, tinhToan);
	batSuKien.nutCong();
	batSuKien.nutTru();
}


}
