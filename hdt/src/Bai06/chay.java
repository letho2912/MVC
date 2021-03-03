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

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat ngay = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String day = "29-12-2001";
        Date ngaysinh = ngay.parse(day);
        Person per = new Person("Thơ", "Quảng Nam", ngaysinh);
        System.out.println("Họ tên:" + per.getHoten() + "\n" + "Ngày sinh: " + ngay.format(ngaysinh) + "\n" + "Địa chỉ: " + per.getDiachi());

        Studen st = new Studen();
        st.setHoten("Nguyễn Thị Lệ Thơ");
        st.setLop("CNTT");
        st.setDiachi("Quảng Nam");
        st.setTruong("Đại học Phú Xuân");
        st.setNgaysinh(ngay.parse("29-12-2001"));
        System.out.println("Thông tin sinh viên: " + "\n" + st.getHoten()
                + "\n" + st.getDiachi() + "\n" + st.getLop() + "\n" + st.getTruong());

        System.out.println(st.calcTax(1200));
        
        Worker wk = new Worker();
        wk.setHoten("Lê Anh Vũ");
        wk.setNgaysinh(ngay.parse("15-09-1994"));
        wk.setDiachi("Huế");
        wk.setEmtry("3S");

        System.out.println("Thông tin nhân viên: \n" + wk.getHoten() + "\n"
                + wk.getDiachi() + "\n" + wk.getNgaysinh()
                + "\n" + wk.getEmtry());
    
        System.out.println(wk.calcTax(2000));
    }
}
