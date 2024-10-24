package lab7.bai4;

import java.util.InputMismatchException;

import static lab7.bai4.ChucNang.scanner;
public class main {
    public static void main(String[] args) {
        boolean tiepTuc = true;
        while (tiepTuc) {
            try {
                menu();
            } catch (InputMismatchException e) {
                System.out.println("Lua chon khong hop le! Vui long nhap so.");
                scanner.nextLine(); 
            }
            tiepTuc = ChucNang.muonTiepTuc();
        }
    }

    public static void menu() {
        System.out.println("1. Nhap danh sach sinh vien");
        System.out.println("2. Xuat thong tin danh sach sinh vien");
        System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
        System.out.println("4. Sap xep danh sach sinh vien theo diem");
        System.out.println("5. Ket thuc");
        System.out.print("Moi ban nhap lua chon: ");

        try {
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    ChucNang.nhap();
                    break;
                case 2:
                    ChucNang.xuat();
                    break;
                case 3:
                    ChucNang.svGioi();
                    break;
                case 4:
                    ChucNang.sapXep();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le. Vui long thu lai.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Lua chon khong hop le! Vui long nhap so.");
            scanner.nextLine(); 
        }
    }
}
