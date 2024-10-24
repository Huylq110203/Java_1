/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.lab3;

/**
 *
 * @author Huy
 */
import java.util.Arrays;

public class demo_array {

    public static void main(String[] args) {
        int[] ArrayName;
        float[] ArrayFloat;
        String[] ArrayStr;

        //Khai báo mảng có số phần tử
        String[] ch = new String[5];
        int[] num = new int[4];

        //Khai báo có khởi tạo
        int[] ArrayName2 = {11, 29, 36, 42, 56};
        int[] ArrayName3 = new int[]{1, 2, 3, 4, 5, 10, 12};

        //4-Truy xuawt phan tu mang
//        int giatript1 = ArrayName2[0];
//        System.out.printf("giaipt1 %d \n", giatript1);
//
//        int giatript2 = ArrayName2[1];
//        System.out.printf("giaipt1 %d \n", giatript2);
//
//        int giatript3 = ArrayName2[2];
//        System.out.printf("giaipt1 %d \n", giatript3);
//
//        int giatript4 = ArrayName2[3];
//        System.out.printf("giaipt1 %d \n", giatript4);
//
//        int giatriptCuoi = ArrayName2[ArrayName2.length-1];
//        System.out.printf("giaipt1 %d \n", giatriptCuoi);
        //5- Duyệt mảng ArrayName2
        for (int index = 0; index < ArrayName2.length; index++) {
            System.out.printf("phan tu thu %d gia tri la %d \n", (index + 1), ArrayName2[index]);
        }

        // 6- Tinh tong cac phan tu cua mang
        int tong = 0;
        for (int index = 0; index < ArrayName2.length; index++) {
            tong += ArrayName2[index];
        }
        System.out.printf("Tong cac phan tu cua mang la: %d \n", tong);

        // 7- Chuyen mang ArrayName2 thanh chuoi
        String arrayAsString = Arrays.toString(ArrayName2);
        System.out.printf("Mang ArrayName2 duoi dang chuoi: %s \n", arrayAsString);

        // 8- Sap xep ArrayName2
        Arrays.sort(ArrayName2);  // Sap xep mang
        System.out.printf("Mang ArrayName2 sau khi sap xep: %s \n", Arrays.toString(ArrayName2));

        // 9 - Tim phan tu trong mang
        int target = 36;  // Phan tu can tim
        int indexFound = Arrays.binarySearch(ArrayName2, target);  // Tim kiem nhi phan
        if (indexFound >= 0) {
            System.out.printf("Phan tu %d duoc tim thay tai vi tri: %d \n", target, indexFound);
        } else {
            System.out.printf("Phan tu %d khong co trong mang.\n", target);
        }
    }
}
