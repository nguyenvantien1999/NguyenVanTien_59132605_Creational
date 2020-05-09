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
public class main {
    public static void main(String[] args) {
        
        Shape shape =  new ShapeFactory().createShape(ShapeType.Circle);
        System.out.println(shape.toString());
        
        Shape shape1 = new ShapeFactory().createShape(ShapeType.Circle);
        System.out.println(shape1.toString());
        
        if(shape.equals(shape1))
            System.out.println("2 object bằng nhau");
        else
            System.out.println("2 object khác nhau");
    }
}
