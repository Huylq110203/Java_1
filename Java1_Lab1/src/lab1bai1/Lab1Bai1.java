package lab1bai1;

import java.util.Scanner;

public class Lab1Bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ho va ten sinh vien: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhap diem trung binh: ");
        double diemTrungBinh = scanner.nextDouble();

        System.out.printf("%s %.2f diem\n", hoTen, diemTrungBinh);
    }

}
