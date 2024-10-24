package Poly.ho;

public class NhanVien {
    //1 Thuộc tính
    public String hoTen;
    protected double luong;
    
    // 2. Hàm dựng
    public NhanVien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public NhanVien() {
    }
    
     //3. Getter setter
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {    
        this.luong = luong;
    }

    // 4 Phương thức
    public void xuat() {
        System.out.println("Thong tin nhan vien");
    }

    private double thueThuNhap() {
        return thueThuNhap();
    }
}
