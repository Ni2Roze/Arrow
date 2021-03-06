package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter arrow tail (1 or 2): ");

            int arrowTailPicker = myObj.nextInt();  // Read user input
            System.out.println("Arrow tail picked: " + arrowTailPicker);  // Output user input

            Group mainStage = new Group();
            CompleteArrow completeArrow = new CompleteArrow(arrowTailPicker);
            mainStage.getChildren().add(completeArrow.getGroup());

            Scene scene = new Scene(mainStage,800,500);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
