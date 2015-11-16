
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
        horaActual = "0"+horas + ":" + "0"+minutos;
    }
    
     /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay(int horas, int minutos)
    {
        if(horas < 10 && minutos < 10)  {
            horaActual = "0"+horas + ":" + "0"+minutos;
        }
        else if( horas >= 10 && minutos < 10) {
            horaActual = horas + ":" + "0"+minutos;
        }
        else if(horas < 10 && minutos >=10)  {
            horaActual = "0"+horas + ":" + minutos;
        }
        else  {
            horaActual = horas + ":" + minutos;
        }
    }
    
    /**
     * Metodo que fija la hora que quieras
     */
    public void setTime (int valorHoras,int valorMinutos)
    {
        int horas = valorHoras;
        int minutos = valorMinutos;
        if(horas < 10 && minutos < 10)  {
            horaActual = "0"+horas + ":" + "0"+minutos;
        }
        else if( horas >= 10 && minutos < 10) {
            horaActual = horas + ":" + "0"+minutos;
        }
        else if(horas < 10 && minutos >=10)  {
            horaActual = "0"+horas + ":" + minutos;
        }
        else  {
            horaActual = horas + ":" + minutos;
        }
    }
    
    /**
     * Metodo que te devuelve la hora
     */
    public String getTime()
    {
        return horaActual;
    }
    
    /**
     * 
     */
}
