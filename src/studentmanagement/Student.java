/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;


    public class Student extends Person {
    private double score;
    private String grade;
    private String attendance;
    public Student (String id,String name, String email,String grade,String attendance,double score) {
    super(id,name,email);
    this.grade=  grade;
    this.attendance=attendance;
    this.score=score;
    }

   
    public String getGrade() {
        return grade;
    }

    
    public void setGrade(String grade) {
        this.grade = grade;
    }

   
    public String getAttendance() {
        return attendance;
    }

    
    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    
    public double getScore() {
        return score;
    }

    
    public void setScore(double score) {
        this.score = score;
    }
    
   
} 



