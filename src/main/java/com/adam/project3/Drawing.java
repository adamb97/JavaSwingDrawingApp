
package com.adam.project3;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Adam Benalayat
 * 
 */
public class Drawing extends JPanel {
    private Shape currentShape = null;
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(this.currentShape != null){
        this.currentShape.draw(g);
        g.setColor(java.awt.Color.BLACK);
        //displaying number of shapes that have been drawn
        g.drawString(String.valueOf(Shape.getNumberOfShapes()), 5, 35);
        
    }
    }
    
    @Override
    public Dimension getPreferredSize(){
        if(this.currentShape != null){
            return new Dimension(200,200);
        } else {
            return (super.getPreferredSize());
        }
    }
    
    public void drawShape(Shape shape) throws OutsideBounds {
        Dimension bounds = getPreferredSize();
        //validation of input shape size
        boolean isInBounds = ((shape.x + shape.getWidth()) < (bounds.getWidth())) && ((shape.y + shape.getHeight()) < (bounds.getHeight()));
        if(!isInBounds){
            throw new OutsideBounds("The Shape you entered will not fit in the panel");
        } else {
            this.currentShape = shape;
            super.repaint();
        }
             
    }
    
    
    
    
}
