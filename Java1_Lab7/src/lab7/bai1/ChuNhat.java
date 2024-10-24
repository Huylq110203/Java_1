package lab7.bai1;

public class ChuNhat {

    public double rong;
    public double dai;

    // hàm
     public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }
     
    double getChuVi() {
        return 2 * (this.dai + this.rong);
    }
    
    double getDienTich() {
        return this.dai * this.rong;
    }
    
    void xuat() {
        System.out.println("Chieu rong: " + rong);
        System.out.println("Chieu dai: " + dai);
        System.out.println("Dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }

   

}
