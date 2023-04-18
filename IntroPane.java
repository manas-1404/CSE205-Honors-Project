package application;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

//import application.CheckBoxGUI.CheckBoxHandler;

public class IntroPane extends VBox{
	
	int flag=-1;
	
	
	
	private VBox introScene;
	private Label heading;
	private Label topic;
	private Button start;
	
	
	
	
	//default constructor
	public IntroPane(){
		
		if(flag==-1) {
			
			
		}
		
		//initializing the Pane
		introScene = new VBox();
		
		heading=new Label("Arizona State University");
		topic = new Label("Acadmic Advising Office");
		
		start = new Button("Schedule Now!");
		
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
		
		this.getChildren().add(introScene);
		
		start.setOnAction(new ButtonHandler());
		
		
		
		if(flag==1) {
			
		}
		
		
	}
	
	public class ButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			Button source = (Button)event.getSource();
			
			if(source == start) {
				flag=1;
				
				
//				IntroPane Scene2 = new IntroPane();
				System.out.println("Button is working");
			
				
			}
		}

	}

}
