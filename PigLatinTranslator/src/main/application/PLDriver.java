package main.application;
	

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;


public class PLDriver extends Application {
	@FXML TextArea input;
	@FXML TextArea output;
	@FXML Button translate;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = new AnchorPane();
			root = FXMLLoader.load(getClass().getResource("../resources/PL.fxml"));
			Scene scene = new Scene(root,400,300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void handleTranslate(ActionEvent event){
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
