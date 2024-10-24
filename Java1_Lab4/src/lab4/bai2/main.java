/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4.bai2;

import lab4.bai1.SanPham;

public class main {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        
        System.out.println("Nhap thong tin san pham thu nhat:");
        sp1.nhap();

        System.out.println("Nhap thong tin san pham thu hai:");
        sp2.nhap();

        System.out.println("\nThong tin san pham thu nhat:");
        sp1.xuat();

        System.out.println("\nThong tin san pham thu hai:");
        sp2.xuat();
    }
}
