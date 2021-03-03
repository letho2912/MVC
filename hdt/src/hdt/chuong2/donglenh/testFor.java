/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt.chuong2.donglenh;

import java.util.Random;

/**
 *
 * @author OS
 */
public class testFor {
    public static void main(String [] args){
        int n=100;
        double s=0;
        for(int i=1;i<=n;i++){
            s=s+(double )1/i;
        }
        System.out.println("Tổng là:" +s);
        
        n=99;int s2=0;
        for(int i=1;i<=n;i++){
            s2=s2+i;
        }
        System.out.println("Tổng thứ 2 là: "+s2);
        
        Random rd=new Random();
    }
}
