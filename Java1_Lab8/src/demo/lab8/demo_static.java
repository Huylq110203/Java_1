package demo.lab8;

public class demo_static {
    
    static public int X = 100;
    static {
        X+=100;
    }
    static public void method() {
        X+=200;
    }
}
