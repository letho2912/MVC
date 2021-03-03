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
public class Worker extends Person implements TaxInterface {

    private String emtry;

    public Worker() {
    }

    public Worker(String hoten, String diachi, Date ngaysinh) {
        super(hoten, diachi, ngaysinh);
    }

    public String getEmtry() {
        return emtry;
    }

    public void setEmtry(String emtry) {
        this.emtry = emtry;
    }

    @Override
    public double calcTax(double incom) {
        return (0.04 * incom);
    }

}
