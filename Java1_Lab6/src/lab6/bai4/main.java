package lab6.bai4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Nhap CMND: ");
                String cmnd = scanner.nextLine();

                if (cmnd.length() < 9 || cmnd.length() > 12) {
                    throw new Exception("CMND phai co tu 9 den 12 ky tu.");
                }

                long soCMND = Long.parseLong(cmnd);
                System.out.println("CMND hop le: " + soCMND);

            } catch (NumberFormatException e) {
                System.err.println("Loi: CMND chi duoc chua cac ky tu so.");
            } catch (Exception e) {
                System.err.println("Loi xay ra: " + e.getMessage());
            }
        }
    }
}
