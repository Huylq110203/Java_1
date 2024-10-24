/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1bai1;

/**
 *
 * @author Huy
 */
import java.util.Scanner;

public class Lab1Bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen thu nhat: ");
        int so1 = scanner.nextInt();

        System.out.print("Nhap so nguyen thu hai: ");
        int so2 = scanner.nextInt();

        System.out.print("Nhap so nguyen thu ba: ");
        int so3 = scanner.nextInt();

        double trungBinh = (double) (so1 + so2 + so3) / 3;

        System.out.printf("Trung binh cua 3 so nguyen la: %.2f\n", trungBinh);
    }
}
