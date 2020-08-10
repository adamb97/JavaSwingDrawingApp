
package com.adam.project3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Adam Benalayat
 * This file defines the rectangular graphic that will be drawn
 */
public class Rectangular extends Shape{
//Constructor defining 
    public Rectangular(Color color, boolean isSolid, Rectangle r) {
        super(color, isSolid, r);
    }
    //Defining draw functionality
    @Override
    public void draw(Graphics g){
        g.setColor(this.color);
        if(this.isSolid){
            g.fillRect(this.x,this.y,this.width,this.height);
            
        } else {
            g.drawRect(this.x, this.y, this.width, this.height);
        }
    }
    
}
