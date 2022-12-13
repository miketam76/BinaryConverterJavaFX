package application;

import BinaryCore.Controller;
import BinaryCore.ControllerIMPL;
import BinaryCore.ModelBinaryConverter;
	
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Main extends Application {
	
	// Main application
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) {
		try {
			// Set form to load fxml file
			Parent root = FXMLLoader.load(getClass().getResource("./binaryconverterform.fxml"));
						
			// Build scene and get objects
			Scene scene = new Scene(root,250,250);
			Button btnConvert = (Button) scene.lookup("#btnConvert");
			Label result = (Label) scene.lookup("#result");
			TextField inputText = (TextField) scene.lookup("#inputText");
			
			primaryStage.setTitle("Binary Converter");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			// Event handler for key pressed in TextField
			inputText.setOnKeyPressed(new EventHandler<KeyEvent>() {

				@Override
				public void handle(KeyEvent keypress) {
					try {
						if(keypress.getCode().equals(KeyCode.ENTER)) {
							result.setText(ControllerIMPL.convertToBinary(Integer.parseInt(inputText.getText())));
						}
					}
					catch(NumberFormatException n) {
						result.setText("Enter a number");
					}
				}
				
			});
			
			// Event handler for button pressed
			btnConvert.setOnAction(new EventHandler() {
				public void handle(Event event) {
					try {
						result.setText(ControllerIMPL.convertToBinary(Integer.parseInt(inputText.getText())));
					}
					catch(NumberFormatException n) {
						result.setText("Enter a number");
					}
				}	
			});
			
		} 
		catch(Exception e) {
			System.out.println("You need to enter a value!");
		}
	}
	
	public static void main(String[] args) {
		// Launch JavaFx Application
		launch(args);
	}
}
