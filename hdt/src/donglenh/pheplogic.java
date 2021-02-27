/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donglenh;

/**
 *
 * @author OS
 */
public class pheplogic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean a = true, b = false;
        String hoten = "nguyễn thị lệ thơ";
        String khac = "Tôi là nguyễn thị lệ thơ";
        //1 trong 2 cái true là đúng và ngược lại
        if (a == true && b == true) {
            System.out.println("Đúng");
        } else if (a == false && b == false) {
            System.out.println("Sai");
        } else if (a == true || b == true) {
            System.out.println("Đúng");
        }
        //toLowerCase() viết thường, toUpperCase() viết hoa, contains() kiểm tra bao chứa
        System.out.println(khac.toLowerCase());
        System.out.println(hoten.toUpperCase());
        System.out.println(khac.contains(hoten));
        
    }

}
