
package com.adam.project3;

/**
 *
 * @author Adam Benalayat
 * This file outlines a checked exception for attempting to draw an object that is too large
 */
public class OutsideBounds extends Exception{
    public OutsideBounds(String message){
        super(message);
    }
}
