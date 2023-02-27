package bsu.comp152;

import org.w3c.dom.css.Rect;

import java.util.Objects;

/**
 * A (blueprint) class for Rectangle objects
 */
public class Rectangle {

    /*
     * The (private) instance fields are length and width.
     * Declare these at the top of the class.
     */
    private double length;
    private double width;

    /*
     * The (public) instance methods are, e.g., getLength, getWidth, setLength.
     * Accessors (getters) return information about the rectangle.
     * Mutators (setters) set (modify) information associated with the rectangle.
     */

    /*
     * A constructor has the name as the class.
     * A constructor is public.
     * A constructor has no return type, not even void!
     */
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(){
        length = 0.0;
        width = 0.0;
    }

    public Rectangle(Rectangle other){
        length = other.length;
        width = other.width;
    }

    /**
     * A getter (accessor) in the Rectangle class
     * @return the length of the rectangle
     */
    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    @Override
    public String toString(){
        return String.format("Rectangle: length %f, width %f", length, width);
    }

    public boolean equals(Rectangle other) {
        return (length == other.length) &&
                (width == other.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    /**
     * A setter (mutator) in the Rectangle class
     * @param len length to set for the rectangle
     */
    public void setLength(double len){
        length = len;
    }

    public void setWidth(double wid){
        width = wid;
    }
}
