package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Xe> dsXe = new ArrayList<>();

        XeHoi xehoi11 = new XeHoi("Mazda 6", 150, 55);
        dsXe.add(xehoi11);

        XeTai xetai11 = new XeTai("Ford Ranger", 120, 60, 3500);
        dsXe.add(xetai11);

        Xe xe1 = new Xe();
        xe1.xuatThongTin();

        Xe xe2 = new Xe("Toyota", 120);
        xe2.xuatThongTin();

        XeHoi xehoi1 = new XeHoi("Honda Civic", 100, 50);
        xehoi1.xuatThongTin();

        XeHoi xehoi2 = new XeHoi("Isuzu", 60, 5000);
        xehoi2.xuatThongTin();

        for (Xe xe : dsXe) {
            xe.xuatThongTin();
            System.out.println("-------------");

            int choice;
            do {
                System.out.println("----- MENU -----");
                System.out.println("1. Them xe moi");
                System.out.println("2. Xoa xe theo ten");
                System.out.println("3. Cap nhat xe theo ten");
                System.out.println("4. Tim kiem xe theo ten");
                System.out.println("5. Xuat danh sach xe");
                System.out.println("0. Thoat");
                System.out.print("Nhap lua chon cua ban: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Đọc bỏ dòng trống

                switch (choice) {
                    case 1:
                        themXe(dsXe, scanner);
                        break;
                    case 2:
                        xoaXe(dsXe, scanner);
                        break;
                    case 3:
                        capNhatXe(dsXe, scanner);
                        break;
                    case 4:
                        timKiemXe(dsXe, scanner);
                        break;
                    case 5:
                        xuatDanhSachXe(dsXe);
                        break;
                    case 0:
                        System.out.println("Ket thuc chuong trinh!");
                        break;
                    default:
                        System.out.println("Lua chon khong hop le!");
                }                                                             
            } while (choice != 0);

            scanner.close();
        }
    }

    // Chức năng thêm xe mới
    public static void themXe(ArrayList<Xe> dsXe, Scanner scanner) {
        System.out.print("Nhap ten xe: ");
        String tenxe = scanner.nextLine();
        System.out.print("Nhap toc do: ");
        int tocdo = scanner.nextInt();
        System.out.print("Nhap dung tich binh xang: ");
        double dungtichbinhxang = scanner.nextDouble();
        System.out.print("Nhap tai trong (neu co, neu khong nhap 0): ");
        int taitrong = scanner.nextInt();

        if (taitrong > 0) {
            XeTai xeTai = new XeTai(tenxe, tocdo, dungtichbinhxang, taitrong);
            dsXe.add(xeTai);
        } else {
            XeHoi xeHoi = new XeHoi(tenxe, tocdo, dungtichbinhxang);
            dsXe.add(xeHoi);
        }
        System.out.println("Da them xe moi vao danh sach.");
    }

    // Chức năng xóa xe theo tên
    public static void xoaXe(ArrayList<Xe> dsXe, Scanner scanner) {
        System.out.print("Nhap ten xe muon xoa: ");
        String tenxe = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < dsXe.size(); i++) {
            if (dsXe.get(i).getTenxe().equalsIgnoreCase(tenxe)) {
                dsXe.remove(i);
                System.out.println("Da xoa xe: " + tenxe);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay xe voi ten: " + tenxe);
        }
    }

    // Chức năng cập nhật xe theo tên
    public static void capNhatXe(ArrayList<Xe> dsXe, Scanner scanner) {
        System.out.print("Nhap ten xe muon cap nhat: ");
        String tenxe = scanner.nextLine();
        boolean found = false;

        for (Xe xe : dsXe) {
            if (xe.getTenxe().equalsIgnoreCase(tenxe)) {
                System.out.print("Nhap toc do moi: ");
                int tocdo = scanner.nextInt();
                xe.setTocdo(tocdo);
                System.out.println("Da cap nhat toc do cho xe: " + tenxe);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay xe voi ten: " + tenxe);
        }
    }

    // Chức năng tìm kiếm xe theo tên
    public static void timKiemXe(ArrayList<Xe> dsXe, Scanner scanner) {
        System.out.print("Nhap ten xe muon tim: ");
        String tenxe = scanner.nextLine();
        boolean found = false;

        for (Xe xe : dsXe) {
            if (xe.getTenxe().equalsIgnoreCase(tenxe)) {
                xe.xuatThongTin();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay xe voi ten: " + tenxe);
        }
    }

    // Chức năng xuất toàn bộ danh sách xe
    public static void xuatDanhSachXe(ArrayList<Xe> dsXe) {
        if (dsXe.isEmpty()) {
            System.out.println("Danh sach xe trong.");
        } else {
            for (Xe xe : dsXe) {
                xe.xuatThongTin();
                System.out.println("-------------");
            }
        }

    }
}

//Thêm xe mới.
//Xóa xe theo tên.
//Cập nhật thông tin xe.
//Tìm kiếm xe theo tên.
//Xuất toàn bộ danh sách xe.

