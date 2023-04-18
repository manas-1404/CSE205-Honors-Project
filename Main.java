package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage stage)
	{
		StackPane root = new StackPane();
		SchedulePane coursePane = new SchedulePane();
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
