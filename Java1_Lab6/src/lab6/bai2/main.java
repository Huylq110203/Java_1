package lab6.bai2;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap thong tin san pham thu " + (i + 1) + ":");
            SanPham sp = new SanPham();
            sp.nhap();
            danhSachSanPham.add(sp);
        }

        System.out.println("Cac san pham co hang Nokia:");
        for (SanPham sp : danhSachSanPham) {
            if (sp.hang.equalsIgnoreCase("Nokia")) {
                sp.xuat();
            }
        }
    }
}
