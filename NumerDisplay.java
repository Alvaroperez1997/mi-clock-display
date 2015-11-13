
/**
 * Write a description of class NumerDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumerDisplay
{
    // 
    private int limite;
    
    private int display;

    /**
     * Constructor for objects of class NumerDisplay
     */
    public NumerDisplay(int limite)
    {
        //  recibe por parámetro el límite del display y que fija el valor actual del display a 0
        display = 0;
    }

    /**
     * Un método setter que fija el valor actual del display al valor pasado como parámetro
     */
    public int setValue(int value)
    {
        display = value;
        return display;
    }
}
