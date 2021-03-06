/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap01;

import static baitap01.StudentMVC.kich_ban_1;
import static baitap01.StudentMVC.kich_ban_2;

/**
 *
 * @author OS
 */
public class MenuController {

    private StudentController stcontroller;
    private MenuView mnView;

    public MenuController() {
    }

    public MenuController(StudentController stcontroller) {
        this.stcontroller = stcontroller;
    }

    public MenuController(MenuView mnView) {
        this.mnView = mnView;
    }

    public MenuController(StudentController stcontroller, MenuView mnView) {
        this.stcontroller = stcontroller;
        this.mnView = mnView;
    }

    public void lua_chon() {
        int kq = mnView.menu();

        switch (kq) {
            case 1:
                kich_ban_1();
                break;
            case 2:
                kich_ban_2();
                break;
            case 0:
                break;
            default:
                System.out.println("Mời bạn chọn lại!!!!");
        }
    }
}
