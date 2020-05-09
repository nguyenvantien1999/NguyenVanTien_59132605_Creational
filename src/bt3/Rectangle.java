/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author admin
 */
public class Rectangle extends Shape{
    private static Rectangle rectangle;

    protected Rectangle() {
    }
    
    public static Rectangle createRectangle(){
        if (rectangle == null) {
            rectangle = new Rectangle();
        }
        return rectangle;
    }
    
    @Override
    public String draw() {
        return "Vẽ hình chữ nhật chiều rộng a, chiều dài b";
    }
    
}
