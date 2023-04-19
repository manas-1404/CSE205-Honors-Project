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
		StackPane root2 = new StackPane();
		IntroPane page1 = new IntroPane();
	    SchedulePane page2 = new SchedulePane();
		root.getChildren().addAll(page1,page2);
		Scene scene = new Scene(root, 800, 600);
		stage.setTitle("ASU Academic Advising System");
		stage.setScene(scene);
		stage.show();
		
		page1.getStart().setOnAction(event -> {
            boolean visible = page2.isVisible();
            page2.setVisible(visible);
        });
	}

	
 public static void main(String[] args)
{
	 launch(args);

} 
}
