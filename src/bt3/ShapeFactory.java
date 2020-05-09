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
public class ShapeFactory {
    public Shape createShape(ShapeType shapeType){
        switch(shapeType){
            case Rectangle: return Rectangle.createRectangle();
            case Circle: return Circle.createCircle();
            case Triangle: return Triangle.createTriangle();
        }
        return null;
    }
}
