/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1.lab3;

/**
 *
 * @author Huy
 */
import java.util.Scanner;

public class lab3Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] hoTen = new String[n];
        double[] diem = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ho ten sinh vien thu " + (i + 1) + ": ");
            hoTen[i] = scanner.nextLine();
            System.out.print("Nhap diem sinh vien thu " + (i + 1) + ": ");
            diem[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println("\nDanh sach sinh vien:");
        for (int i = 0; i < n; i++) {
            String hocLuc = xepLoaiHocLuc(diem[i]);
            System.out.printf("Ho ten: %s - Diem: %.2f - Hoc luc: %s\n", hoTen[i], diem[i], hocLuc);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {

                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;

                    String tempHoTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempHoTen;
                }
            }
        }

        System.out.println("\nDanh sach sinh vien sau khi sap xep theo diem:");
        for (int i = 0; i < n; i++) {
            String hocLuc = xepLoaiHocLuc(diem[i]);
            System.out.printf("Ho ten: %s - Diem: %.2f - Hoc luc: %s\n", hoTen[i], diem[i], hocLuc);
        }

        scanner.close();
    }

    public static String xepLoaiHocLuc(double diem) {
        if (diem < 5) {
            return "Yeu";
        } else if (diem < 6.5) {
            return "Trung binh";
        } else if (diem < 7.5) {
            return "Kha";
        } else if (diem < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }
}
