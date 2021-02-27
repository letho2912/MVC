/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xuatnhap;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class xuatnhapProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhập thông tin sinh viên");
        Scanner tam = new Scanner(System.in);
        System.out.print("Mời nhập họ và tên: ");
        String hoten = tam.nextLine();
        System.out.print("Mời nhập địa chỉ: ");
        String quequan = tam.nextLine();
        System.out.print("Mời nhập tên ngành học: ");
        String nganh = tam.nextLine();
        System.out.print("Mời nhập khóa: ");
        String khoa = tam.nextLine();
        System.out.print("Mời nhập số điện thoại: ");
        String sdt = tam.nextLine();
        System.out.print("Mời nhập tuổi: ");
        String tuoi = tam.nextLine();
        int age = Integer.parseInt(tuoi);
        
        //Profile pf=new Profile(hoten, sdt, quequan, nganh, khoa, age);
        System.out.println("-------Thông tin sinh viên--------");
        System.out.println("Họ tên sinh viên:" +hoten);
        System.out.println("Địa chỉ:" +quequan);
        System.out.println("Ngành học :" +nganh);
        System.out.println("Khóa học:" +khoa);
        System.out.println("Số điện thoại:" +sdt);
        System.out.println("Tuổi:" +tuoi);
    }

}
