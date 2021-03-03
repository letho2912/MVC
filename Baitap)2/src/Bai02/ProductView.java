/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author OS
 */
public class ProductView {

    public ProductView() {
    }

    public Product nhapTTSP() throws ParseException {
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.print("Tên sản phẩm: ");
        Scanner sc = new Scanner(System.in);
        String tensp = sc.nextLine();
        System.out.print("Xuất sứ: ");
        String noinhap = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        System.out.print("Nhày nhập hàng: ");
        Date ngaynhap = df.parse(sc.nextLine());
        System.out.print("Giá cả: ");
        float gia = Float.parseFloat(sc.nextLine());
        System.out.print("Số lượng: ");
        int soluong = Integer.parseInt(sc.nextLine());
        Product pd = new Product(tensp, noinhap, ngaynhap, gia, soluong);
        System.out.println("Finished");
        System.out.println("============================");
        System.out.println("==============================");
        return pd;
    }

    public ArrayList<Product> nhapSP() throws ParseException {
        ArrayList<Product> result = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            System.out.println("Ban co muon nhap du lieu khong? (y/n)");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if ("n".equals(answer) || "N".equals(answer)) {
                flag = false;
            } else {
                Product pd = nhapTTSP();
                result.add(pd);
            }
        }
        return result;
    }

    public void hthi1SP(Product x) {
        System.out.println("---------Thông tin sản phẩm----------");
        System.out.println( x.toString());
    }

    public void hthiSP(ArrayList<Product> product) {

       System.out.println("---------Thông tin sản phẩm----------");
        for (Product pd : product) {
            System.out.println( pd.toString());
        }
        System.out.println("--------------------------");
    }

    public int tim_kiem(ArrayList<Product> product) {
        int result = -1;
        Scanner tam = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm cần tìm: ");
        String tensp = tam.nextLine();
        for (Product products : product) {
            
       if(products.getTensp().equals(tensp)){
           System.out.println("Có tồn tại");
       } else{
           System.out.println("Không tồn tại");
       }
               }
        return 0;
        
     
    }
}
