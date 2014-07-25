package com.foomoo.spectrumlines;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class SpectrumLines extends Application {

	private static final int WIDTH = 512;
	private static final int HEIGHT = 352;

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Spectrum Lines");
		Group root = new Group();
		Scene scene = new Scene(root, WIDTH, HEIGHT);
		
		for(int x = 0; x < WIDTH; x += 10) {
			root.getChildren().add(new Line(0,0,x, HEIGHT - 1));
			root.getChildren().add(new Line(WIDTH - 1,0,WIDTH - 1 - x, HEIGHT - 1));
		}
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
