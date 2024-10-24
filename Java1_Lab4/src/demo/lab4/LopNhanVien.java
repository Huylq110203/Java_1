package demo.lab4;

import java.util.Scanner;

public class LopNhanVien {
    // 1 - Thuoc tinh: maNV, tenNV, tuoi, luong, phongBan, chucVu
    private String maNV;
    private String tenNV;
    private int tuoi;
    private double luong;
    private String phongBan;
    private String chucVu;

    // 2 - Phuong thuc: nhap 1 nhan vien, xuat 1 nhan vien, thue thu nhap
    public void nhap1NV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma NV: ");
        this.maNV = sc.nextLine();
        System.out.print("Nhap ten NV: ");
        this.tenNV = sc.nextLine();
        System.out.print("Nhap tuoi NV: ");
        this.tuoi = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Nhap luong NV: ");
        this.luong = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Nhap phong ban: ");
        this.phongBan = sc.nextLine();
        System.out.print("Nhap chuc vu: ");
        this.chucVu = sc.nextLine();
    }

    public void xuat1NV() {
        System.out.printf("Ma NV: %s\nTen NV: %s\nTuoi: %d\nLuong: %.2f\nPhong Ban: %s\nChuc Vu: %s\n",
                this.maNV, this.tenNV, this.tuoi, this.luong, this.phongBan, this.chucVu);
    }

    public double thueTN() {
        double thuetn;
        if (this.luong <= 5000000) {
            thuetn = 0;
        } else {
            thuetn = (this.luong - 5000000) * 0.1;
        }
        return thuetn;
    }

    // 3 - Ham dung (Constructor)
    public LopNhanVien() {

    }

    public LopNhanVien(String maNV, String tenNV, int tuoi, double luong, String phongBan, String chucVu) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tuoi = tuoi;
        this.luong = luong;
        this.phongBan = phongBan;
        this.chucVu = chucVu;
    }

    // 4 - Phuong thuc truy cap khac (Getter va Setter)
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
}
