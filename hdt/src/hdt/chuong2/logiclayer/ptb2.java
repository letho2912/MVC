/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt.chuong2.logiclayer;

import com.sun.org.apache.xerces.internal.util.FeatureState;

/**
 *
 * @author OS
 */
public class ptb2 implements Phuongtrinh {

    private double a;
    private double b;
    private double c;
    private double nghiem1;
    private double nghiem2;
    private String kq;

    public ptb2() {
    }

    public ptb2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void giaiPT() {
        if (a == 0) {
            ptb1 pt1 = new ptb1(b, c);
            pt1.giaiPT();
            kq = pt1.getKq();
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                kq = "Phương trình bậc 2 vo nghiệm \n";
            } else {
                if (delta == 0) {
                    nghiem1 = nghiem2 = -b / (2 * a);
                    kq = "Phương trình bậc 2 có nghiệm kép là: " + nghiem1 +"\n";
                } else {
                    nghiem1 = (-b + Math.sqrt(delta)) / (2 * a);
                    nghiem2 = (-b - Math.sqrt(delta)) / (2 * a);
                    kq = "Phương trình có 2 nghiệm phân biết là: \nx1=" + nghiem1 + "\n x2=" + nghiem2 +"\n";

                }
            }
        }

    }

    @Override
    public String toString() {
    if(kq==null||kq.isEmpty()){
        giaiPT();
    }
        return kq;
        
        }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getNghiem1() {
        return nghiem1;
    }

    public void setNghiem1(double nghiem1) {
        this.nghiem1 = nghiem1;
    }

    public double getNghiem2() {
        return nghiem2;
    }

    public void setNghiem2(double nghiem2) {
        this.nghiem2 = nghiem2;
    }

    public String getKq() {
        return kq;
    }

    public void setKq(String kq) {
        this.kq = kq;
    }

}
