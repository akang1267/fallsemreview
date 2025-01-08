import java.util.*;
/**
 * Class for handling the number
 * @author Adelle.Kang
 * @version 1.0.0
 */

public class Number {
    
    private double number;

    /**
     * Constructor
     * @param number
     */

    public Number (double number){
        this.number = number;
    }

    /**
     * Sets the current number.
     * @param number to set
     */
    public void setNum(double number){
        this.number = number;
    }

    /**
     * Gets the number.
     * @return current number
     */
    public double getNum(){
        return number;
    }

     /**
     * Subtracts from the number.
     */
    public void subTract(double number){
        this.number -= number;
    }

    /**
     * Adds tp the number.
     */
    public void add(double number){
        this.number += number;
    }

    /**
     * ToString method
     * @return string
     */
    public String toString(){
        return "Your current number is " + number + ". Continuing...";
    }

}
