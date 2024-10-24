/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1bai1;

/**
 *
 * @author Huy
 */
import java.util.Random;

public class Lab1Bai6 {

    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;

        System.out.println("So ngau nhien tu 1 den 10: " + randomNumber);
    }
}
