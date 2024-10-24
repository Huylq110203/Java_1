package lab6.bai2;

import java.util.Scanner;

public class SanPham {

    String tenSp;
    double donGia;
    String hang;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten san pham: ");
        tenSp = scanner.nextLine();

        System.out.print("Nhap don gia: ");
        donGia = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nhap hang san pham: ");
        hang = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Hang: " + hang);
        System.out.println("--------------------------");
    }
}
