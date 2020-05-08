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
public class CTHD {
    String sanPham; 
    int soLuong;
    float donGia, chietKhau;
    protected CTHD(Builder builder){
        this.sanPham = builder.sanPham;
        this.soLuong = builder.soLuong;
        this.donGia = builder.donGia;
        this.chietKhau = builder.chietKhau;
    }

    @Override
    public String toString() {
        return "Sản phẩm: " + sanPham + "\t Số lượng: " + soLuong + "\t Đơn giá: " + donGia + "\t Chiết khấu: " + chietKhau + "\n";
    }
    
    public static class Builder{
        String sanPham;
        int soLuong;
        float donGia, chietKhau;
        public Builder() {
        }

        public Builder addSanPham(String sanPham){
            this.sanPham = sanPham;
            return this;
        }
        public Builder addSoLuong(int soLuong){
            this.soLuong = soLuong;
            return this;
        }
        public Builder addDonGia(float donGia){
            this.donGia = donGia;
            return this;
        }
        public Builder addChietKhau(float chietKhau){
            this.chietKhau = chietKhau;
            return this;
        }
        public CTHD builder(){
            return new CTHD(this);
        }
    }
}
