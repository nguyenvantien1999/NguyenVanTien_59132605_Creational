/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author admin
 */
public class main {
    public static void main(String[] args) {
        MyStringBuilder msb = new MyStringBuilder.Builder()
                .addString("Nguyễn Văn Tiến ")
                .addFloat(1999)
                .addString(" Đẹp trai: ")
                .addBool(true)
                .builder();
        System.out.println(msb.toString());
    }
}
