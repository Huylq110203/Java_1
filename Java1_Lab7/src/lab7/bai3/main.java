package lab7.bai3;

public class main {

    public static void main(String[] args) {
        SinhVienPoly svIT = new SinhVienIT("Nguyen Van A", "CNTT", 8.0, 7.5, 9.0);
        SinhVienPoly svBiz = new SinhVienBiz("Le Thi B", "Marketing", 7.0, 8.5);

        System.out.println("Thong tin sinh vien IT:");
        svIT.xuat();

        System.out.println("\nThong tin sinh vien Biz:");
        svBiz.xuat();
    }
}
