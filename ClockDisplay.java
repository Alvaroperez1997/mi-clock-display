/**
 * Write a description of class ClockDisplay here.
 * 
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
    // Permite elegir si estamos en formato 12 horas(true) o 24 horas(false)
    private boolean relojDe12Horas;
    //Guarda los dias
    private int dia;
    //guarda los meses
    private int mes;
    //guarda los años
    private int anno;

    /**
     * Crea un objeto ClockDisplay con hora por defecto 00:00
     * Es posible elegir el modelo horario en el que el reloj
     * muestra la hora: si reloj12Horas es true entonces funciona 
     * como un reloj en formato de 12 horas; en caso contrario,
     * como un reloj de 24 horas.
     */
    public ClockDisplay(boolean reloj12Horas)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        dia = 20;
        mes = 11;
        anno = 15;
        relojDe12Horas = reloj12Horas;
        updateHoraActual();			
    }

    /** 
     * Crea un objeto ClockDisplay con la hora y los minutos dados
     * Es posible elegir el modelo horario en el que el reloj
     * muestra la hora: si reloj12Horas es true entonces funciona 
     * como un reloj en formato de 12 horas; en caso contrario,
     * como un reloj de 24 horas.
     */
    public ClockDisplay (int horasX, int minutosX, boolean reloj12Horas, int diaX, int mesX, int annoX)
    {
        horas =   new NumberDisplay(24);
        minutos = new NumberDisplay(60);	
        horas.setValue(horasX);	
        minutos.setValue(minutosX);
        relojDe12Horas = reloj12Horas;
        updateHoraActual();  
        dia = diaX;
        mes = mesX;
        anno = annoX;
    }

    /**
     * Fija la hora del reloj a la hora y los minutos dados
     */
    public void setTime(int horaY, int minutoY)
    {
        horas.setValue(horaY);	
        minutos.setValue(minutoY);
        updateHoraActual();
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
            if ( horas.getValue() == 0) {
                dia++;
                if ( dia == 1) {
                    mes++;
                    if ( mes == 1) {
                        anno++;
                    }
                }
            }
        }
        updateHoraActual();
    }

    /**
     * Actualiza el atributo horaActual siguiendo las normas de un
     * reloj de 12 horas.
     */
    public void updateHoraActual()
    {
    	if (relojDe12Horas) {
	 		String formato = "a.m";
		    int horaAhora = horas.getValue(); 
		    if (horaAhora >= 12){
		        formato = "p.m.";
		    }

		    if (horaAhora > 12) {
		        horaAhora = horaAhora - 12;
		    }
		    else if (horaAhora == 0) {
		        horaAhora = 12;
		    }
		    horaActual = horaAhora + ":" + minutos.getDisplayValue() + " " + formato + " A la fecha del " + dia + "/" + mes + "/" + anno;
		}
		else {
			horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " A la fecha del " + dia + "/" + mes + "/" + anno;  
		}
    }
    
    /**
     * Método que permite alternar entre los modos del reloj
     */
    public void changeFormat()
    {
    	relojDe12Horas = !relojDe12Horas;
    	updateHoraActual();	
    }	
}