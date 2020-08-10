
package com.adam.project3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Adam Benalayat
 * This class implements the shape abstract class and defines functionality for the 
 * oval shape drawing
 */
public class Oval extends Shape {

    public Oval(Color color, boolean isSolid, Rectangle r) {
        super(color, isSolid, r);
    }
    
    @Override
    public void draw(Graphics g){
        g.setColor(color);
        if(this.isSolid){
            g.fillOval(this.x, this.y, this.width, this.height);
        } else {
            g.drawOval(this.x,this.y,this.width,this.height);
        }
    }
    
}
