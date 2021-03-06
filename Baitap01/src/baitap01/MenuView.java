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
public class MenuView {

    public MenuView() {
    }
    public int menu() {
        System.out.println("\n =========MENU=========");
        System.out.println("1. Kịch bản 1");
        System.out.println("2. Kịch bản 2 ");
        System.out.println("0. Thoát");
        Scanner nhap = new Scanner(System.in);
       int kq = Integer.parseInt(nhap.nextLine());
        return kq;
    }
}
