/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai02;

import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author OS
 */
public class ProductController {

    private Product product;
    private ProductView view;
    private ArrayList<Product> products;
    
    public ProductController() {
    }
    
    public ProductController(Product product) {
        this.product = product;
    }
    
    public ProductController(ProductView view) {
        this.view = view;
    }
    
    public ProductController(ArrayList<Product> products) {
        this.products = products;
    }

    public void nhap1SP() throws ParseException {
        this.product = this.view.nhapTTSP();
    }
    
    public void nhapNSP() throws ParseException {
        this.products = this.view.nhapSP();
    }
    
    public void hthMSP() {
        this.view.hthi1SP(this.product);
    }
    
    public void hthNSP() {
        this.view.hthiSP(this.products);
    }
    
    public void timkiemTen() {
        this.view.tim_kiem(this.products);
    }
}
