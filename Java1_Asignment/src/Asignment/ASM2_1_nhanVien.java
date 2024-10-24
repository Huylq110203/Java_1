package Asignment;

import java.util.ArrayList;

abstract class NhanVien {

    protected String manv;
    protected String hoten;
    protected double luong;

    public NhanVien(String manv, String hoten, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
    }

    public String getMaNV() {
        return manv;
    }

    public String getHoTen() {
        return hoten;
    }

    public double getLuong() {
        return luong;
    }

    @Override
    public String toString() {
        return "Ma NV: " + manv + ", Ho ten: " + hoten + ", Luong: " + luong;
    }

    public abstract double getThuNhap();

    public double getThueTN() {
        double thuNhap = getThuNhap();
        if (thuNhap < 9000000) {
            return 0;
        } else if (thuNhap <= 15000000) {
            return thuNhap * 0.1;
        } else {
            return thuNhap * 0.12;
        }
    }

    public void xuatThongTin() {
        System.out.printf("Ma: %s - Ho ten: %s - Luong: %.2f - Thu nhap: %.2f - Thue TN: %.2f\n",
                manv, hoten, luong, getThuNhap(), getThueTN());
    }
}

class TiepThi extends NhanVien {

    private double doanhSo;
    private double hueHong;

    public TiepThi(String manv, String hoten, double luong, double doanhSo, double hueHong) {
        super(manv, hoten, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    @Override
    public double getThuNhap() {
        return luong + doanhSo * hueHong;
    }
}

class TruongPhong extends NhanVien {

    private double trachNhiem;

    public TruongPhong(String manv, String hoten, double luong, double trachNhiem) {
        super(manv, hoten, luong);
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        return luong + trachNhiem;
    }
}
