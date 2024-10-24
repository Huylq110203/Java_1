package lab7.bai4;

class SinhVien {

    String hoTen;
    double diem;

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public String getHocLuc() {
        if (diem >= 9) {
            return "Xuat sac";
        } else if (diem >= 7.5) {
            return "Gioi";
        } else if (diem >= 6.5) {
            return "Kha";
        } else if (diem >= 5) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }

    public void xuat() {
        System.out.println("Ho ten: " + hoTen + ", Diem: " + diem + ", Hoc luc: " + getHocLuc());
    }
}
