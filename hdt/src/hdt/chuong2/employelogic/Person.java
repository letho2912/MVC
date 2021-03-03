/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt.chuong2.employelogic;

import java.util.Date;

/**
 *
 * @author OS
 */
public class Person {
    private String hoten,diachi;
    private Date ngaysinh;

    public Person() {
    }

    public Person(String hoten, String diachi, Date ngaysinh) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    @Override
    public String toString() {
        return "Person{" + "hoten=" + hoten + ", diachi=" + diachi + ", ngaysinh=" + ngaysinh + '}';
    }

   
    
    
    
}
