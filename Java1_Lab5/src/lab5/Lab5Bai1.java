package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5Bai1 {

    public static void main(String[] args) { 
        run();
    }

    public static void run() {
        ArrayList<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double tong = 0;

        while (true) {
            System.out.print("Nhap so thuc: ");
            String input = scanner.nextLine().trim();
            
            try {
                Double x = Double.parseDouble(input);
                list.add(x);
                tong += x;
            } catch (NumberFormatException e) {
                System.out.println("Loi: Vui long nhap so thuc hop le!");
                continue;
            }

            System.out.print("Nhap them (Y/N)? ");
            String tiepTuc = scanner.nextLine().trim().toUpperCase();
            if (tiepTuc.equals("N")) {
                break;
            }
        }

        System.out.println("Danh sach so thuc vua nhap: ");
        for (Double num : list) {
            System.out.println(num);
        }

        System.out.println("Tong cac so thuc: " + tong);
    }
}

// nâng cấp thêm
// 1. nhập số thực số nguyên đều được và nhập chữ vào thì không hợp lệ dùng try-catch
// 2. nhập car y/n chữ thường hoa, và bỏ kí tự khoảng trắng trim() 