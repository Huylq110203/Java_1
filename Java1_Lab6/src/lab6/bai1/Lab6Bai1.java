package lab6.bai1;

import java.util.Scanner;

public class Lab6Bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ho va ten: ");
        String hoVaTen = scanner.nextLine().trim();

        int indexFirstSpace = hoVaTen.indexOf(" ");
        int indexLastSpace = hoVaTen.lastIndexOf(" ");

        String ho = hoVaTen.substring(0, indexFirstSpace).toUpperCase();
        String ten = hoVaTen.substring(indexLastSpace + 1).toUpperCase();
        String tenDem = hoVaTen.substring(indexFirstSpace +1 , indexLastSpace);

        System.out.println("Ho: " + ho);
        System.out.println("Ten dem: " + tenDem);
        System.out.println("Ten: " + ten);

    }
}
