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
public class lab3Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen: ");
        int N = scanner.nextInt();
        
        boolean ok = true;

        if (N < 2) {
            ok = false;
        } else {
            
            for (int i = 2; i <= N - 1; i++) {
                if (N % i == 0) {
                    ok = false;
                    break;
                }
            }
        }

        if (ok) {
            System.out.println(N + " la so nguyen to");
        } else {
            System.out.println(N + " khong phai la so nguyen to");
        }
    }
}
