package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab5Bai2 {

    static ArrayList<String> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        menu();
    }

    public static void menu() {
        boolean tiepTuc = true;
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap danh sach ho va ten");
            System.out.println("2. Xuat danh sach vua nhap");
            System.out.println("3. Xuat danh sach ngau nhien");
            System.out.println("4. Sap xep giam dan va xuat danh sach");
            System.out.println("5. Tim va xoa ho ten");
            System.out.println("6. Ket thuc");
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
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    ngaunhien();
                    break;
                case 4:
                    sapxep();
                    break;
                case 5:
                    xoa();
                    break;
                case 6:
                    System.out.println("Ket thuc chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }

            System.out.print("\nBan co muon tiep tuc lua chon chuc nang khac khong (yes/no)? ");
            String tiepTucChon = scanner.nextLine().trim().toLowerCase();

            if (tiepTucChon.equals("no")) {
                tiepTuc = false;
                System.out.println("Thoat chuong trinh.");
            } else if (!tiepTucChon.equals("yes")) {
                System.out.println("Lua chon khong hop le! Thoat chuong trinh.");
                tiepTuc = false;
            }
        }
    }

    public static void nhap() {
        while (true) {
            System.out.print("Nhap ho va ten (Nhap 'exit' de dung): ");
            String hoTen = scanner.nextLine();
            if (hoTen.equalsIgnoreCase("exit")) {
                break;
            }
            list.add(hoTen);
        }
    }

    public static void xuat() {
        System.out.println("\nDanh sach vua nhap:");
        for (String hoTen : list) {
            System.out.println(hoTen);
        }
    }

    public static void ngaunhien() {
        Collections.shuffle(list);
        System.out.println("\nDanh sach ngau nhien:");
        for (String hoTen : list) {
            System.out.println(hoTen);
        }
    }

    public static void sapxep() {
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("\nDanh sach sap xep giam dan:");
        for (String hoTen : list) {
            System.out.println(hoTen);
        }
    }

    public static void xoa() {
        System.out.print("Nhap ho va ten can xoa: ");
        String hoTenXoa = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(hoTenXoa)) {
                list.remove(i);
                System.out.println("Da xoa " + hoTenXoa);
                return;
            }
        }
        System.out.println("Khong tim thay ho ten " + hoTenXoa);
    }
}
