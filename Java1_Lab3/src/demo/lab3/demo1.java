package demo.lab3;

import java.util.Scanner;

/**
 *
 * @author Huy
 */
public class demo1 {

    public static void main(String[] args) {

        System.out.println("Nhap mot so nguyen:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.printf("Ban da nhap N = %d \n", N);

        boolean isPrime = true;
        for (int i = 2; i <= N / 2; i++) {
            if (N % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && N > 1) {
            System.out.printf("N %d la so nguyen to\n", N);
        } else {
            System.out.printf("N %d khong phai la so nguyen to\n", N);
        }
    }
}
