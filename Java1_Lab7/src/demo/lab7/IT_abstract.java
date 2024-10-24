package demo.lab7;

public class IT_abstract extends SV_abstract {
    public double diemJ =8;
    public double diemCSS=9;

    @Override
    public double getDiemTB() {
        System.out.println("Diem trung binh cua IT_abstract");
    return (2*diemJ +diemCSS)*3;
    }

}
