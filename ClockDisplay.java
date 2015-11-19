/** 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // Guarda la hora
    private NumberDisplay horas;
    // Guarda los minutos
    private NumberDisplay minutos;
    // Almacena la hora actual con 5 caracteres
    private String horaActual;

    /**
     * Crea un objeto ClockDisplay con hora por defecto 00:00
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(12);
        minutos = new NumberDisplay(60);
        horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue();             
    }
    
    /** 
     * Crea un objeto ClockDisplay con la hora y los minutos dados
     */
    public ClockDisplay (int horasX, int minutosX)
    {
        horas = new NumberDisplay(12);
        minutos = new NumberDisplay(60);    
        horas.setValue(horasX); 
        minutos.setValue(minutosX);
        horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + "a.m.";        
    }
    
    /**
     * Fija la hora del reloj a la hora y los minutos dados
     */
    public void setTime(int horaY, int minutoY)
    {
        horas.setValue(horaY);  
        minutos.setValue(minutoY);
        horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " a.m.";
    }
    
    /**
     * Devuelve la hora del reloj como una cadena de 5 caracteres
     */
     public String getTime()
     {
        return horaActual;
     }
     
    /**
     * Hace avanzar la hora 1 minuto
     */
    public void timeTick()
    {
        minutos.increment();
        if ( minutos.getValue() == 0) {
            horas.increment();
        }
    }
}

