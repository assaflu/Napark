package app;

import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainComputer extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox v = new VBox();
		SimpleIntegerProperty i = new SimpleIntegerProperty(0);
		v.getChildren().addAll(new Button("a"),new Label("b"));
		Scene scene = new Scene(v);
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	public static void main(String[] args) {
		 Application.launch(MainComputer.class, args);
	}

}
