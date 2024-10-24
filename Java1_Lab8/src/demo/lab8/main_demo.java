package demo.lab8;

public class main_demo {
    public static void main(String[] args) {
        demo_static OB = new demo_static();
        OB.X +=300;
        demo_static.X+=500;
        demo_static.method();
    }
}
