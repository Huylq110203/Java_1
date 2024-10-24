package lab7.bai1;

public class Vuong extends ChuNhat {

    public Vuong(double canh) {
        super(canh, canh);

    }

    @Override
    public void xuat() {
        System.out.println("Canh: " + dai);
        System.out.println("Dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}
