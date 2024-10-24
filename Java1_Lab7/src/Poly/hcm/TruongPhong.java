package Poly.hcm;

import Poly.ho.NhanVien;

public class TruongPhong extends NhanVien {

    // Biến thành viên cho lương trách nhiệm
    private double luongTN;

    // Constructor có tham số cho cả lương trách nhiệm và thông tin nhân viên
    public TruongPhong(double luongTN, String hoTen, double luong) {
        super(hoTen, luong); // Gọi constructor của lớp cha NhanVien
        this.luongTN = luongTN;
    }

    // Constructor chỉ có tham số lương trách nhiệm
    public TruongPhong(double luongTN) {
        this.luongTN = luongTN;
    }

    // Getter và Setter cho luongTN
    public double getLuongTN() {
        return luongTN;
    }

    public void setLuongTN(double luongTN) {
        this.luongTN = luongTN;
    }

    // Phương thức xuất thông tin
    public void xuat() {
        System.out.println("Thong tin truong phong:");
        super.xuat(); // Gọi phương thức xuat() của lớp cha (NhanVien)
        System.out.println("Luong trach nhiem: " + this.luongTN);
    }

}
