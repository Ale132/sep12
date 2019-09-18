public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;
    private int conver;

    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    public ClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    public void timeTick()
    {
        if(minutes.getValue() == 0) {  
            hours.increment();
        }
        updateDisplay();
    }

    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    public String getTime()
    {
        return displayString;
    }

    public void printClock()
    {   
        System.out.println ( "Formato de 24 horas:" + hours.getValue () + ":" 
        + minutes.getValue () + "Formato 12hrs:" + getTime ());
    }

    public void testClock ()
    {
        System.out.println ( "*** Pruebas de Lógica para reloj de 24 horas ***");
        setTime (0, 0); printClock ();
        setTime (11, 59); printClock ();
        setTime (12, 1); printClock ();
        setTime (12, 59); printClock ();
        setTime (13, 0); printClock ();
        setTime (23, 59); printClock ();
    }

    private void updateDisplay()
    {
        if(hours.getValue() < 0 || hours.getValue() > 24)
        {
            System.out.println("Ingrese una hora válida, porfavor");
        }
        if (hours.getValue() == 0)
        {
            displayString = 12 + ":" + 
            minutes.getDisplayValue() + "am";
        }
        if (hours.getValue() >= 0 && hours.getValue() < 12)
        {
            displayString = hours.getDisplayValue() + ":" + 
            minutes.getDisplayValue() + "am";
        }
        if (hours.getValue() >= 12 && hours.getValue() <= 24)
        {
            conver = hours.getValue() - 12;
            displayString = conver  + ":" + 
            minutes.getDisplayValue() + "pm";
        }
    }
}
