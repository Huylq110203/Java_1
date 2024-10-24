package practice;
public class XeHoi extends Xe {
    private double dungtichbinhxang;

    public XeHoi() {
      super(); // Gọi hàm tạo của lớp Xe
        this.dungtichbinhxang = 0.0;
    }

   
    public XeHoi(String tenxe,int tocdo, double dungtichbinhxang) {
        super(tenxe, tocdo);
        this.dungtichbinhxang = dungtichbinhxang;
    }

    

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); 
         System.out.println("Dung tich binh xang: " + dungtichbinhxang);
    }
    
    
    
}


