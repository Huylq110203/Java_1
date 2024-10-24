/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.lab2;

/**
 *
 * @author Huy
 */
public class demoWhile {
    public static void main(String[] args) {
//        demo While
        int i = 0, n = 9;
         while (i < n) { // Dieu kien
             // Lenh trong While
             i++;
         } // end While
         
         i = 0; n = 0;
         do {// Điều kiên lặp
             // Lệnh trong While
             System.out.println("da dung Do while");
             i++;
         } while(i < n);
    }
}
