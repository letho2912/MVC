/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai04;

/**
 *
 * @author OS
 */
public class Circle extends Shape{

    private int radius, x, y;

    public Circle() {
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public double cv(){
        double kq = 2 * Math.PI * this.radius;
        return kq;
    }

    @Override
    public double dt() {
        double kq = (Math.PI) * this.radius * this.radius;
        return kq;
    }

    @Override
    public String toString() {
       String output="\n Diện tích hình tròn là: "+cv()+"\nChu vi hình tròn là: "+dt();
        return output;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
