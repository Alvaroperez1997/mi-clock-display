
/**
 * Write a description of class NumerDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    //
    private int display;
    
    private int minimo;
    
    private int maximo;

    /**
     * Constructor for objects of class NumerDisplay
     */
    public NumberDisplay(int limiteMinimo, int limiteMaximo)
    {
        //  recibe por parámetro el límite del display y que fija el valor actual del display a 0
        display = 0;
        minimo = limiteMinimo;
        maximo = limiteMaximo;
    }

    /**
     * Un método setter que fija el valor actual del display al valor pasado como parámetro
     */
    public void setValue(int valueDisplay)
    {
        display = valueDisplay;
    }
    
    /**
     * Un método que devuelve el valor actual del display en forma de cadena de 2 caracteres
     */
    public String getDisplayValue()
    {
        String displayDevuelve = "";
        displayDevuelve = "0" + display;
        return displayDevuelve;
    }
    
    /**
     * Un método que devuelve el valor actual del display como entero
     */
    public int getValue()
    {
        return display;
    }
}
