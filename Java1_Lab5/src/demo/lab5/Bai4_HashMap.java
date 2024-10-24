package demo.lab5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bai4_HashMap {
    public static void main(String[] args) {
        Map<String, Double> dT = new HashMap<String, Double>();
        
        dT.put("Samsung 1", 12.5);
        dT.put("Samsung 2", 14.5);
        dT.put("Samsung 3", 15.5);
        dT.put("Samsung 4", 16.5);
        dT.put("Samsung 5", 19.5);
        
        // Lấy tập hợp tất cả các khóa (tên sản phẩm)
        Set<String> keys = dT.keySet();
        
        // Duyệt qua từng khóa và lấy giá trị tương ứng
        for (String key : keys) {
            Double value = dT.get(key);  // Lấy giá trị theo khóa
            System.out.println("Ten san pham: " + key + ", Gia: " + value);
        }
    }
}
