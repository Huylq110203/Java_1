package Asignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ASM2_2_chucNang {

    static ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    private static final String REGEX_MA_NV = "^[A-Za-z][A-Za-z0-9]{2,9}$"; // Mã nhân viên: bắt đầu bằng chữ cái, 3-10 ký tự
    private static final String REGEX_HO_TEN = "^[\\p{L} .'-]+$"; // Tên nhân viên: chỉ chứa chữ cái và một số ký tự đặc biệt
    private static final String REGEX_LUONG = "^[0-9]+(\\.[0-9]{1,2})?$";// Lương: chỉ chứa số và tối đa 2 chữ số thập phân

    // Kiểm tra mã nhân viên trùng lặp
    public static boolean kiemTraTrungMaNV(String manv) {
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getMaNV().equals(manv)) {
                return true;
            }
        }
        return false;
    }
// Hàm chung xử lý ngoại lệ
//    public static int nhapSoNguyen(String thongBao) {
//    Scanner scanner = new Scanner(System.in);
//    int so = 0;
//    boolean hopLe = false;
//    while (!hopLe) {
//        try {
//            System.out.print(thongBao);
//            so = scanner.nextInt();
//            hopLe = true;
//        } catch (InputMismatchException e) {
//            System.out.println("Loi: Vui long nhap so nguyen!");
//            scanner.nextLine(); // Để bỏ qua ký tự không hợp lệ
//        }
//    }
//    return so;
//}

    // Y1: Nhập danh sách nhân viên vào bàn phím
    public static void nhapDanhSachNhanVien() {
        System.out.println("Nhap so luong nhan vien: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < soLuong; i++) {
            int loai = -1;
            do {
                try {
                    System.out.println("Chon loai nhan vien: 1 - Hanh chinh, 2 - Tiep thi, 3 - Truong phong");
                    loai = scanner.nextInt();
                    scanner.nextLine();

                    if (loai < 1 || loai > 3) {
                        System.out.println("Lua chon khong hop le. Vui long nhap lai.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Nhap khong hop le. Vui long nhap lai.");
                    scanner.nextLine();
                }
            } while (loai < 1 || loai > 3);

            String manv;
            do {
                System.out.print("Nhap ma nhan vien: ");
                manv = scanner.nextLine();
                if (!Pattern.matches(REGEX_MA_NV, manv)) {
                    System.out.println("Ma nhan vien khong hop le. Vui long nhap lai (bat dau bang chu cai, 3-10 ky tu).");
                } else if (kiemTraTrungMaNV(manv)) {
                    System.out.println("Ma nhan vien da ton tai. Vui long nhap ma khac.");
                }
            } while (!Pattern.matches(REGEX_MA_NV, manv) || kiemTraTrungMaNV(manv));

            String hoten;
            do {
                System.out.print("Nhap ho ten: ");
                hoten = scanner.nextLine();
                if (!Pattern.matches(REGEX_HO_TEN, hoten)) {
                    System.out.println("Ho ten khong hop le. Vui long nhap lai.");
                }
            } while (!Pattern.matches(REGEX_HO_TEN, hoten));

            double luong = -1;
            while (luong < 0) {
                System.out.print("Nhap luong: ");
                String luongInput = scanner.nextLine();
                if (!Pattern.matches(REGEX_LUONG, luongInput)) {
                    System.out.println("Nhap khong hop le. Vui long nhap so.");
                } else {
                    luong = Double.parseDouble(luongInput);
                }
            }

            if (loai == 1) {
                // Nhân viên hành chính
                NhanVien nv = new NhanVien(manv, hoten, luong) {
                    @Override
                    public double getThuNhap() {
                        return luong;
                    }
                };
                danhSachNhanVien.add(nv);
            } else if (loai == 2) {
                // Nhân viên tiếp thị
                System.out.print("Nhap doanh so: ");
                double doanhSo = scanner.nextDouble();
                System.out.print("Nhap ti le hue hong: ");
                double hueHong = scanner.nextDouble();
                NhanVien nv = new TiepThi(manv, hoten, luong, doanhSo, hueHong);
                danhSachNhanVien.add(nv);
            } else if (loai == 3) {
                // Trưởng phòng
                System.out.print("Nhap luong trach nhiem: ");
                double trachNhiem = scanner.nextDouble();
                NhanVien nv = new TruongPhong(manv, hoten, luong, trachNhiem);
                danhSachNhanVien.add(nv);
            }
            scanner.nextLine();
        }
    }

    // Y2: Xuất danh sách nhân viên
    public static void xuatDanhSachNhanVien() {
        System.out.println("=== Danh sach nhan vien ===");
        for (NhanVien nv : danhSachNhanVien) {
            nv.xuatThongTin();
        }
    }

    // Y3: Tìm kiếm nhân viên theo mã
    public static void timKiemNhanVienTheoMa() {
        System.out.print("Nhap ma nhan vien can tim: ");
        String manv = scanner.nextLine();
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getMaNV().equals(manv)) {
                nv.xuatThongTin();
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien voi ma: " + manv);
    }

    // Y4: Xóa nhân viên theo mã
    public static void xoaNhanVienTheoMa() {
        System.out.print("Nhap ma nhan vien can xoa: ");
        String manv = scanner.nextLine();
        for (int i = 0; i < danhSachNhanVien.size(); i++) {
            if (danhSachNhanVien.get(i).getMaNV().equals(manv)) {
                danhSachNhanVien.remove(i);
                System.out.println("Da xoa nhan vien voi ma: " + manv);
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien voi ma: " + manv);
    }

    // Y5: Cập nhật thông tin nhân viên theo mã
    public static void capNhatThongTinNhanVien() {
        System.out.print("Nhap ma nhan vien can cap nhat: ");
        String manv = scanner.nextLine();
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getMaNV().equals(manv)) {
                System.out.print("Nhap ho ten moi: ");
                String hoten = scanner.nextLine();
                nv.hoten = hoten; // Cập nhật họ tên
                double luong = -1;
                while (luong < 0) {
                    try {
                        System.out.print("Nhap luong moi: ");
                        luong = scanner.nextDouble();
                        nv.luong = luong; // Cập nhật lương
                    } catch (InputMismatchException e) {
                        System.out.println("Nhap khong hop le. Vui long nhap so.");
                        scanner.nextLine();
                    }
                }
                scanner.nextLine();
                System.out.println("Da cap nhat thong tin cho nhan vien voi ma: " + manv);
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien voi ma: " + manv);
    }

    // Y6: Tìm kiếm nhân viên theo khoảng lương
    public static void timKiemNhanVienTheoKhoangLuong() {
        double minLuong = -1;
        double maxLuong = -1;
        while (minLuong < 0) {
            try {
                System.out.print("Nhap luong min: ");
                minLuong = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Nhap khong hop le. Vui long nhap so.");
                scanner.nextLine();
            }
        }
        while (maxLuong < 0 || maxLuong < minLuong) {
            try {
                System.out.print("Nhap luong max: ");
                maxLuong = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Nhap khong hop le. Vui long nhap so.");
                scanner.nextLine();
            }
        }

        System.out.println("=== Danh sach nhan vien trong khoang luong ===");
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getThuNhap() >= minLuong && nv.getThuNhap() <= maxLuong) {
                nv.xuatThongTin();
            }
        }
    }

    // Y7: Sắp xếp nhân viên theo họ và tên
    public static void sapXepNhanVienTheoHoTen() {
        Collections.sort(danhSachNhanVien, (nv1, nv2) -> nv1.getHoTen().compareTo(nv2.getHoTen()));
        System.out.println("Da sap xep nhan vien theo ho ten.");

        System.out.println("=== Danh sach nhan vien da duoc sap xep theo ho ten ===");
        for (NhanVien nv : danhSachNhanVien) {
            nv.xuatThongTin(); 
        }
    }

    // Y8: Sắp xếp nhân viên theo thu nhập
    public static void sapXepNhanVienTheoThuNhap() {
        Collections.sort(danhSachNhanVien, (nv1, nv2) -> Double.compare(nv1.getThuNhap(), nv2.getThuNhap()));
        System.out.println("Da sap xep nhan vien theo thu nhap.");
    }

    // Y9: Xuất 5 nhân viên có thu nhập cao nhất
    public static void xuat5NhanVienThuNhapCaoNhat() {
        Collections.sort(danhSachNhanVien, (nv1, nv2) -> Double.compare(nv2.getThuNhap(), nv1.getThuNhap()));
        System.out.println("=== 5 nhan vien co thu nhap cao nhat ===");
        for (int i = 0; i < Math.min(5, danhSachNhanVien.size()); i++) {
            danhSachNhanVien.get(i).xuatThongTin();
        }
    }
}
