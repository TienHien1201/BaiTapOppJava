module javaFXProject3 {
	requires javafx.controls;
	
	opens calc to javafx.graphics, javafx.fxml;
}
