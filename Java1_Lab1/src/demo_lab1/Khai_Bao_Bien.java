/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_lab1;


/**
 *
 * @author Huy
 */
import java.util.Scanner;
public class Khai_Bao_Bien {
    public static void main(String args[]) {
        
//        System.out.println("demo_lab1.Khai_Bao_Bien.main()");
//        System.out.println("Khai bao bien kieu chuoi"); 
//        String str = "abc";
//        
//        System.out.println("Khai bao kieu so thuc");
//        float so = 999999999999;
//        
//        System.out.println("In Gia Tri " + str);
Scanner sc = new Scanner(System.in);
        
          System.out.print("Nhap so thuc kieu float: ");
        float soThucFloat = sc.nextFloat();

        System.out.print("Nhap so thuc kieu double: ");
        double soThucDouble = sc.nextDouble();

        System.out.println("So thuc kieu float: " + soThucFloat);
        System.out.println("So thuc kieu double: " + soThucDouble);
    }
}
