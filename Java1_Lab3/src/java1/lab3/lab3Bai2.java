/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1.lab3;

/**
 *
 * @author Huy
 */
public class lab3Bai2 {

    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println("Bang cuu chuong " + i + ":");

            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }

            System.out.println();
        }
    }
}
