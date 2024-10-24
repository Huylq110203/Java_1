
package lab7.bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class ChucNang {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
    
    public static void nhap() {
        System.out.print("Nhap so luong sinh vien: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < soLuong; i++) {
            System.out.print("Nhap ho ten sinh vien: ");
            String hoTen = scanner.nextLine();
            System.out.print("Nhap diem: ");
            double diem = scanner.nextDouble();
            scanner.nextLine(); 
            danhSachSinhVien.add(new SinhVien(hoTen, diem));
        }
    }

    public static void xuat() {
        System.out.println("Danh sach sinh vien:");
        for (SinhVien sv : danhSachSinhVien) {
            sv.xuat();
        }
    }

    public static void svGioi() {
        System.out.println("Danh sach sinh vien co hoc luc gioi:");
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.getHocLuc().equals("Gioi")) {
                sv.xuat();
            }
        }
    }

    public static void sapXep() {
        Collections.sort(danhSachSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.diem, sv1.diem);
            }
        });
        System.out.println("Danh sach sinh vien sau khi sap xep:");
        xuat();
    }

    public static boolean muonTiepTuc() {
        System.out.print("Ban co muon tiep tuc lua chon khong (yes/no)? ");
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("yes")) {
                return true;
            } else if (input.equals("no")) {
                System.out.println("Chuong trinh ket thuc.");
                return false;
            } else {
                System.out.print("Lua chon khong hop le! Moi nhap lai (yes/no): ");
            }
        }
    }
}
