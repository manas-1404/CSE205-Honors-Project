package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AcademicAdvising extends Application
{
	
	public StackPane root = new StackPane();
	
	public VBox introScene = new VBox();
	
	public BorderPane ScheduleScene = new BorderPane();
	
	public BorderPane thirdScene = new BorderPane();
	
	public VBox lastScene = new VBox();
	
	public ArrayList<Button> ButtonList = new ArrayList<>();
	
	public Button start = new Button("Schedule Now");
	
	public Button book = new Button("Book Now!");
	
	public TextField ename = new TextField();
	public TextField emajor = new TextField();
	public TextField enter_email = new TextField();
	public TextField ephno = new TextField();
	
	public TextArea answer = new TextArea();
	
	public Label fillform;
	
	public void start(Stage stage)
	{
		//initializing the Pane
				
		
		Label heading=new Label("Arizona State University");
		Label topic = new Label("Acadmic Advising Office");
		Label SCAI0 = new Label("School of Computing and Augmented Intelligence");
				
		//formatting the labels with color, size and BOLD
		heading.setTextFill(Color.RED);
		heading.setFont(Font.font(null, 50));
		heading.setStyle("-fx-font-weight: bold;");
		
		topic.setTextFill(Color.RED);
		topic.setFont(Font.font(null,40));
		topic.setStyle("-fx-font-weight: bold;");

		SCAI0.setTextFill(Color.RED);
		SCAI0.setFont(Font.font(null, 33));
		SCAI0.setStyle("-fx-font-weight: bold;");
				
		//formatting the button with color and size
		start.setFont(Font.font(null,23));
				
		//setting the positions of the labels & button
		heading.setTranslateX(130);	
		heading.setTranslateY(30);
				
		SCAI0.setTranslateX(15);
		SCAI0.setTranslateY(60);
				
		topic.setTranslateX(185);
		topic.setTranslateY(90);
				
		start.setTranslateX(305);
		start.setTranslateY(150);
					
		//adding the nodes to the introScene (firstScene)
		introScene.getChildren().add(heading);
		introScene.getChildren().add(SCAI0);
		introScene.getChildren().add(topic);
		introScene.getChildren().add(start);
				
		//assigning a ButtonHandler for start
		start.setOnAction(new ButtonHandler());
		
		//adding the introScene to the root 
		root.getChildren().add(introScene);

		
		//2nd Scene: Schedule Pane
		Button BookButton = new Button("Book");
		
		//creating an arrayList to store different types of schedule availability
		ArrayList<String> status = new ArrayList<>();
		status.add("Book");
		status.add("N/A");
		
		
		int randomNumber;
		
		
		GridPane Schedule = new GridPane();
		
		Label SCAI= new Label("School of Computing and Augmented Intelligence\n	Academic Advising Office Schedule ");
		//AAS = new Label("Academic Advising Office Schedule");
		
		SCAI.setFont(Font.font(null, 33));
		SCAI.setStyle("-fx-font-weight: bold;");
		//AAS.setFont(Font.font(null, 30));
		
		
		ScheduleScene.setTop(SCAI);
		//ScheduleScene.setCenter(AAS);
		
		Label TimeDay = new Label("Time/Day");
		TimeDay.setFont(Font.font(null, 20));
		TimeDay.setStyle("-fx-font-weight: bold;");
		
		Label mon = new Label("  Monday  ");
		mon.setFont(Font.font(null, 20));
		mon.setStyle("-fx-font-weight: bold;");
		
		Label tues = new Label("  Tuesday  ");
		tues.setFont(Font.font(null, 20));
		tues.setStyle("-fx-font-weight: bold;");
		
		Label wed = new Label("  Wednesday  ");
		wed.setFont(Font.font(null, 20));
		wed.setStyle("-fx-font-weight: bold;");
		
		Label thur = new Label("  Thursday  ");
		thur.setFont(Font.font(null, 20));
		thur.setStyle("-fx-font-weight: bold;");
		
		Label fri = new Label("  Friday  ");
		fri.setFont(Font.font(null, 20));
		fri.setStyle("-fx-font-weight: bold;");
		
		Label t900 = new Label("9:00");
		t900.setFont(Font.font(null, 20));
		t900.setStyle("-fx-font-weight: bold;");
		
		Label t930 = new Label("9:30");
		t930.setFont(Font.font(null, 20));
		t930.setStyle("-fx-font-weight: bold;");
		
		Label t1000 = new Label("10:00");
		t1000.setFont(Font.font(null, 20));
		t1000.setStyle("-fx-font-weight: bold;");
		
		Label t1030 = new Label("10:30");
		t1030.setFont(Font.font(null, 20));
		t1030.setStyle("-fx-font-weight: bold;");
		
		Label t1100 = new Label("11:00");
		t1100.setFont(Font.font(null, 20));
		t1100.setStyle("-fx-font-weight: bold;");
		
		Label t1130 = new Label("11:30");
		t1130.setFont(Font.font(null, 20));
		t1130.setStyle("-fx-font-weight: bold;");
		
		Label t1200 = new Label("12:00");
		t1200.setFont(Font.font(null, 20));
		t1200.setStyle("-fx-font-weight: bold;");
		
		Label t1230 = new Label("12:30");
		t1230.setFont(Font.font(null, 20));
		t1230.setStyle("-fx-font-weight: bold;");
		
		Label t100 = new Label("1:00");
		t100.setFont(Font.font(null, 20));
		t100.setStyle("-fx-font-weight: bold;");
		
		Label t130 = new Label("1:30");
		t130.setFont(Font.font(null, 20));
		t130.setStyle("-fx-font-weight: bold;");
		
		Label t200 = new Label("2:00");
		t200.setFont(Font.font(null, 20));
		t200.setStyle("-fx-font-weight: bold;");
		
		Label t230 = new Label("2:30");
		t230.setFont(Font.font(null, 20));
		t230.setStyle("-fx-font-weight: bold;");
		
		Label t300 = new Label("3:00");
		t300.setFont(Font.font(null, 20));
		t300.setStyle("-fx-font-weight: bold;");
		
		Label t330 = new Label("3:30");
		t330.setFont(Font.font(null, 20));
		t330.setStyle("-fx-font-weight: bold;");
		
		Label t400 = new Label("4:00");
		t400.setFont(Font.font(null, 20));
		t400.setStyle("-fx-font-weight: bold;");
		
		Label t430 = new Label("4:30");
		t430.setFont(Font.font(null, 20));
		t430.setStyle("-fx-font-weight: bold;");
		
		
		Schedule.setGridLinesVisible(true);
		Schedule.setStyle("-fx-font-weight: bold;");
		Schedule.setVgap(2);

		
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
		
		
		//for loop to create the components of the schedule table
		for(int i=1; i<=5;i++) {
			for(int j=1;j<=16;j++) {
				
				//generates a random number between 0 and 1, including both 
				randomNumber = (int)(Math.random() * 2) ;
				
				//checking the status of the appointment based on the random number generator
				if(status.get(randomNumber).equals("Book")) {
					
					//if the appointment is available then, create a button using createButton method at that location
					Schedule.add(createButton(), i, j);
				}else {
					
					//if appointment is not available then, create a new label instead
					Schedule.add(new Label("N/A"), i, j);
				}
			}
		}
		
		BookButton.setOnAction(new ButtonHandler());
		
		
		ScheduleScene.setTop(SCAI);
		ScheduleScene.setLeft(new Label("  		 "));
		ScheduleScene.setCenter(Schedule);
		

		//detailsScene: 3rd scene
		GridPane DetailScene = new GridPane();
		VBox top = new VBox();
		
		
		Label SCAI2= new Label("  School of Computing and Augmented Intelligence\n	\t     Academic Advising Office\n");
		SCAI2.setFont(Font.font(null, 32));
		SCAI2.setStyle("-fx-font-weight: bold;");
		
		
		fillform = new Label("Please respond to the below mentioned questions. *");
		fillform.setFont(Font.font(null, 20));
		fillform.setStyle("-fx-font-weight: bold;");
		
		
		Label name = new Label("Name* : ");
		Label major = new Label("Major* : ");
		Label asu_email = new Label("ASU Email* : ");
		Label phno = new Label("ASU ID* : ");
		Label reason = new Label("Select the reason(s) for your appointment:");
		Label question = new Label("Specific questions or other comments?* ");
		
		
		name.setFont(Font.font(null, 23));
		major.setFont(Font.font(null, 23));
		asu_email.setFont(Font.font(null, 23));
		phno.setFont(Font.font(null, 23));
		reason.setFont(Font.font(null, 23));
		question.setFont(Font.font(null, 23));
		
		book.setStyle("-fx-font-weight: bold;");
		
		
		top.getChildren().add(SCAI2);
		top.getChildren().add(fillform);
		
		
		CheckBox r1=new CheckBox("Enrollment Issue");
		CheckBox r2=new CheckBox("Hold on Account");
		CheckBox r3=new CheckBox("General questions about my undergraduate degree");
		CheckBox r4=new CheckBox("Learn about campus resources");
		CheckBox r5=new CheckBox("Opportunities to get involved (research, clubs, organizations)");
		CheckBox r6=new CheckBox("Change of Major");
		CheckBox r7=new CheckBox("Withdrawal from Semester");
		CheckBox r8=new CheckBox("Personal");
		CheckBox r9=new CheckBox("Other");
		
		
		answer.setPrefRowCount(2);
		answer.setPrefColumnCount(2);
		
		DetailScene.setVgap(5);
		
		DetailScene.add(name, 0,0);
		DetailScene.add(major, 0,1);
		DetailScene.add(asu_email, 0,2);
		DetailScene.add(phno, 0,3);
		DetailScene.add(reason, 0,4);
		
		DetailScene.add(ename, 1,0);
		DetailScene.add(emajor, 1,1);
		DetailScene.add(enter_email, 1,2);
		DetailScene.add(ephno, 1,3);
		
		DetailScene.add(r1, 0,5);
		DetailScene.add(r2, 0,6);
		DetailScene.add(r3, 0,7);
		DetailScene.add(r4, 0,8);
		DetailScene.add(r5, 0,9);
		DetailScene.add(r6, 0,10);
		DetailScene.add(r7, 0,11);
		DetailScene.add(r8, 0,12);
		DetailScene.add(r9, 0, 13);
		
		DetailScene.add(question, 0,14);
		DetailScene.add(answer, 0, 15);
		
		book.setOnAction(new ButtonHandler());
		
		
		thirdScene.setTop(top);
		thirdScene.setLeft(new Label("    \t"));
		thirdScene.setCenter(DetailScene);
		thirdScene.setBottom(book);
		
		
		//lastScene
		
		Label thanks = new Label("Your appointment has been confirmed! One of the advisors \n\t\tfrom our office will contact you soon. \n\t\t\tThank you for choosing SCAI!");
		thanks.setFont(Font.font(null, 25));
		thanks.setStyle("-fx-font-weight: bold;");
		thanks.setTextFill(Color.RED);
		
		Label SCAI3 = new Label(" School of Computing and Augmented Intelligence\n  	\t     Academic Advising Office");
		SCAI3.setFont(Font.font(null, 32));
		SCAI3.setTextFill(Color.RED);
		SCAI3.setStyle("-fx-font-weight: bold;");
		
		int confirmationID = (int)(Math.random() * 9000000) + 1000000;
		Label confirmation = new Label("Your Booking Confirmation ID is "+confirmationID+"\n\n\nIf you have any querries regarding the booking,\n\tcontact us at "+"480-965-3199");
		confirmation.setFont(Font.font(null, 24));
		confirmation.setStyle("-fx-font-weight: bold;");
		
		SCAI3.setTranslateX(10);	
		SCAI3.setTranslateY(30);
		
		thanks.setTranslateX(40);
		thanks.setTranslateY(80);
		
		confirmation.setTranslateX(130);
		confirmation.setTranslateY(160);
		
		lastScene.getChildren().add(SCAI3);
		lastScene.getChildren().add(thanks);
		lastScene.getChildren().add(confirmation);
		

		//stage implementation
		Scene scene = new Scene(root, 800, 700);
		root.setStyle("-fx-background-color: gold;");
		stage.setTitle("ASU Academic Advising System");
		stage.setScene(scene);
		stage.show();

	}

	public Button createButton() {
		
		//create new button
		Button buttonBook = new Button("Book");
		
		//assign a buttonHandler to the button
		buttonBook.setOnAction(new ButtonHandler());
		
		//add the created button to the ButtonList ArrayList
		ButtonList.add(buttonBook);
		buttonBook.setStyle("-fx-font-weight: bold;");
		return buttonBook;			//return the newly formed button
	}
	
	
	class ButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			Button source = (Button)event.getSource();
				
			//condition for the 1st Scene, introScene
			if(source == start) {
				root.getChildren().remove(introScene);
				root.getChildren().add(ScheduleScene);
			}
			//condition for the 2nd Scene, ScheduleScene
			else if(source == book) {
				if(ename.getText().equals("") || emajor.getText().equals("") || enter_email.getText().equals("") || ephno.getText().equals("") || answer.getText().equals("")) {
					fillform.setText("Please respond to all the below mentioned questions");
					fillform.setTextFill(Color.RED);
					fillform.setStyle("-fx-font-weight: bold;");
				}
				else {
					root.getChildren().remove(thirdScene);
					root.getChildren().add(lastScene);
				}	
			}
			//condition for the 3rd Scene, thirdScene
			else {
					root.getChildren().remove(ScheduleScene);
					root.getChildren().add(thirdScene);
				}
			}
		}
	
 public static void main(String[] args)
{
	 launch(args);
	 
} 
}