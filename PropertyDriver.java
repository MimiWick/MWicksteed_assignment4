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
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

public class PropertyDriver extends Application {

	public static void main(String[] args) {
		ManagementCompany company= new ManagementCompany("Campus Realty Managment", "123-45-6789");
		company.addProperty(new Property("Property-1", "Rockville", "Joe", 3500));
		company.addProperty(new Property("Property-2", "Gaithersburg", "Meri", 2500));
		System.out.println("Company: "+ company);
		launch(args);
	}
	@Override
	
	public void start(Stage stage) throws Exception {
		PropertyAppFx root = new PropertyAppFx();
		stage.setScene(new Scene(root));
		stage.setTitle("Property Manager");
		stage.show();
	}
}
