/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1.lab2;

/**
 *
 * @author Huy
 */
import java.util.Scanner;

public class lab2Bai4 {

    public static void menu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giai phuong trinh bac nhat");
        System.out.println("2. Giai phuong trinh bac 2");
        System.out.println("3. Tinh tien dien");
        System.out.println("4. Ket thuc");
        System.out.println("+---------------------------------------------------+");
        System.out.print("Chon chuc nang: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            menu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Lua chon 1: Giai pt bac 1");
                    lab2Bai1.main(args);
                    break;
                case 2:
                    System.out.println("Lua chon 2: Giai pt bac 2");
                    lab2Bai2.main(args);
                    break;
                case 3:
                    System.out.println("Lua chon 3: Tinh tien dien");
                    lab2Bai3.main(args);
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Khong hop le. Vui long chon tu 1 den 4.");
            }
        } while (choice != 4);
    }
}
