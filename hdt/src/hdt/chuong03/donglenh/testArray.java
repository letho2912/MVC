/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt.chuong03.donglenh;

import java.util.Arrays;

/**
 *
 * @author OS
 */
public class testArray {

    public static void main(String[] args) {
        int[] a;
        a = new int[5];
        a[0] = 9;
        a[1] = 2;
        a[2] = 5;
        a[3] = 29;
        a[4] = 20;

        System.out.println(Arrays.toString(a));

        int[] b = new int[]{1, 3, -7, 8, 9, 20};
        System.out.println(Arrays.toString(b));
        System.out.println("So luong phan tu của mang: " + b.length);
    }
}
