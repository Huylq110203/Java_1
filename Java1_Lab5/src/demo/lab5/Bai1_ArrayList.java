package demo.lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1_ArrayList {
    private static ArrayList<Double> mangSt = new ArrayList<>();

    public static void main(String[] args) {
        nhap(); 
        xuat(); 
    }

    public static void nhap() {
        double so;
        Scanner nhap = new Scanner(System.in);
        int dung;
        do {
            System.out.print("Nhap so: ");
            so = nhap.nextDouble();
            mangSt.add(so);
            System.out.print("Nhan 1 de tiep hay nhan 2 de ngung: ");
            dung = nhap.nextInt();
        } while (dung == 1);
        nhap.close(); 
    }

    public static void xuat() {
        for (Double ptSo : mangSt) {
            System.out.println("Dung for ds: " + ptSo);
        }
    }
}
