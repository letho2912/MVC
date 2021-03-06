/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt02;

import java.util.ArrayList;

/**
 *
 * @author OS
 */
public class StudentNewController {

    private StudentNewView view;
    private ArrayList<Student> students;
    private Student student;

    public StudentNewController() {
    }

//Hãy xác định các thuộc tính cần thiết
    //Hãy xác định các constructor cần thiết
    //Hãy xây dựng hàm nhập dữ liệu cho danh sách sinh viên
     public void nhap_du_lieu_sinh_vien() {
        this.student = this.view.nhap_du_lieu_mot_sinh_vien();
    }
    public void nhap_danh_sach_sinh_vien() {
        this.students = this.view.nhap_du_lieu_nhieu_sinh_vien();
    }
    //Hãy xây dựng hàm hiển thị danh sách sinh viên
     public void hien_thi_sinh_vien() {
        this.view.hien_thi_sv(student);
    }

    public void hien_thi_danh_sach_sinh_vien() {
        this.view.hien_thi_danh_sach_sinh_vien(this.students);
    }

    //Hãy xây dựng hàm bổ sung sinh viên vào 1 danh sách có sẵn
//    public void them_sv(){
//        this.view.them_sv_vao_danh_sach(this.students);
//    }
//    public void hienthisaukhithem(){
//        this.view.hien_thi_danh_sach_khi_da_them(students);
//    }
    //Hãy xây dựng hàm tìm kiếm sinh viên theo tên
    private ArrayList<Student> tim_sv_theo_ten(ArrayList<Student> students, String ten) {
        ArrayList<Student> result = new ArrayList<>();

        for (Student student : students) {
            if (student.getPhone().contains(ten)) {
                result.add(student);
            }

        }
        return result;
    }

    public void tim_kiem_sv_theo_ten() {
        String ten=this.view.nhap_ten_sv_can_tim_kiem();
        ArrayList<Student> kq=tim_sv_theo_ten(students, ten);
        this.view.kq_timkiem(kq);
    }

    public StudentNewController(StudentNewView view) {
        this.view = view;
    }
}
