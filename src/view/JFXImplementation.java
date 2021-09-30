/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import javafx.stage.Stage;

/**
 * Class that implements the view interface
 *
 * @author Yeray Sampedro, Ander Arruza
 */
public class JFXImplementation extends Application implements View {

    private Label label;

    @Override
    public void start(Stage primaryStage) {
        label = new Label(getParameters().getUnnamed().get(0));
        Pane root = new Pane();
        root.getChildren().add(label);
        root.setPrefSize(200, 200);
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void showGreeting(String text) {
        String[] parameters = new String[1];
        parameters[0] = text;
        launch(parameters);
    }

}
