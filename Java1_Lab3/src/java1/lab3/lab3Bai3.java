/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1.lab3;

/**
 *
 * @author Huy
 */
import java.util.Arrays;
import java.util.Scanner;

public class lab3Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];

        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }

        Arrays.sort(mang);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(mang));

        int min = mang[0];
        System.out.println("Phan tu nho nhat trong mang: " + min);

        int tong = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 3 == 0) {
                tong += mang[i];
                dem++;
            }
        }

        if (dem > 0) {
            double trungBinhCong = (double) tong / dem;
            System.out.println("Trung binh cong cac phan tu chia het cho 3: " + trungBinhCong);
        } else {
            System.out.println("Khong co phan tu nao chia het cho 3.");
        }
    }
}
