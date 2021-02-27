/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xuatnhap;

/**
 *
 * @author OS
 */
public class Profile {

    private String hoten, sdt, quequan, nganh, khoa;
    private int tuoi;

    public Profile() {
    }

    public Profile(String hoten, String sdt, String quequan, String nganh, String khoa, int tuoi) {
        this.hoten = hoten;
        this.sdt = sdt;
        this.quequan = quequan;
        this.nganh = nganh;
        this.khoa = khoa;
        this.tuoi = tuoi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

}
