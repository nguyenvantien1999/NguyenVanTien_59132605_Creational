/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class HoaDon {
    ArrayList<CTHD> listCTHD = new ArrayList<>();
    HoaDonHeader hoaDonHeader;
    public HoaDon(HoaDonHeader hoaDonHeader){
        this.hoaDonHeader = hoaDonHeader;
    }
    public void them(CTHD cthd){
        listCTHD.add(cthd);
    }
    public String inHD(){
        String strHD = hoaDonHeader.toString()+
                "\n------Chi tiết hóa đơn------\n";
        for(int i = 0; i < listCTHD.size(); i++){
            strHD += listCTHD.get(i).toString();
        }
        return strHD;
    }
}
