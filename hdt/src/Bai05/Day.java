/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;


/**
 *
 * @author OS
 */
public class Day {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat date=new SimpleDateFormat("dd-MM-yyyy",Locale.ENGLISH);
        Date currDate=new Date();
        String kq=date.format(currDate);
        System.out.println("Ngày hiện tại là: " +kq);
   
        String ngay="29-12-2001";
        Date ngay1=date.parse(ngay);
        System.out.println(ngay1);
        System.out.println(date.format(ngay1));
    }
    
}
