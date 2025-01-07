/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package studentmanagement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;



public class StudentDashboardController implements Initializable {
    
    @FXML
    private TableView<Student> studentTable;
    @FXML
    private Button addButton;
    @FXML
    private Button editButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button calculateButton;
    @FXML
    private Button addCourseButton;
    @FXML
    private TextField idField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField scoreField;
    @FXML
    private TextField attendanceField;
    @FXML
    private TextField gradeField;
    @FXML
    private TableColumn<Student, String> id;
    @FXML
    private TableColumn<Student,String> name;
    @FXML
    private TableColumn<Student, String> email;
    @FXML
    private TableColumn<Student, String> grade;
    @FXML
    private TableColumn<Student, String> attendance;
    @FXML
    private TableColumn<Student, Double> score;
    private final ManagementSystem  managementSystem=new ManagementSystem();
    private final Student[]Student_Items={
    new Student("1","mariam","mariam@yahoo.com","verygood","absent",95),
    new Student("2","ahmed","ahmed@yahoo.com","good","present",85),
    new Student("3","joseph","joseph@yahoo.com","pass","absent",70)
    };
    private final  ObservableList<Student>studentList= FXCollections.observableArrayList(Student_Items);
    
    @Override
  public void initialize(URL url, ResourceBundle rb) {
  id.setCellValueFactory(new PropertyValueFactory<Student, String>("id"));
  name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
  email.setCellValueFactory(new PropertyValueFactory<Student, String>("email"));
  grade.setCellValueFactory(new PropertyValueFactory<Student, String>("grade"));
  attendance.setCellValueFactory(new PropertyValueFactory<Student, String>("attendance"));
  score.setCellValueFactory(new PropertyValueFactory<Student, Double>("score"));
  studentTable.setItems(studentList);
  studentList.add(new Student("4","sarah","sarah@yahoo.com","good","present",80));
  name.setCellFactory(TextFieldTableCell.forTableColumn());
  studentTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
  }    

    @FXML
    private void addStudent(ActionEvent actionEvent) {
        try{
    String id=idField.getText();
    String name=nameField.getText();
    String email=emailField.getText();
    String grade=gradeField.getText();
    String attendance=attendanceField.getText();
    String scoreText=scoreField.getText();
    double score=Double.parseDouble(scoreText);
    for(Student student:studentTable.getItems()){
    }
    Student student =new Student(id,name,email,grade,attendance,score);
    managementSystem.addStudent(student);
    studentList.add(new Student(id,name,email,grade,attendance,score) );
    studentTable.getItems().add(student);
    }catch(NumberFormatException e){
    }
    }
    @FXML
    private void editStudent() {
    Student selectedStudent= studentTable.getSelectionModel().getSelectedItem();
    if(selectedStudent !=null){
    selectedStudent.setId (idField.getText());
    selectedStudent.setName (nameField.getText());
    selectedStudent.setEmail (emailField.getText());
    selectedStudent.setGrade (gradeField.getText());
    selectedStudent.setAttendance(attendanceField.getText());
      try{
    selectedStudent.setScore(Double.parseDouble(scoreField.getText()));
    } catch(NumberFormatException e){
    }
    studentTable.refresh();
    }
    }

    @FXML
    private void deleteStudent( ActionEvent actionEvent){
    Student selectedStudent=studentTable.getSelectionModel().getSelectedItem();
    if( selectedStudent !=null){
    studentTable.getItems().remove(selectedStudent);
    managementSystem.deleteStudent(selectedStudent.getId());
    }

    }

    @FXML
    private void calculateGrades(ActionEvent actionEvent ) {
    for(Student student: studentTable.getItems()){
    double score=student.getScore();
    String grade = null;
    if(score>=90){
    grade="verygood";
    } else if(score>=80){
    grade="good" ;
    }else if(score>=70){
    grade="pass";
    }else if(score>=60){
    grade="fail";
    }
    student.setGrade(grade);
    }  
    studentTable.refresh();  
    }

    @FXML
    private void openCoursePage(ActionEvent event) throws IOException {
        try{
    FXMLLoader loader=new FXMLLoader(getClass().getResource("/studentmanagement/Course.fxml"));
    Parent root =loader.load();
    Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
    stage.setScene(new Scene(root,650,400));
    stage.show();
        }
        catch(IOException e){
        e.printStackTrace();
        }

    }

}

            
       

        

    

