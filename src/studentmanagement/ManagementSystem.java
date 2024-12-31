/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;

import java.util.ArrayList;
import java.util.List;

    public class ManagementSystem {
    private  List<Student> students= new ArrayList<>();
    private  List<Course> courses= new ArrayList<>();
  
    public void addStudent(Student student ){
    students.add(student);
     }
    public void editStudent(String id,Student updatedStudent){
    for(Student student : students){
    if(student.getId().equals(id)){
    student.setName(updatedStudent.getName());
    student.setEmail(updatedStudent.getEmail());
    student.setGrade(updatedStudent.getGrade());
    student.setAttendance(updatedStudent.getAttendance());
    student.setScore(updatedStudent.getScore());
             }
         }
     }
    public void  deleteStudent(String id){
    students.removeIf(student->student.getId().equals(id));
    }
    public void addCourse(Course course){
    courses.add(course);
    }
    public void deleteCourse(String course){
    courses.remove(course);
    }
    public Double calculateGrades(){
    for(Student student: students){
    double score=student.getScore();
    String grade;
    if(score>=90){
    grade="vergood";
    } else if(score>=80){
    grade="good" ;
    }else if(score>=70){
    grade="pass";
    }else if(score>=60){
    grade="fail";
            }
      
       }
    return null;
    }
}



    



