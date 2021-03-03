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
public class Studen extends Person implements TaxInterface {

    private String truong, lop;
    private String hocluc;
    private double hocbong;

    public Studen() {
    }

    public Studen(String hoten, String diachi, Date ngaysinh) {
        super(hoten, diachi, ngaysinh);
    }

    public Studen(String truong, String lop, String hocluc, String hoten, String diachi, Date ngaysinh) {
        super(hoten, diachi, ngaysinh);
        this.truong = truong;
        this.lop = lop;
        this.hocluc = hocluc;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getHocluc() {
        return hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public double getHocbong() {
        return hocbong;
    }

    public void setHocbong(double hocbong) {
        this.hocbong = hocbong;
    }

    @Override
    public double calcTax(double incom) {
        double tax = 0.01 * incom;
        return tax;
    }

    @Override
    public String toString() {
        return "Studen{" + "truong=" + truong + ", lop=" + lop + ", hocluc=" + hocluc + ", hocbong=" + hocbong + '}';
    }

}
