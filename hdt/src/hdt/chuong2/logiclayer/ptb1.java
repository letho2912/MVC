/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt.chuong2.logiclayer;

/**
 *
 * @author OS
 */
public class ptb1 implements Phuongtrinh {

    //y=ax+b
    private double a;
    private double b;
    private double nghiem;
    private String kq;

    public ptb1() {
    }

    public ptb1(double a, double b) {
        this.a = a;
        this.b = b;
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

    public double getNghiem() {
        return nghiem;
    }

    public void setNghiem(double nghiem) {
        this.nghiem = nghiem;
    }

    public String getKq() {
        return kq;
    }

    public void setKq(String kq) {
        this.kq = kq;
    }

    @Override
    public void giaiPT() {
        if (a != 0) {
            nghiem = -b / a;
            kq = "Nghiệm của phương trình bậc 1 là: " + nghiem +"\n";
        } else {
            if (b == 0) {
                kq = "Phương trình vô số nghiệm";
            } else {
                kq = "Phương trình vô nghiệm";
            }
        }
    }

    @Override
    public String toString() {
    if(kq==null || kq.isEmpty()){
        giaiPT();
    }
        return kq;
    }
    
    
}
