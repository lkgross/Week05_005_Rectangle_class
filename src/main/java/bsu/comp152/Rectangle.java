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

    /*
     * We can name the parameters len and wid, or we can give them the same names as the instance variables length and width. If the parameter has the same name as the instance variable, then use the reference variable this to identify the instance variable.
     */
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    /*
     * We can overload methods (including constructors):
     * We can have two or more methods with the same name, as long as "signatures" differ. The signature consists of the method's name and the types of the method's parameters, in the order that they appear. (The method's return type is not part of the signature.)
     */

    public Rectangle(){
        length = 0.0;
        width = 0.0;
    }

    /*
     * This is a copy constructor.
     */
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

    public boolean isSquare(){
        return length == width;
    }

    public double getArea(){
        return length*width;
    }

    public void rotate(){
        double temp = length;
        length = width;
        width = temp;
    }

    @Override
    public String toString(){
        return String.format("Rectangle: length %f, width %f", length, width);
    }



    public boolean equals(Rectangle other) {
        return (length == other.length) &&
                (width == other.width);
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

    public Rectangle copy(){
        Rectangle r = new Rectangle(length, width);
        return r;
    }
}
