/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai06;

import java.util.Date;

/**
 *
 * @author OS
 */
public class Studen extends Person implements TaxInterface {

    private String truong, lop;

    public Studen() {
    }

    public Studen(String hoten, String diachi, Date ngaysinh) {
        super(hoten, diachi, ngaysinh);
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

    @Override
    public double calcTax(double incom) {
        double tax = 0.01 * incom;
        return tax;
    }

}
