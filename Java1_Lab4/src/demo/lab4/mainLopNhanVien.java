package demo.lab4;

public class mainLopNhanVien {
    public static void main(String[] args) {
        // Tao doi tuong nv1 bang ham dung mac dinh va nhap thong tin
        LopNhanVien nv1 = new LopNhanVien();
        nv1.nhap1NV();
        nv1.xuat1NV();
        double thueNV1 = nv1.thueTN();
        System.out.printf("Thue thu nhap cua NV1: %.2f\n", thueNV1);

        // Tao doi tuong nv2 bang ham dung co tham so
        LopNhanVien nv2 = new LopNhanVien("NV002", "Nguyen Van B", 30, 7000000, "Ke toan", "Truong phong");
        nv2.xuat1NV();
        double thueNV2 = nv2.thueTN();
        System.out.printf("Thue thu nhap cua NV2: %.2f\n", thueNV2);
    }
}
