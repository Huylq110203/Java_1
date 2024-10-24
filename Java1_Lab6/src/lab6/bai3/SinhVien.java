package lab6.bai3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SinhVien {

    String hoTen;
    String email;
    String soDienThoai;
    String cmnd;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();

        do {
            System.out.print("Nhap email: ");
            email = scanner.nextLine();
            if (!isValidEmail(email)) {
                System.out.println("Email khong hop le. Vui long nhap lai.");
            }
        } while (!isValidEmail(email));

        do {
            System.out.print("Nhap so dien thoai: ");
            soDienThoai = scanner.nextLine();
            if (!isValidPhone(soDienThoai)) {
                System.out.println("So dien thoai khong hop le. Vui long nhap lai.");
            }
        } while (!isValidPhone(soDienThoai));

        do {
            System.out.print("Nhap CMND: ");
            cmnd = scanner.nextLine();
            if (!isValidCMND(cmnd)) {
                System.out.println("CMND khong hop le. Vui long nhap lai.");
            }
        } while (!isValidCMND(cmnd));
    }

    public void xuat() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("So dien thoai: " + soDienThoai);
        System.out.println("CMND: " + cmnd);
        System.out.println("--------------------------");
    }

    public boolean isValidEmail(String email) {
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[a-zA-Z]{2,6}$";
        return Pattern.matches(emailRegex, email);
    }

    public boolean isValidPhone(String phone) {
        String phoneRegex = "^\\d{9,10}$";
        return Pattern.matches(phoneRegex, phone);
    }

    public boolean isValidCMND(String cmnd) {
        String cmndRegex = "^\\d{9}|\\d{12}$";
        return Pattern.matches(cmndRegex, cmnd);
    }
}
