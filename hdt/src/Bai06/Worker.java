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
public class Worker extends Person{
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
    
    
}
