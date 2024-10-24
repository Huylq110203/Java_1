package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import static lab5.Lab5Bai2.menu;

class SanPham {

    String ten;
    Double donGia;

    public SanPham(String ten, Double donGia) {
        this.ten = ten;
        this.donGia = donGia;
    }

    public String getTen() {
        return ten;
    }

    public Double getDonGia() {
        return donGia;
    }
}

public class Lab5Bai3 {

    static ArrayList<SanPham> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap danh sach san pham");
            System.out.println("2. Sap xep giam dan theo gia va xuat");
            System.out.println("3. Tim va xoa san pham theo ten");
            System.out.println("4. Xuat gia trung binh cua san pham");
            System.out.println("5. Ket thuc");
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
                    sapxep();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    giaTrungBinh();
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }

    public static void nhap() {
        while (true) {
            System.out.print("Nhap ten san pham (Nhap 'exit' de dung): ");
            String ten = scanner.nextLine();
            if (ten.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Nhap gia san pham: ");
            Double gia = Double.parseDouble(scanner.nextLine());
            list.add(new SanPham(ten, gia));
        }
    }

    public static void sapxep() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o2.getDonGia().compareTo(o1.getDonGia());
            }
        };
        Collections.sort(list, comp);
        System.out.println("\nDanh sach sap xep giam dan theo gia:");
        for (SanPham sp : list) {
            System.out.println(sp.getTen() + " - " + sp.getDonGia());
        }
    }

    public static void xoa() {
        System.out.print("Nhap ten san pham can xoa: ");
        String tenXoa = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTen().equalsIgnoreCase(tenXoa)) {
                list.remove(i);
                System.out.println("Da xoa san pham: " + tenXoa);
                return;
            }
        }
        System.out.println("Khong tim thay san pham: " + tenXoa);
    }

    public static void giaTrungBinh() {
        if (list.isEmpty()) {
            System.out.println("Khong co san pham nao trong danh sach.");
            return;
        }
        double tongGia = 0;
        for (SanPham sp : list) {
            tongGia += sp.getDonGia();
        }
        double giaTB = tongGia / list.size();
        System.out.println("Gia trung binh cua cac san pham: " + giaTB);
    }
}
