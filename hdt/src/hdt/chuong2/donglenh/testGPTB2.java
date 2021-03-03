/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt.chuong2.donglenh;

import hdt.chuong2.logiclayer.ptb2;

/**
 *
 * @author OS
 */
public class testGPTB2 {
   public static void main(String[] args){
       System.out.println("Giải phương trình bậc 2");
       ptb2 obj=new ptb2(-2, -4, 2);
       obj.giaiPT();
       System.out.println(obj.toString());
  }
}
