/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author admin
 */
public class HoaDonHeader {
    String maHD, ngayBan, tenKH;
    protected HoaDonHeader(Builder builder){
        this.maHD = builder.maHD;
        this.ngayBan = builder.ngayBan;
        this.tenKH = builder.tenKH;
    }

    @Override
    public String toString() {
        return "Mã hóa đơn: " + maHD + "\t\t Ngày Bán: " + ngayBan + "\nTên Khách hàng: " + tenKH + "\n";
    }
    
    public static class Builder{
        String maHD, ngayBan, tenKH;
        public Builder() {
            
        }
        public Builder addMaHD(String maHD){
            this.maHD = maHD;
            return this;
        }
        public Builder addNgayBan(String ngayBan){
            this.ngayBan = ngayBan;
            return this;
        }
        public Builder addTenKH(String tenKH){
            this.tenKH = tenKH;
            return this;
        }
        public HoaDonHeader builder(){
            return new HoaDonHeader(this);
        }
    }
}
