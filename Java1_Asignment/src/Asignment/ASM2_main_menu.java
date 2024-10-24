package Asignment;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ASM2_main_menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueChoice;

        do {
            int menuChoice = -1;
            do {
                try {
                    System.out.println("==== He thong quan ly nhan su cong ty Rong Viet ====");
                    System.out.println("1. Nhap danh sach nhan vien");
                    System.out.println("2. Xuat danh sach nhan vien");
                    System.out.println("3. Tim kiem nhan vien theo ma");
                    System.out.println("4. Xoa nhan vien theo ma");
                    System.out.println("5. Cap nhat thong tin nhan vien theo ma");
                    System.out.println("6. Tim kiem nhan vien theo khoang luong");
                    System.out.println("7. Sap xep nhan vien theo ho va ten");
                    System.out.println("8. Sap xep nhan vien theo thu nhap");
                    System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
                    System.out.println("0. Thoat");
                    System.out.print("Nhap lua chon cua ban: ");
                    menuChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (menuChoice < 0 || menuChoice > 9) {
                        System.out.println("Lua chon khong hop le. Vui long nhap lai.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Nhap khong hop le. Vui long nhap so tu 0 den 9.");
                    scanner.nextLine();
                    menuChoice = -1;
                }
            } while (menuChoice < 0 || menuChoice > 9);

            switch (menuChoice) {
                case 1:
                    ASM2_2_chucNang.nhapDanhSachNhanVien();
                    break;
                case 2:
                    ASM2_2_chucNang.xuatDanhSachNhanVien();
                    break;
                case 3:
                    ASM2_2_chucNang.timKiemNhanVienTheoMa();
                    break;
                case 4:
                    ASM2_2_chucNang.xoaNhanVienTheoMa();
                    break;
                case 5:
                    ASM2_2_chucNang.capNhatThongTinNhanVien();
                    break;
                case 6:
                    ASM2_2_chucNang.timKiemNhanVienTheoKhoangLuong();
                    break;
                case 7:
                    ASM2_2_chucNang.sapXepNhanVienTheoHoTen();
                    break;
                case 8:
                    ASM2_2_chucNang.sapXepNhanVienTheoThuNhap();
                    break;
                case 9:
                    ASM2_2_chucNang.xuat5NhanVienThuNhapCaoNhat();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }

            if (menuChoice != 0) {
                System.out.print("Ban co muon tiep tuc? (yes/no): ");
                continueChoice = scanner.nextLine();
            } else {
                continueChoice = "no";
            }

        } while (continueChoice.equalsIgnoreCase("yes"));

        scanner.close();
    }
}
