/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.lab4;

/**
 * 1 - thuộc tính: main(String), tenNV(String); tuổi(Int) 2 - phương thức:
 * nhap(), xuat()
 */
import java.util.Scanner;
public class NhanVien {

    //1 - Khai báo các thuộc tính: main(String), tenNv(String), tuoi(int)
    public String maNv;
    public String tenNv;
    public int tuoi;
    public double luong;

    //2 - Xây dựng các phương thức nhap(); xuat();
    void nhap() {
        System.out.println("Nhap thong tinn NV");
        Scanner sn = new Scanner(System.in);
        System.out.print("MANV:");
        maNv = sn.nextLine();
        System.out.print("TENNV:");
        tenNv = sn.nextLine();
        System.out.print("TUOINV:");
        tuoi = sn.nextInt();
        System.out.print("LUONGNV:");
        luong = sn.nextInt();
    }

    void xuat() {
        System.out.printf("MANV: - %s \n", maNv);
        System.out.printf("TENNV: - %s \n", tenNv);
        System.out.printf("TUOINV: - %d \n", tuoi);
        System.out.printf("LUONGNV: - %f \n", luong);
    }
}
