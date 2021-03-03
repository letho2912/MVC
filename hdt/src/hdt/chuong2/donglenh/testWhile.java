/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt.chuong2.donglenh;

/**
 *
 * @author OS
 */
public class testWhile {
    public static void main(String []args){
        int n;
        int i;
        double s1=0;
        n=100;
        i=1;
        while(i<n){
            s1=s1+(double)1/i;
            i++;
        }
        System.out.println("Tổng thứ nhất là: " +s1);
    }
}
