/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author josrom
 */
public class Cronometer extends Application {
    private void createMenu(Stage primaryStage) {
        /**
         * Time
         */
        Text time = new Text();
        time.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        
        /**
         * Buttons
         */
        Button startCronometerBtn = new Button();
        startCronometerBtn.setText("Start cronometer");
        startCronometerBtn.setOnAction((ActionEvent event) -> {
            time.setText("Start");
        });
        
        Button stopCronometerBtn = new Button();
        stopCronometerBtn.setText("Stop cronometer");
        stopCronometerBtn.setOnAction((ActionEvent event) -> {
            time.setText("Stop");
        });
        
        Button resetCronometerBtn = new Button();
        resetCronometerBtn.setText("Reset cronometer");
        resetCronometerBtn.setOnAction((ActionEvent event) -> {
            time.setText("Reset");
        });
        
        /**
         * Grid panel
         */
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        
        /**
         * Add to grid
         */
        Scene scene = new Scene(grid, 400, 275);
        
        grid.add(time, 1, 1);
        grid.add(startCronometerBtn, 0, 0);
        grid.add(stopCronometerBtn, 0, 1);
        grid.add(resetCronometerBtn, 0, 2);
        
        primaryStage.setScene(scene);
    }
    
    @Override
    public void start(Stage primaryStage) {
        createMenu(primaryStage);
        primaryStage.setTitle("Cronometer");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
