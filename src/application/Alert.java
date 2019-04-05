package application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;



public class Alert {
 public static void displayAlert (String msg)
 {
	 Stage window=new Stage();
	 window.setTitle("Warning");
	 window.initModality(Modality.APPLICATION_MODAL);
	 window.setMinWidth(250);
	 
	 
	 
	 VBox layout= new VBox(10);
	 Scene scene = new Scene(layout);
	 
	 Button btn1= new Button("Okay");
	btn1.setOnAction(e->window.close());
	
	Label lb1= new Label(msg);
	
	 
	 
			 
			 
			 
			 layout.getChildren().addAll(btn1,lb1);
			 layout.setAlignment(Pos.CENTER);
			 
			 
			 window.setScene(scene);
			 window.showAndWait();
			 
 }
}