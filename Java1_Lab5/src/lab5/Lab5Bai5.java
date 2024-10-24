package lab5;

import java.util.Scanner;

public class Lab5Bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lab5Bai1 bai1 = new Lab5Bai1();
        Lab5Bai2 bai2 = new Lab5Bai2();
        Lab5Bai3 bai3 = new Lab5Bai3();
        Lab5Bai4 bai4 = new Lab5Bai4();

        boolean tiepTuc = true;

        while (tiepTuc) {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Bai 1: Nhap danh sach so thuc");
            System.out.println("2. Bai 2: Quan ly danh sach ho ten");
            System.out.println("3. Bai 3: Quan ly san pham");
            System.out.println("4. Bai 4: Quan ly sinh vien");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang: ");

            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lua chon khong hop le! Vui long nhap lai.");
                continue;
            }
            switch (choice) {
                case 1:
                    bai1.run();
                    break;
                case 2:
                    bai2.run();
                    break;
                case 3:
                    bai3.run();
                    break;
                case 4:
                    bai4.run();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
                    continue;
            }
            while (true) {
                System.out.print("Ban co muon tiep tuc chon chuong trinh? (yes/no): ");
                String tiepTucChon = scanner.nextLine().trim().toLowerCase();

                if (tiepTucChon.equals("no")) {
                    tiepTuc = false;
                    System.out.println("Thoat chuong trinh.");
                    break;
                } else if (tiepTucChon.equals("yes")) {
                    break;
                } else {
                    System.out.println("Lua chon khong hop le! Vui long nhap lai.");
                }
            }
        }
    }
}
