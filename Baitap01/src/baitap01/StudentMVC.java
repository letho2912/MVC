/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap01;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class StudentMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int luachon;
do {
	            luachon = menu();
	        	switch (luachon) {
	        	case 1: 
	        		kich_ban_1();
	        		break;
	            case 2: 
	            	kich_ban_2();
	               break;
	            case 0:
	               break;
	            default:
	            	System.out.println("Mời bạn chọn lại!!!!");
	        	}  
	        }while (luachon!=0);
	        System.out.println("Bạn đã thoát thành công");

    }

    public static int menu() {
        System.out.println("\n =========MENU=========");
        System.out.println("1. Kịch bản 1");
        System.out.println("2. Kịch bản 2 ");
       System.out.println("0. Thoát");
        Scanner nhap = new Scanner(System.in);
        int Chon = nhap.nextInt();
        return Chon;
    }

    public static void kich_ban_1() {
        StudentController sc = new StudentController(new StudentView());
        sc.nhap_du_lieu_sinh_vien();
        sc.hien_thi_sinh_vien();
    }

    public static void kich_ban_2() {
        StudentController sc = new StudentController(new StudentView());
        sc.nhap_danh_sach_sinh_vien();
        sc.hien_thi_danh_sach_sinh_vien();
        sc.tim_kiem_sv_theo_sdt();
    }
}
