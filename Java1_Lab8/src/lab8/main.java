package lab8;

public class main {

    public static void main(String[] args) {
        double sumResult = XPoly.sum(1.5, 2.5, 3.0, 4.0);
        System.out.println("Tong cac so: " + sumResult);

        double minResult = XPoly.min(1.5, 2.5, 3.0, 4.0);
        System.out.println("Gia tri nho nhat: " + minResult);

        double maxResult = XPoly.max(1.5, 2.5, 3.0, 4.0);
        System.out.println("Gia tri lon nhat: " + maxResult);

        String inputString = "nguyen van teo";
        String convertedString = XPoly.toUpperFirstChar(inputString);
        System.out.println("Chuoi da chuyen doi: " + convertedString);
    }
}
