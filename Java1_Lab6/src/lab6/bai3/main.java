package lab6.bai3;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhap();
            danhSachSinhVien.add(sv);
        }

        System.out.println("Danh sach sinh vien:");
        for (SinhVien sv : danhSachSinhVien) {
            sv.xuat();
        }
    }
}
