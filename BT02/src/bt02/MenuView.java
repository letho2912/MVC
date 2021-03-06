/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt02;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class MenuView {
     public MenuView() {
    }
      //Hãy xây dựng view cho menu để người dùng lựa chọn các chức năng sau
    // 1. Nhập sinh viên
    // 2. Tìm kiếm sinh viên theo tên
    // 3. Bổ sung sinh vien vào danh sách
    // 4. Thoát

    public int menu() {
        System.out.println("\n =========MENU=========");
        System.out.println("1. Nhập sinh viên");
        System.out.println("2. Tìm kiếm sinh viên");
        System.out.println("3. Thêm sinh viên");
        System.out.println("4. Thoát");
        Scanner nhap = new Scanner(System.in);
       int kq = Integer.parseInt(nhap.nextLine());
        return kq;
    }
}
