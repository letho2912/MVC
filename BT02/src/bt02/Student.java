/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt02;

/**
 *
 * @author OS
 */
public class Student {
     private String fullname;
    private float age;
    private String phone;

     public Student() {
    }
    
    public Student(String fullname, float age, String phone) {
        this.fullname = fullname;
        this.age = age;
        this.phone = phone;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" + "fullname=" + fullname + ", age=" + age + ", phone=" + phone + '}';
    }

   

}
