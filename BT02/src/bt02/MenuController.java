/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt02;

/**
 *
 * @author OS
 */
public class MenuController {

    private StudentNewController stcontroller;
    private MenuView mnView;

    public MenuController() {
    }

    public MenuController(StudentNewController stcontroller, MenuView mnView) {
        this.stcontroller = stcontroller;
        this.mnView = mnView;
    }

    public void lua_chon() {
        int kq;
        StudentNewController sc = new StudentNewController(new StudentNewView());
        do{
            kq= mnView.menu();
        switch (kq) {
            case 1:
                sc.nhap_danh_sach_sinh_vien();
                sc.hien_thi_danh_sach_sinh_vien();
                break;
            case 2:
                sc.nhap_danh_sach_sinh_vien();
                sc.hien_thi_danh_sach_sinh_vien();
                sc.tim_kiem_sv_theo_ten();
                break;
            case 3:
//                sc.them_sv();
//                sc.hienthisaukhithem();
                break;
            case 4:
                break;
            default:
                System.out.println("Mời bạn chọn lại!!!!");
        }}
        while(kq!=0);
        System.out.println("Bạn đã thoát thành công");
        
    }

}
