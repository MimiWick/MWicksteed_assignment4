package propertyManager;
/*
 * Class: CMSC203 20978
 * Instructor: Ahmed Tarek
 * Description: Property Manager
 * Due: 10/28/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Mia Wicksteed
*/
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class PropertyAppFx extends VBox{
	private TextField propertyName, cityName, rentText, ownerName;
	private TextArea output;
	private Label propsLabel, totalRentLabel, propertyNameLabel, cityLabel, rentLabel, ownerLabel;
	private Button addPropButton, calcRentButton, exitButton, clearButton, showAllButton;
	private ManagementCompany company;
	private HBox hBox1, hBox2, hBox3, hBox4,hBox5,hBox6;
	
	public PropertyAppFx() {
		addPropButton = new Button("Add Property");
		calcRentButton = new Button("Calculate Total Rent");
		clearButton = new Button("Clear");
		exitButton = new Button("Exit");
		propertyName = new TextField();
		cityName = new TextField();
		rentText = new TextField();
		ownerName = new TextField();
		output= new TextArea();
		propertyNameLabel = new Label("Property Name: ");
		cityLabel = new Label("City: ");
		rentLabel = new Label("Rent: ");
		ownerLabel = new Label("Owner: ");
		propsLabel = new Label("Properties: ");
		totalRentLabel = new Label("Total Rent: ");
		showAllButton= new Button("Show All Properties");
		hBox1= new HBox();
		hBox2= new HBox();
		hBox3= new HBox();
		hBox4= new HBox();
		hBox5= new HBox();
		hBox6= new HBox();
		company= new ManagementCompany("Campus Realty Managment", "123-45-6789");
		
		Insets margins = new Insets(10);
//		Insets insets=new Insets(30);
		HBox.setMargin(addPropButton, margins);
		HBox.setMargin(calcRentButton, margins);
		HBox.setMargin(clearButton, margins);
		HBox.setMargin(exitButton, margins);
		HBox.setMargin(propsLabel, margins);
		HBox.setMargin(totalRentLabel, margins);
		HBox.setMargin(cityLabel, margins);
		HBox.setMargin(rentLabel, margins);
		HBox.setMargin(ownerLabel, margins);
		HBox.setMargin(propertyNameLabel, margins);
		HBox.setMargin(propertyName, margins);
		HBox.setMargin(cityName, margins);
		HBox.setMargin(ownerName, margins);
		HBox.setMargin(rentText, margins);
		
		VBox.setMargin(hBox1, margins);
		VBox.setMargin(hBox2, margins);
		VBox.setMargin(hBox3, margins);
		VBox.setMargin(hBox4, margins);
		VBox.setMargin(hBox5, margins);
//		VBox.setMargin(hBox6, insets);
		hBox6.setAlignment(Pos.CENTER);
		hBox5.setAlignment(Pos.CENTER);
		
		hBox1.getChildren().addAll( propertyNameLabel, propertyName);
		hBox2.getChildren().addAll( cityLabel, cityName);
		hBox3.getChildren().addAll( rentLabel, rentText);
		hBox4.getChildren().addAll( ownerLabel, ownerName);
		hBox5.getChildren().addAll( addPropButton, calcRentButton, showAllButton, clearButton, exitButton);
		hBox6.getChildren().addAll(output);
		this.getChildren().addAll(hBox1, hBox2, hBox3, hBox4, hBox5, hBox6);
		
		addButtonActions handler = new addButtonActions();
		clearButton.setOnAction(handler);
		exitButton.setOnAction(handler);
		addPropButton.setOnAction(handler);
		calcRentButton.setOnAction(handler);
		showAllButton.setOnAction(handler);
	}
	
	private class addButtonActions implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			Object source = event.getSource();
			if (source== exitButton) {
				Platform.exit();
			} else if (source==clearButton) {
				propertyName.clear();
				cityName.clear();
				rentText.clear();
				ownerName.clear();
			} else if (source==addPropButton) {
				String propName = propertyName.getText();
				String city = cityName.getText();
				String owner = ownerName.getText();
				String rentAsStr = rentText.getText();
				double rent= Double.parseDouble(rentAsStr);
				
				Property property= new Property(propName, city, owner, rent);
				company.addProperty(property);
				output.setText("Property Added");
			} else if (source==calcRentButton) {
				output.setText("Total Rent: "+ company.totalRent());
			}
			else if (source==showAllButton) {
			output.setText(company.toString());
			}
		}
	}
}
