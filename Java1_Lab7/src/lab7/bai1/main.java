package lab7.bai1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai hinh chu nhat 1: ");
        double dai1 = scanner.nextDouble();
        System.out.print("Nhap chieu rong hinh chu nhat 1: ");
        double rong1 = scanner.nextDouble();
        ChuNhat cn1 = new ChuNhat(dai1, rong1);

        System.out.print("Nhap chieu dai hinh chu nhat 2: ");
        double dai2 = scanner.nextDouble();
        System.out.print("Nhap chieu rong hinh chu nhat 2: ");
        double rong2 = scanner.nextDouble();
        ChuNhat cn2 = new ChuNhat(dai2, rong2);

        System.out.print("Nhap canh hinh vuong: ");
        double canh = scanner.nextDouble();
        ChuNhat vu = new Vuong(canh);

        System.out.println("\nThong tin hinh chu nhat 1:");
        cn1.xuat();

        System.out.println("\nThong tin hinh chu nhat 2:");
        cn2.xuat();

        System.out.println("\nThong tin hinh vuong:");
        vu.xuat();
    }
}
