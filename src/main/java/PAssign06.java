import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

/**
 * File: PAssign06.java
 * Class: CSCI 1302
 * Author: Brian Abbott
 * Created on: 3/27/26
 * Last modified: 3/27/26
 * Description: A JavaFX GUI Application that creates teh layout of a phone keypad using GridPane and CSS.
 */

public class PAssign06 extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane keypadGridPane = new GridPane();
        keypadGridPane.setAlignment(Pos.CENTER);

        keypadGridPane.add(new Button("1"), 0, 0);
        keypadGridPane.add(new Button("2"), 1, 0);
        keypadGridPane.add(new Button("3"), 2, 0);
        keypadGridPane.add(new Button("4"), 0, 1);
        keypadGridPane.add(new Button("5"), 1, 1);
        keypadGridPane.add(new Button("6"), 2, 1);
        keypadGridPane.add(new Button("7"), 0, 2);
        keypadGridPane.add(new Button("8"), 1, 2);
        keypadGridPane.add(new Button("9"), 2, 2);
        keypadGridPane.add(new Button("*"), 0, 3);
        keypadGridPane.add(new Button("0"), 1, 3);
        keypadGridPane.add(new Button("#"), 2, 3);

        Scene scene = new Scene(keypadGridPane, 250, 350);
        scene.getStylesheets().add(getClass().getResource("/keypad.css").toExternalForm());
        primaryStage.setScene(scene);
        // render title
        primaryStage.setTitle("Phone Keypad");
        // show stage
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}