package keygen.main.application;
	


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import keygen.logic.KGLogic;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class KGDriver extends Application {
	
	@FXML Button generate;
	@FXML TextField username;
	@FXML TextField key;
	KGLogic logic = new KGLogic();;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			AnchorPane root = new AnchorPane();
			root = FXMLLoader.load(KGDriver.class.getResource("../resources/generate key.fxml"));
			Scene scene = new Scene(root,400,200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("KeyGen");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@FXML 
	public void generateKey(ActionEvent event){
		String keyString = logic.generateKey(" ");
		//System.out.println(keyString);
		key.setEditable(false);
		key.setText(keyString);
	}
}
