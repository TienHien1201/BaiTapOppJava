package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UIConTrols extends Application{

	@Override
	public void start(Stage tage){
		
//		Label for name
		Text nameLable = new Text("Name");
		
//		Text file for name
		TextField nameText = new TextField();//Hôp để chứa 
		
//		Label for date of birth
		Text doLabel = new Text("Date of birth");
		
//		Date picker to choose date
		DatePicker datePicker = new DatePicker();
		
//		Label for gender
		Text genderLable = new Text("Gender");
		
//		Toggle group of radio buttons
		ToggleGroup groupGender = new ToggleGroup();
		RadioButton maleRadio = new RadioButton("male");
		maleRadio.setToggleGroup(groupGender);
		RadioButton femaleRadio = new RadioButton("female");
		femaleRadio.setToggleGroup(groupGender);
		
//		Label for Reservation
		ToggleButton reservationLabel = new ToggleButton();
		ToggleButton yes = new ToggleButton("Yes");
		ToggleButton no = new ToggleButton("No");
		ToggleGroup groupReservation = new ToggleGroup();
		yes.setToggleGroup(groupReservation);
		no.setToggleGroup(groupReservation);
		
//		Label for technologies known
		Text technologiesLabel = new Text("Technologies Known");
		
//		Check box for education
		CheckBox javaCheckBox = new CheckBox("Java");	
		javaCheckBox.setSelected(false);
		
//		Check box for education
		CheckBox cppCheckBox = new CheckBox("C++");	
		cppCheckBox.setSelected(true);
		
//		Label for education
		Text educationlabel = new Text("Educational qualification");
		
//		list View for Education Qualification
		ObservableList<String> names = FXCollections.observableArrayList(
				"Hight School", "Engineer", "MSC","MBA"); 
		ListView<String> educationListView = new ListView<String>(names);
		
//		Label for location
		Text locationLabel = new Text("Location");
		
//		Choice box for location
		ChoiceBox locationChoiceBox = new ChoiceBox();
		locationChoiceBox.getItems().addAll("Hồ Chí Minh", "Dắk Lắk", "Lâm ĐỒng", "Vũng Tàu", "Bình Phước");
		
//		Label for register
		Button buttonRegister = new Button("Register");
		
//		Creating a Grid pane
		GridPane gridPane = new GridPane();
		
//		Setting size for the pane
		gridPane.setMinSize(500, 500);
		
//		Setting the Padding
		gridPane.setPadding(new Insets(10,10,10,10));
		
//		Setting the Vertical and Horizontal gaps between the columns
		gridPane.setVgap(5);
		gridPane.setHgap(5);
		
//		Setting the Grid alignment
		gridPane.setAlignment(Pos.CENTER);
		
//		Arranging all the nodes in the grid
		gridPane.add(nameLable, 0, 0);//0,0 là hàng 0 cột 0
		gridPane.add(nameText, 1, 0);//1,0 là hàng 1 cột 0
		
		gridPane.add(doLabel, 0, 1);//0,1 là hàng 0 cột 1
		gridPane.add(datePicker, 1, 1);//1,1 là hàng 1 cột 1
		
		gridPane.add(genderLable, 0, 2);//0,2 là hàng 0 cột 2
		gridPane.add(maleRadio, 1, 2);
		gridPane.add(femaleRadio, 2, 2);
		
		gridPane.add(reservationLabel, 0, 3);
		gridPane.add(yes, 1, 3);
		gridPane.add(no, 2, 3);
		
		gridPane.add(technologiesLabel, 0, 4);
		gridPane.add(javaCheckBox, 1, 4);
		gridPane.add(cppCheckBox, 2, 4);
		
		gridPane.add(educationlabel, 0, 5);
		gridPane.add(educationListView, 1, 5);
		
		gridPane.add(locationLabel, 0, 6);
		gridPane.add(locationChoiceBox, 1, 6);
		
		gridPane.add(buttonRegister, 2, 8);
		
		Scene scene = new Scene(gridPane);
		tage.setTitle("Registration Form");
		tage.setScene(scene);
		tage.show();
	}
public static void main(String[] args) {
	launch(args);
}
}
