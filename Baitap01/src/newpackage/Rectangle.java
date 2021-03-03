/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Rectangle {
    private double x,y,width,height;
    private String color;

    public Rectangle() {
    }

    public Rectangle(double x, double y, double width, double height, String color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void input(){
        Scanner tam=new Scanner(System.in);
        System.out.println("Nhâp x: ");
        x=tam.nextDouble();
        System.out.println("Nhâp y: ");
        y=tam.nextDouble();
        System.out.println("Nhâp width: ");
        width=tam.nextDouble();
        System.out.println("Nhâp height: ");
        height=tam.nextDouble();
        tam.nextLine();
        System.out.println("Nhâp color: ");
        color=tam.nextLine();
    }
    public void hth(){
        System.out.println(x); 
        System.out.println(y); 
        System.out.println(width); 
        System.out.println(height); 
        System.out.println(color); 
        
    }
}
