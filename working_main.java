package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

//import application.SchedulePane.ButtonHandler;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
//import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AcademicAdvising extends Application
{
	
	int flag = -1;
	public Button start = new Button("Schedule Now!");
	
	public StackPane root = new StackPane();
	
	public VBox introScene = new VBox();
	
	public ArrayList<Button> ButtonList = new ArrayList<>();
	
	public VBox lastScene = new VBox();
	
	public GridPane Schedule;
	
	public void start(Stage stage)
	{
		
//		IntroPane coursePane = new IntroPane();
		
		//initializing the Pane
				
				
				Label heading=new Label("Arizona State University");
				Label topic = new Label("Acadmic Advising Office");
		
				
				heading.setTextFill(Color.RED);
				heading.setFont(Font.font(null, 50));
				
				topic.setTextFill(Color.RED);
				topic.setFont(Font.font(null,40));
				
				start.setFont(Font.font(null,20));
				
				heading.setTranslateX(150);	
				heading.setTranslateY(30);
				
				topic.setTranslateX(185);
				topic.setTranslateY(50);
				
				start.setTranslateX(310);
				start.setTranslateY(120);
				
				introScene.getChildren().add(heading);
				introScene.getChildren().add(topic);
				introScene.getChildren().add(start);
				
//				this.getChildren().add(introScene);
				
				start.setOnAction(new ButtonHandler());
		root.getChildren().add(introScene);
		
		//schedule pane
		Button BookButton = new Button("Book");
		
		ArrayList<String> status = new ArrayList<>();
		
		int randomNumber;
		
		
		BorderPane ScheduleScene;
		Label SCAI;
		Label AAS;
		
		Label TimeDay;
		Label mon;
		Label tues;
		Label wed;
		Label thur;
		Label fri;
		
		Label t900;
		Label t930;
		Label t1000;
		Label t1030;
		Label t1100;
		Label t1130;
		Label t1200;
		Label t1230;
		Label t100;
		Label t130;
		Label t200;
		Label t230;
		Label t300;
		Label t330;
		Label t400;
		Label t430;
		
		
		
		status.add("Book");
		status.add("N/A");
		ScheduleScene = new BorderPane();
		Schedule = new GridPane();
		
		SCAI= new Label("School of Computing and Augmented Intelligence\n	Academic Advising Office Schedule ");
		//AAS = new Label("Academic Advising Office Schedule");
		
		SCAI.setFont(Font.font(null, 35));
		
		//AAS.setFont(Font.font(null, 30));
		
		
		ScheduleScene.setTop(SCAI);
		//ScheduleScene.setCenter(AAS);
		
		TimeDay = new Label("Time/Day");
		TimeDay.setFont(Font.font(null, 20));
		
		mon = new Label("  Monday  ");
		mon.setFont(Font.font(null, 20));
		
		tues = new Label("  Tuesday  ");
		tues.setFont(Font.font(null, 20));
		
		wed = new Label("  Wednesday  ");
		wed.setFont(Font.font(null, 20));
		
		thur = new Label("  Thursday  ");
		thur.setFont(Font.font(null, 20));
		
		fri = new Label("  Friday  ");
		fri.setFont(Font.font(null, 20));
		
		t900 = new Label("9:00");
		t900.setFont(Font.font(null, 20));
		
		t930 = new Label("9:30");
		t930.setFont(Font.font(null, 20));
		
		t1000 = new Label("10:00");
		t1000.setFont(Font.font(null, 20));
		
		t1030 = new Label("10:30");
		t1030.setFont(Font.font(null, 20));
		
		t1100 = new Label("11:00");
		t1100.setFont(Font.font(null, 20));
		
		t1130 = new Label("11:30");
		t1130.setFont(Font.font(null, 20));
		
		t1200 = new Label("12:00");
		t1200.setFont(Font.font(null, 20));
		
		t1230 = new Label("12:30");
		t1230.setFont(Font.font(null, 20));
		
		t100 = new Label("1:00");
		t100.setFont(Font.font(null, 20));
		
		t130 = new Label("1:30");
		t130.setFont(Font.font(null, 20));
		
		t200 = new Label("2:00");
		t200.setFont(Font.font(null, 20));
		
		t230 = new Label("2:30");
		t230.setFont(Font.font(null, 20));
		
		t300 = new Label("3:00");
		t300.setFont(Font.font(null, 20));
		
		t330 = new Label("3:30");
		t330.setFont(Font.font(null, 20));
		
		t400 = new Label("4:00");
		t400.setFont(Font.font(null, 20));
		
		t430 = new Label("4:30");
		t430.setFont(Font.font(null, 20));
		
		
		Schedule.setGridLinesVisible(true);
//		Schedule.setVgap(5);
//		Schedule.setHgap(10);
		
		Schedule.add(TimeDay, 0, 0);
		Schedule.add(mon, 1, 0);
		Schedule.add(tues, 2, 0);
		Schedule.add(wed, 3, 0);
		Schedule.add(thur, 4, 0);
		Schedule.add(fri, 5, 0);
		
	
		Schedule.add(t900, 0, 1);
		Schedule.add(t930, 0, 2);
		Schedule.add(t1000, 0, 3);
		Schedule.add(t1030, 0, 4);
		Schedule.add(t1100, 0, 5);
		Schedule.add(t1130, 0, 6);
		Schedule.add(t1200, 0, 7);
		Schedule.add(t1230, 0, 8);
		Schedule.add(t100, 0, 9);
		Schedule.add(t130, 0, 10);
		Schedule.add(t200, 0, 11);
		Schedule.add(t230, 0, 12);
		Schedule.add(t300, 0, 13);
		Schedule.add(t330, 0, 14);
		Schedule.add(t400, 0, 15);
		Schedule.add(t430, 0, 16);
		
		
		for(int i=1; i<=5;i++) {
			for(int j=1;j<=16;j++) {
				randomNumber = (int)(Math.random() * 2) ;
				
				if(status.get(randomNumber).equals("Book")) {
					Schedule.add(createButton(), i, j);
				}else {
					Schedule.add(new Label("N/A"), i, j);
				}
				
			}
		}
		
		BookButton.setOnAction(new ButtonHandler());
		
		ScheduleScene.setLeft(new Label("  			 "));
		ScheduleScene.setCenter(Schedule);
		
		
		//lastScene
//		lastScene.getChildren().add(heading);
//		lastScene.getChildren().add(topic);
		lastScene.getChildren().add(new Label("Thank you so mcuh!!"));
		
//		this.getChildren().add(ScheduleScene);

		Scene scene = new Scene(root, 800, 600);
		stage.setTitle("ASU Academic Advising System");
		stage.setScene(scene);
		stage.show();
		
	}
	
	public Button createButton() {
		Button buttonBook = new Button("Book");
		buttonBook.setOnAction(new ButtonHandler());
		ButtonList.add(buttonBook);
		return buttonBook;	
	}
	
	
		class ButtonHandler implements EventHandler<ActionEvent> {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Button source = (Button)event.getSource();
				
				if(source == start) {
					
//					IntroPane Scene2 = new IntroPane();
					System.out.println("Button is working");
					root.getChildren().remove(introScene);
					root.getChildren().add(Schedule);
				}
				else {
					System.out.println("Booked!");
					root.getChildren().remove(Schedule);
					root.getChildren().add(lastScene);
				}
			}

		}
		
		
//		public class ButtonHandler implements EventHandler<ActionEvent> {
//
//			@Override
//			public void handle(ActionEvent event) {
//				// TODO Auto-generated method stub
//				Button BookSource = (Button)event.getSource();
//				for(int i=0;i<60;i++) {
//					if(BookSource == ButtonList.get(i)) {
//						System.out.println("Booked!");
//						
//						
//						
//						//add further code which will lead to scene3
//						break;
//					}
//				}
//			}
//		}
	
	
	
	
 public static void main(String[] args)
{
	 launch(args);
	 
} 
}
