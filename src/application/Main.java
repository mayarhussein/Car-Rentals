package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox; 
import javafx.scene.control.ListView;



public class Main extends Application {
	@Override
	public void start(Stage arg0) throws Exception {
		Stage stage1 = new Stage();
		stage1.setTitle("App");
		
		//Scene1
		GridPane layout1 = new GridPane();
		Scene scene1 = new Scene(layout1, 400, 400);
		layout1.setPadding(new Insets(10,10,10,10));
		layout1.setVgap(8);
		layout1.setHgap(10);
		
		GridPane layout3 = new GridPane();
		Scene loginSc = new Scene(layout3, 400, 400);
		layout3.setPadding(new Insets(10,10,10,10));
		layout3.setVgap(8);
		layout3.setHgap(10);
		
		
		//Scene2
		GridPane layout2 = new GridPane();
     	Scene scene2 = new Scene(layout2, 400, 400);
		layout2.setPadding(new Insets(10,10,10,10));
		layout2.setVgap(8);
		layout2.setHgap(10);
		
		
		
		GridPane layout4 = new GridPane();
		Scene bookingSc = new Scene(layout4, 400, 400);
		layout4.setPadding(new Insets(10,10,10,10));
		layout4.setVgap(8);
		layout4.setHgap(10);
		
		
		
		
		// Buttons
		Button button1 = new Button("Passenger");
		layout1.setConstraints(button1, 1, 1);
		button1.setOnAction(e ->stage1.setScene(loginSc));
		
		Button login1 = new Button("Login");
		layout3.setConstraints(login1, 0, 7);
		login1.setOnAction(e ->stage1.setScene(scene2));
		
		Button login2 = new Button("Login");
		layout3.setConstraints(login2, 0, 7);
		login2.setOnAction(e ->stage1.setScene(scene2));
		
		
		Button button2 = new Button("Employee");
		layout1.setConstraints(button2, 1, 2);
		button1.setOnAction(e ->stage1.setScene(loginSc));
		
		Button bookTrip = new Button("Book a new trip");
		layout2.setConstraints(bookTrip, 1, 1);
		
		Button showBookedTrips = new Button("Show Booked Trips");
		layout2.setConstraints(showBookedTrips, 1, 5);
		
		Button showProfile = new Button("Show Profile");
		layout2.setConstraints(bookTrip, 1, 7);

		Label lb1 = new Label("Account Number");
		GridPane.setConstraints(lb1,0, 0);
		
		Label lb2 = new Label("Password");
		GridPane.setConstraints(lb2,1, 0);
		
		TextField txt1 = new TextField();
		GridPane.setConstraints(txt1,0, 1);
		
		PasswordField txt2= new PasswordField();
		GridPane.setConstraints(txt2,1, 1);
		txt2.setPromptText("password");
		
		
		stage1.setScene(scene1);
		stage1.show();
		
		
		
		bookTrip.setOnAction(e->{stage1.setScene(bookingSc);
		bookATrip();
		});
		
	
		
		layout1.getChildren().addAll(button1, button2);
		layout2.getChildren().addAll(showBookedTrips,bookTrip,showProfile);
		layout3.getChildren().addAll(login1,lb1,lb2,txt1,txt2);
		
		

	}

	public void bookATrip() {
		Stage bookingStage = new Stage();
		HBox layout = new HBox(20);
		GridPane layout1 = new GridPane();
		Scene bookingScene = new Scene(layout, 400, 400);
		
		//Buttons
		Button bookBus = new Button("Bus");
		bookBus.setOnAction(e->bookABus(bookingStage));
		
		Button bookMinibus = new Button("Minibus");
		bookMinibus.setOnAction(e->bookABus(bookingStage));
		
		Button limo = new Button("Limousine");
		limo.setOnAction(e->bookALimo(bookingStage));

		layout.getChildren().addAll(bookBus, bookMinibus, limo);
		
		bookingStage.setScene(bookingScene);
		bookingStage.show();
	}

	public void bookALimo(Stage bookingStage) {
		GridPane layout1 = new GridPane();
		Scene sceneOfLimo = new Scene(layout1, 400, 400);
		bookingStage.setScene(sceneOfLimo);
		
		TextField search1 =new TextField();
		GridPane.setConstraints(search1, 0, 0);
		search1.setPromptText("Enter your destination");
		
		TextField search2 = new TextField();
		GridPane.setConstraints(search2, 0, 1);
		search2.setPromptText("Enter pickup location");
		
		Button bookLimo= new Button("Book");
		GridPane.setConstraints(bookLimo, 0, 7);
		bookLimo.setOnAction(e->{
			String destination= search1.getText();
			String pickup=search2.getText();
			
	
		});
		
		ChoiceBox <String> choiceBox1= new ChoiceBox<>();
		
		GridPane.setConstraints(choiceBox1,1,2);
		
		
		Label lb1= new Label("Destination");
		GridPane.setConstraints(lb1,1,0);
		
		Label lb2= new Label("Pickup");
		GridPane.setConstraints(lb2,1,1);
		
		Label lb3= new Label("show Vehicles");
		GridPane.setConstraints(lb3,1,2);
	

		layout1.getChildren().addAll(bookLimo,lb1,lb2,lb3,search1,search2, choiceBox1);
		
	}
	
	
	public void bookABus(Stage bookingStage) {
		GridPane layout1 = new GridPane();
		Scene sceneOfBus = new Scene(layout1, 400, 400);
		bookingStage.setScene(sceneOfBus);
		
	
	ComboBox <String> comboBox1= new ComboBox<>();
	comboBox1.setPromptText("See available options");
	GridPane.setConstraints(comboBox1,0,1);
	
	
	ComboBox <String> comboBox2= new ComboBox<>();
	comboBox2.setPromptText("Kind of trip");
	comboBox2.getItems().addAll("One Way","Round Trip");
	GridPane.setConstraints(comboBox2,1,2);
	
	
	ComboBox <String> comboBox3= new ComboBox<>();
	comboBox3.setPromptText("Number of stops");
	comboBox3.getItems().addAll("0","1","2","...");
	GridPane.setConstraints(comboBox3,2,5);
	comboBox3.setEditable(true);
	
	ComboBox <String> comboBox4= new ComboBox<>();
	comboBox4.setPromptText("Number of passengers");
	comboBox4.getItems().addAll("1","2","3","...");
	GridPane.setConstraints(comboBox4,2,7);
	comboBox4.setEditable(true);
	
		
	Button save= new Button("Save");
	GridPane.setConstraints(save, 0, 7);
	
	Button back= new Button("Back");
	GridPane.setConstraints(back, 1, 7);
	
		
		
		layout1.getChildren().addAll(comboBox1,comboBox2,comboBox3,comboBox4,save,back);
	}
	
		

	
	

	
	public static void main(String[] args) {
		launch(args);
	}
}
