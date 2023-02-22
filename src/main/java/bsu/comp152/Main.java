package bsu.comp152;

import org.w3c.dom.css.Rect;

/**
 * A (container) class for the program.
 * It contains a main method with client code (a driver program) to create and manipulate and manipulate objects using methods from the (blueprint) Rectangle class.
 */
public class Main {
    public static void main(String[] args)
    {
        /*
         * Create a Rectangle object.
         * Call it rect.
         * Do an inline initialization of a Rectangle object.
         * We create an instance of the Rectangle class.
         * We instantiate the Rectangle class.
         *
         * There is a default constructor that takes 0 arguments.
         * However, it is no longer available after we write our own constructor in the Rectangle class.
         */
        // Rectangle rect = new Rectangle();
        Rectangle rect = new Rectangle(9.7, 8.1);
        /*
         * Printing an object directly gives the memory address for the object- unless we write our own toString method, in which case it calls that toString method automatically.
         * Our method overrides the default toSting method.
         */
        System.out.println(rect);
        System.out.println(rect.toString());
        /*
         * Manipulate the Rectangle object rect using methods from the Rectangle class.
         *
         * On rect, call the getLength method.
         * Print the returned value.
         */
        System.out.println(rect.getLength());
        /*
         * On rect, call the getWidth method.
         * Print the returned value.
         */
        System.out.println(rect.getWidth());
        /*
         * On rect, call the setLength method.
         */
        rect.setLength(12.2);
        System.out.println(rect.getLength());
        rect.setWidth(3.17);
        System.out.println(rect.getWidth());

        Rectangle rect2 = new Rectangle(12.2, 3.17);

        System.out.println(rect.equals(rect2));
    }
}