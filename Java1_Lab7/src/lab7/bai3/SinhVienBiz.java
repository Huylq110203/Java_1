
package lab7.bai3;

    class SinhVienBiz extends SinhVienPoly {
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    // Ghi de phuong thuc getDiem() de tinh diem theo cong thuc (2*marketing + sales)/3
    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}

