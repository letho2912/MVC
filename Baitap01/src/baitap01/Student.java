/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap01;

/**
 *
 * @author OS
 */
public class Student {

    private String fullname;
    private String phone;
    private float age;

    public Student() {
    }

    public Student(String fullname, float age,String phone) {
        this.fullname = fullname;
        this.phone = phone;
        this.age = age;
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
        return "Danh sách sinh viên là:" + "\nHọ và tên:" + fullname + "\n Tuổi:" + age + "\n Số điện thoại: " + phone ;
    }

}
