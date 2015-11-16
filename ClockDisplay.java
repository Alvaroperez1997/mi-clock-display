
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // Atributo que almacena las horas
    private NumberDisplay horas;
    // Atributo que almacena los minutos
    private NumberDisplay minutos;
    // Atributo que almacena la hora actual con 5 caracteres
    private String horaActual;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        // initialise instance variables
        int horas = 00;
        int minutos = 00;
        horaActual = horas + ":" + minutos;
    }
    
     /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay(int horas, int minutos)
    {
        horaActual = horas + ":" + minutos;
    }
}
