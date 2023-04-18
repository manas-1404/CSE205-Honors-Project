package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

//import javafx.application.Application;
import javafx.scene.control.Button;

public class AcademicAdvising extends Application
{
	
	int flag = -1;
	
	public void start(Stage stage)
	{
		StackPane root = new StackPane();
		IntroPane coursePane = new IntroPane();
		root.getChildren().add(coursePane);

		Scene scene = new Scene(root, 800, 600);
		stage.setTitle("ASU Academic Advising System");
		stage.setScene(scene);
		stage.show();
	}
	
	
	
 public static void main(String[] args)
{
	 launch(args);
	 
} 
}
