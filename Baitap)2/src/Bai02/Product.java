/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai02;

import java.util.Date;

/**
 *
 * @author OS
 */
public class Product {
    private String tensp;
    private String noinhap;
    private Date ngaynhap;
    private float gia;
    private int soluong;

    public Product() {
    }

    public Product(String tensp, String noinhap, Date ngaynhap, float gia, int soluong) {
        this.tensp = tensp;
        this.noinhap = noinhap;
        this.ngaynhap = ngaynhap;
        this.gia = gia;
        this.soluong = soluong;
    }

   

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getNoinhap() {
        return noinhap;
    }

    public void setNoinhap(String noinhap) {
        this.noinhap = noinhap;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    @Override
    public String toString() {
        return "Chi tiết sản phẩm:\n " + "\nTên sản phẩm: " + tensp + "\n Xuất xứ: " 
                + noinhap +"\n Ngày nhập: "+ngaynhap + "\n Giá cả: " + gia + "\n Số lượng: " + soluong +"\n";
    }
    

}
