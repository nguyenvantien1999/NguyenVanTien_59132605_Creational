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
public class Triangle extends Shape{
    private static Triangle triangle;

    protected Triangle() {
    }
    
    public static Triangle createTriangle(){
        if (triangle == null) {
            triangle = new Triangle();
        }
        return triangle;
    }
    @Override
    public String draw() {
        return "Vẽ tam giác ABC";
    }
    
}
