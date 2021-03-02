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
public class Rectangle {

    private int upper_x, upper_y, lover_x, lover_y;

    public Rectangle() {
    }

    public Rectangle(int upper_x, int upper_y, int lover_x, int lover_y) {
        this.upper_x = upper_x;
        this.upper_y = upper_y;
        this.lover_x = lover_x;
        this.lover_y = lover_y;
    }

    public double cv() {
        return (2 * Math.abs(upper_x - lover_x) + (2 * Math.abs(upper_y - lover_y)));
    }

    public double dt() {
        return Math.abs(upper_x - lover_x) * (upper_y - lover_y);
    }

    public int getUpper_x() {
        return upper_x;
    }

    public void setUpper_x(int upper_x) {
        this.upper_x = upper_x;
    }

    public int getUpper_y() {
        return upper_y;
    }

    public void setUpper_y(int upper_y) {
        this.upper_y = upper_y;
    }

    public int getLover_x() {
        return lover_x;
    }

    public void setLover_x(int lover_x) {
        this.lover_x = lover_x;
    }

    public int getLover_y() {
        return lover_y;
    }

    public void setLover_y(int lover_y) {
        this.lover_y = lover_y;
    }
    
}
