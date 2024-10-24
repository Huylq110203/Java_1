package lab5;

import java.util.HashMap;
import java.util.Map;

public class Lab5Bai4 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {

        Map<String, String> sinhVienMap = new HashMap<>();
        sinhVienMap.put("PC08044", "Ly Chi Thanh");
        sinhVienMap.put("PC08122", "Nguyen Thanh Dat");
        sinhVienMap.put("PC08503", "Nguyen Nhat Tien");
        sinhVienMap.put("PC09014", "Nguyen Van Vi");

        String maSo = "PC08503";
        if (sinhVienMap.containsKey(maSo)) {
            System.out.println("Sinh vien co ma so " + maSo + " la: " + sinhVienMap.get(maSo));
        } else {
            System.out.println("Khong tim thay sinh vien co ma so " + maSo);
        }

        String tenSV = "Nguyen Thanh Dat";
        boolean found = false;
        for (Map.Entry<String, String> entry : sinhVienMap.entrySet()) {
            if (entry.getValue().equals(tenSV)) {
                System.out.println("Ma so cua sinh vien " + tenSV + " la: " + entry.getKey());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien co ten " + tenSV);
        }

        String tenCanTim = "Nguyen Van Binh";
        if (sinhVienMap.containsValue(tenCanTim)) {
            System.out.println(tenCanTim + " co trong danh sach.");
        } else {
            System.out.println(tenCanTim + " khong co trong danh sach.");
        }
    }
}
