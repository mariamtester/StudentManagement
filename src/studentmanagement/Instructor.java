/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;


    public class Instructor extends Person {
    private String department;
    public Instructor(String id, String name, String email,String department){
    super(id,name,email);
        this.department=department;
    }

    
    public String getDepartment() {
        return department;
    }

    
    public void setDepartment(String department) {
        this.department = department;
    }
    
}
