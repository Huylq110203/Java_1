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

public class Lab1Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap canh cua khoi lap phuong: ");
        double canh = scanner.nextDouble();

        double theTich = Math.pow(canh, 3);

        System.out.printf("The tich cua khoi lap phuong: %.2f\n", theTich);
    }
}
