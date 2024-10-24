/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.lab7;

/**
 *
 * @author Huy
 */
public class Biz_abstract extends SV_abstract {
public double keToan=7;
public double marketing=7;
public double banHang=8;
    
    @Override
    public double getDiemTB() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return (keToan + marketing + banHang)/3;
    }
    
}
