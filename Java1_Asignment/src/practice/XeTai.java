package practice;

public class XeTai extends XeHoi {
    private int taitrong;

public XeTai() 
    {
        super();
        this.taitrong = 0;
    }
   
     public XeTai(String tenxe, int tocdo, double dungtichbinhxang, int taitrong) {
        super(tenxe, tocdo, dungtichbinhxang); // Gọi hàm tạo của XeHoi với 3 đối số
        this.taitrong = taitrong;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); 
        System.out.println("Tai trong" + taitrong);
    }
}
