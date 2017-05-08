package main.application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import main.logic.PLLogic;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class PLDriver extends Application {
	@FXML
	TextArea Input;
	@FXML
	TextArea Output;
	@FXML
	Button Translate;

	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = new AnchorPane();
			
			root = FXMLLoader.load(getClass().getResource("../resources/PL.fxml"));
			
			Scene scene = new Scene(root, 400, 300);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Pig Latin Translator");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	@FXML
	public void handleTranslate(ActionEvent event)
	{
		String input = Input.getText();
		PLLogic logic = new PLLogic(input);
		String output = logic.getOutput();
		Output.setText(output);

	}
	
}
