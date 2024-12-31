/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package studentmanagement;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXMain extends Application {
    
    @Override
public void start(Stage primaryStage) throws IOException  {
    
Parent root = FXMLLoader.load(getClass().getResource("/studentmanagement/Login.fxml"));
primaryStage.setTitle("Student Management System");
primaryStage.setScene(new Scene(root,550,400));
primaryStage.show();
}

     
    
public static void main(String[] args) {
    launch(args);
    }
    
}

