/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.lab2;

/**
 *
 * @author Huy
 */
import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("1. Giai pt bac 1");
        System.out.println("2. Giai pt bac 2");
        System.out.println("3. Tinh tien dien");
        System.out.println("4. Ket thuc");
        System.out.println("----------------------");

        System.out.print("Nhap lua chon cua ban: ");
        int chon = scanner.nextInt();
        switch (chon) {
            case 1: 
                System.out.println("Lua chon 1: Giai pt bac 1");
                break;
            case 2:
                System.out.println("Lua chon 2: Giai pt bac 2");
                break;
            case 3:
                System.out.println("Lua chon 3: Tinh tien dien");
                break;
            case 4:
                System.out.println("Ket thuc chuong trinh.");
                break;
            default:
                System.out.println("Khong hop le. Vui long chon tu 1 den 4.");
        }
    }
}
