/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai02;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author OS
 */
public class ProductMVC {
    public static void main(String[] args) throws ParseException{
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

    public static void kich_ban_1() throws ParseException {
        ProductController sc = new ProductController(new ProductView());
       sc.nhap1SP();
       sc.hthMSP();
    }

    public static void kich_ban_2() throws ParseException {
        ProductController sc = new ProductController(new ProductView());
       sc.nhapNSP();
       sc.hthNSP();
        sc.timkiemTen();
    }
}
