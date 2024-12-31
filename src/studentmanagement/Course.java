/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;


    class Course {
    private String name;
    private String details;
    private String id;

    public Course(String id,String name, String details){
        this.id=id;
        this.name=name;
        this.details=details;
    }
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    
    public String getDetails() {
        return details;
    }

    
    public void setDetails(String details) {
        this.details = details;
    }

    
    public String getId() {
        return id;
    }

    
    public void setId(String id) {
        this.id = id;
    }
}
