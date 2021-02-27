/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donglenh;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class pheptoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        float c,d,e;
        Scanner tam=new Scanner(System.in);
        System.out.print("Nhập số a: ");
        a=tam.nextInt();
        System.out.print("Nhập số b: ");
        b=tam.nextInt();
        c=a+b;
        d=a+b;
        e=a*b;
        System.out.println("Tổng 2 số a và b là: "+c);
        System.out.println("Hiệu 2 số a và b là: "+d);
        System.out.println("Tích 2 số a và b là: "+e);
        
    }
    
}
