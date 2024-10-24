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

public class Lab1Bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai cua hinh chu nhat: ");
        double dai = scanner.nextDouble();

        System.out.print("Nhap chieu rong cua hinh chu nhat: ");
        double rong = scanner.nextDouble();

        double chuVi = 2 * (dai + rong);
        double dienTich = dai * rong;
        double canhNho = Math.min(dai, rong);

        System.out.printf("Chu vi cua hinh chu nhat: %.2f\n", chuVi);
        System.out.printf("Dien tich cua hinh chu nhat: %.2f\n", dienTich);
        System.out.printf("Canh nho cua hinh chu nhat: %.2f\n", canhNho);
    }
}
