/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package studentmanagement;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;


public class DashboardInstructorController implements Initializable {

    @FXML
    private TableView<Course> CourseTable;
    @FXML
    private TextField courseDetailsField;
    @FXML
    private TextField courseNameField;
    @FXML
    private Button addCourseButton;
    @FXML
    private Button deleteCourseButton;
    @FXML
    private TextField courseIdField;
    @FXML
    private TableColumn<Course, String> courseid;
    @FXML
    private TableColumn<Course, String> coursename;
    @FXML
    private TableColumn<Course, String> coursedetails;
    private final ManagementSystem  managementSystem=new ManagementSystem();
    private final Course[]Course_Items={
    new Course("001","Biology","one session"),
    new Course("002","chemistry","two sessions"),
    new Course("003","Physics","three sessions")
    };
    
  private final  ObservableList<Course>courseList= FXCollections.observableArrayList(Course_Items);
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    courseid.setCellValueFactory(new PropertyValueFactory<Course, String>("courseid")); 
    coursename.setCellValueFactory(new PropertyValueFactory<Course, String>("coursename"));  
    coursedetails.setCellValueFactory(new PropertyValueFactory<Course, String>("coursedetails"));
    CourseTable.setItems(courseList);
    courseList.add(new Course("004","programming","five sessions"));
    coursename .setCellFactory(TextFieldTableCell.forTableColumn());
    CourseTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }    
      

    @FXML
    private void addCourse(ActionEvent event) {
         try{
    String id=courseIdField.getText();
    String details=courseDetailsField.getText();
    String name=courseNameField.getText();
    Course course =new Course(id,name,details);
    managementSystem.addCourse(course);
    courseList.add(course );
    CourseTable.setItems(courseList);
    courseIdField.clear();
    courseDetailsField.clear();
    courseNameField.clear();
    }catch(NumberFormatException e){
    }
    }
    @FXML
    private void deleteCourse(ActionEvent event) {
    Course selectedCourse=CourseTable.getSelectionModel().getSelectedItem();
    if( selectedCourse !=null){
    CourseTable.getItems().remove(selectedCourse);
    managementSystem.deleteCourse(selectedCourse.getId());
    }
    }
    }



