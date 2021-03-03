/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt.chuong2.donglenh;

import hdt.chuong2.employelogic.Studen;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author OS
 */
public class testStudent {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat ngay = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String sinhnhat = "29-12-2001";
        Date ngaysinh = ngay.parse(sinhnhat);
        Studen st = new Studen("Đại học Phú Xuân", "CNTT", "Xuất sắc", "Nguyễn Thị Lệ Thơ", "Quảng Nam", ngaysinh);

        switch (st.getHocluc()) {
            case "Xuất sắc":
                st.setHocbong(1000000);
                break;
            case "Giỏi":
                st.setHocbong(500000);
                break;
            default:
                st.setHocbong(0);
                break;
        }
        System.out.println(st);
    }
}
