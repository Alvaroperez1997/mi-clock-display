
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
     * Metodo que avanza 1 minuto la hora actual
     */
    public void timeTick()
    {
        int minutos = minutos + 1;
        int horas = horas + 0;
        if(horas == 24 && minutos == 60)  {
            horas = 00;
            minutos = 00;
        }
        else if(horas <= 23 && minutos == 60)  {
            horas ++;
            minutos = 00;
        }
        else if(horas == 24 && minutos <= 59)  {
            horas = 00;
            minutos ++;
        }
        else  {
            minutos ++;
        }
    }
}
