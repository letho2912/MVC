/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author OS
 */
public class chay {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat ngay=new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String day="29-12-2001";
        Date ngaysinh=ngay.parse(day);
        Person per=new Person("Thơ", "Quảng Nam", ngaysinh);
        System.out.println("Họ tên:" +per.getHoten()+"\n"+"Ngày sinh: " +ngay.format(ngaysinh)+"\n"+"Địa chỉ: "+per.getDiachi());
    }
}
