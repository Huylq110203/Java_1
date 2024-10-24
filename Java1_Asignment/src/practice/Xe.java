package practice;


public class Xe {
    private String tenxe;
    private int tocdo;

    public Xe() {
        this.tenxe = "chua co ten";
        this.tocdo = 0;
    }

    public String getTenxe() {
        return tenxe;
    }

    public void setTenxe(String tenxe) {
        this.tenxe = tenxe;
    }

    public int getTocdo() {
        return tocdo;
    }

    public void setTocdo(int tocdo) {
        this.tocdo = tocdo;
    }

    public Xe(String tenxe, int tocdo) {
        this.tenxe = tenxe;
        this.tocdo = tocdo;
    }
    
    void xuatThongTin() {
        System.out.println("Ten xe: " + tenxe + ", Toc do: " + tocdo);
    }
    
}
    

