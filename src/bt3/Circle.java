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
public class Circle extends Shape{
    private static Circle circle;
    
    private Circle(){
    }
    
    public static Circle createCircle(){
        if (circle == null) {
            circle = new Circle();
        }
        return circle;
    }
    @Override
    public String draw() {
        return "Vẽ hình trong tâm O, bán kính R";
    }
        
}
