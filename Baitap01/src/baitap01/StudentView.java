/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author OS
 */
public class StudentView {

    public StudentView() {
    }

    public void hien_thi_mot_sinh_vien(Student x) {
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("++++ " + x.toString() + " ++++");
        System.out.println("++++++++++++++++++++++++++++++++++");
    }

    public Student them_du_lieu_sinh_vien() {
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("Fullname: ");
        Scanner sc = new Scanner(System.in);
        String fullname = sc.nextLine();
        System.out.println("Age: ");
        float age = Float.parseFloat(sc.nextLine());
        System.out.println("Phone: ");
        String phone = sc.nextLine();
        Student sv = new Student(fullname, age, phone);
        System.out.println("Finished");
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++");
        return sv;
    }

    public ArrayList<Student> nhap_du_lieu_nhieu_sinh_vien() {
        ArrayList<Student> result = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            System.out.println("Ban co muon nhap du lieu khong? (y/n)");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if ("n".equals(answer) || "N".equals(answer)) {
                flag = false;
            } else {
                Student sv = them_du_lieu_sinh_vien();
                result.add(sv);
            }
        }
        return result;
    }

    public void hien_thi_danh_sach_sinh_vien(ArrayList<Student> students) {

        System.out.println("++++++++++++++++++++++++++++++++++");
        for (Student sv : students) {
            System.out.println("++++ " + sv.toString() + " ++++");
        }
        System.out.println("++++++++++++++++++++++++++++++++++");
    }

   
    public String nhapSDT(){
         System.out.println("=======================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại cần tìm kiếm: ");
        String sdt = sc.nextLine();
        return sdt;
    }
    public void kq_timkiem(ArrayList<Student> students) {
       if (students.isEmpty()) {
            System.out.println("Không tìm thấy");
        } else {
            for (Student sv : students) {
                System.out.println("++++ " + sv.toString() + " ++++");
            }
            // System.out.println(students.get(kq+1).getFullname(),students.get(kq+1).getAge(),students.get(kq+1).getPhone());

        }
        System.out.println("=======================");
    }
}
