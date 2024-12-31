/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package studentmanagement;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLController implements Initializable {

    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private Button Login;
    @FXML
    private Label errorLabel;
    private final String studentUsername="student";
    private final String studentPassword="1234";
    private final String instructorUsername="instructor";
    private final String instructorPassword="abcd";
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
   
    @FXML
    private void GoToStudentDashboard(ActionEvent event) throws IOException  {
    
    String username= usernameField.getText();
    String password =passwordField.getText();
    if((username.equals(studentUsername)&&password.equals(studentPassword))||
    username.equals(instructorUsername)&&password.equals(instructorPassword)){
        try{
    FXMLLoader loader= new FXMLLoader(getClass().getResource("/studentmanagement/StudentDashboard.fxml"));
    Parent root =loader.load();
    Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(new Scene(root,670,400));
    stage.show();
        }catch(IOException e){
        e.printStackTrace();
        }
    }else{ 
    errorLabel.setText("Invalid username or password.");
       }
    }
}



       
        

    

  
    
    
    

  
    
    

