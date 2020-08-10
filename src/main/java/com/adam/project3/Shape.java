// @author Adam Benalayat
//This abstract class outlines what functionality should be provided by the other shape classes


package com.adam.project3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


abstract class Shape extends java.awt.Rectangle {
    protected Color color;
    protected boolean isSolid;
    private static int numberOfCreatedShapes = 0;

    public Shape(Color color, boolean isSolid, Rectangle r) {
        super(r);
        this.color = color;
        this.isSolid = isSolid;
        numberOfCreatedShapes++;
    }
    
    public void setColor(Graphics g){
        g.setColor(this.color);
    }
    
    public boolean getSolid(){
        return this.isSolid;
    }
    
    public static int getNumberOfShapes(){
        return numberOfCreatedShapes;
    }
    
    public abstract void draw(Graphics g);
    
}
