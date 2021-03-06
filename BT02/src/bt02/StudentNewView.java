/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author OS
 */
public class StudentNewView {

    public StudentNewView() {
    }

    //Hãy xây dựng view nhập dữ liệu cho 1 sinh viên
    //Kết quả trả về là 1 đối tượng kiểu Student
    public Student nhap_du_lieu_mot_sinh_vien() {
        //code của bạn ở đây
        System.out.println("Mời nhập dữ liệu cho sinh viên: ");
        System.out.println("Fullname: ");
        Scanner sc = new Scanner(System.in);
        String fullname = sc.nextLine();
        System.out.println("Age: ");
        float age = Float.parseFloat(sc.nextLine());
        System.out.println("Phone: ");
        String phone = sc.nextLine();
        Student sv = new Student(fullname, age, phone);
        System.out.println("Hoàn thành");
        return sv;
    }

    public void hien_thi_sv(Student sv) {
        System.out.println("------" + sv.toString() + "--------");
    }

    public ArrayList<Student> nhap_du_lieu_nhieu_sinh_vien() {
        ArrayList<Student> result = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            System.out.println("Ban có muốn nhập dữ liệu không?");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if ("Khong".equals(answer) || "khong".equals(answer)) {
                flag = false;
                MenuView mn=new MenuView();
                mn.menu();
            } else {
                Student sv = nhap_du_lieu_mot_sinh_vien();
                result.add(sv);
            }
        }
        return result;
    }

    //Hãy xây dựng view hiển thị danh sách các sinh viên
    public void hien_thi_danh_sach_sinh_vien(ArrayList<Student> students) {
        //code của bạn ở đây
        System.out.println("Danh sách sinh viên");
        for (Student sv : students) {
            System.out.println("----" + sv.toString() + "----");
        }
    }

    //Hãy xây dựng view nhập thông tin cần tìm kiếm là tên của sinh viên
    public String nhap_ten_sv_can_tim_kiem() {
        //code của bạn ở đây
        System.out.println("=======================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm kiếm: ");
        String ten = sc.nextLine();
        return ten;
    }

    public void kq_timkiem(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("Không tìm thấy");
        } else {
            for (Student sv : students) {
                System.out.println("-------" + sv.toString() + "-------");
            }
            // System.out.println(students.get(kq+1).getFullname(),students.get(kq+1).getAge(),students.get(kq+1).getPhone());

        }
        System.out.println("=======================");
    }

    //Hãy xây dựng view bổ sung thêm một sinh viên vào mot danh sach đã có
//    public void them_sv_vao_danh_sach(ArrayList<Student> students) {
//        System.out.println("Mời nhập dữ liệu cho sinh viên: ");
//         Student sv = nhap_du_lieu_mot_sinh_vien();
//                students.add(sv);
//    }
//    public void hien_thi_danh_sach_khi_da_them(ArrayList<Student> students){
//         System.out.println("Danh sách sinh viên");
//        for (Student sv : students) {
//            System.out.println("----" + sv.toString() + "----");
//        }
//    }
    //Theo bạn có nên viết view này hay không? Nếu không thì giải pháp thay thế ntn?
}
