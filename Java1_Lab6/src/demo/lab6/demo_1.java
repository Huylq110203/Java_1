package demo.lab6;

public class demo_1 {

    public static void main(String[] args) {
        String str = "Dao Cong Su";
        String key = "abc";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        if (str.equals(key)) {
            System.out.println("OK");
        } else {
            System.out.println("No Ok");
        }
    }
}
