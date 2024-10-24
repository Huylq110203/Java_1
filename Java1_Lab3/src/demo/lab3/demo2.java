/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.lab3;

/**
 *
 * @author Huy
 */
public class demo2 {
    public static void main(String[] args) {
         for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) { 
                int z = 100 - x - y;
                        
                         if (5 * x + 3 * y + z == 100) { // Điều kiện tổng số cỏ là 100
                    System.out.println("So trau dung: " + x + ", So trau nam: " + y + ", So trau gia: " + z);
                }
            }
        }
    }
}
