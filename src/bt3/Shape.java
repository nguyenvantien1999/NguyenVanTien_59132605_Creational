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
public abstract class Shape {
   
    public abstract String draw();
    
    private String brush(){
        return "Brush: size: 40px; softness: 19%; step: 20%\n";
    }
    private String paper(){
        return "Paper: A4\n";
    }
    private String frame(){
        return "Frame: black\n";
    }

    @Override
    public String toString() {
        return brush()+
                paper()+
                frame()+
                draw();
    }
    
}
