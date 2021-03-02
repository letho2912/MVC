/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai04;

/**
 *
 * @author OS
 */
public class MainCirle {

    public static void main(String[] args) {
        Circle ht = new Circle(5, 1, 2);
        System.out.println("Chu vi hinh tron la: " + ht.cv());
        System.out.println("Dien tich hinh tron la: " + ht.dt());

        Rectangle hcn = new Rectangle(3, 15, 8, 5);
        System.out.println("Chu vi hinh chu nhat la: " + hcn.cv());
        System.out.println("Dien tich hinh chu nhat la: " + hcn.dt());
    }
}
