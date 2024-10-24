package lab4.bai3;

import lab4.bai1.SanPham;

public class main {

    public static void main(String[] args) {
        SanPham sp1 = new SanPham("San pham 1", 500000, 100000);

        SanPham sp2 = new SanPham("San pham 2", 300000);

        System.out.println("Thong tin san pham co giam gia:");
        sp1.xuat();

        System.out.println("\nThong tin san pham khong giam gia:");
        sp2.xuat();
    }
}
