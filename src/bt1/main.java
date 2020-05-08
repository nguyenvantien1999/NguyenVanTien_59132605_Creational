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
public class main {
    public static void main(String[] args) {
        HoaDonHeader hdh = new HoaDonHeader.Builder()
                .addMaHD("001")
                .addNgayBan("1/1/20200")
                .addTenKH("Nguyễn Văn Tiến")
                .builder();
        HoaDon hd = new HoaDon(hdh);
        CTHD cthd = new CTHD.Builder()
                .addSanPham("Laptop")
                .addSoLuong(1)
                .addDonGia(10000)
                .addChietKhau((float)0.1)
                .builder();
        CTHD cthd1 = new CTHD.Builder()
                .addSanPham("Điện thoại")
                .addSoLuong(1)
                .addDonGia(2000)
                .addChietKhau((float)0.2)
                .builder();
        CTHD cthd2 = new CTHD.Builder()
                .addSanPham("Tivi Samsung")
                .addSoLuong(1)
                .addDonGia(5000)
                .addChietKhau((float)0.15)
                .builder();
        hd.them(cthd);
        hd.them(cthd1);
        hd.them(cthd2);
        System.out.println(hd.inHD());
    }
}
