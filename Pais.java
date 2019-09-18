import java.util.*;

public class Pais
{
    private String nombre;
    private int hora;
    private int minuto;
    private String horaString;
    private String minutoString;
    private int diferenciaHoraria;
    
    public Pais(String nombres, int diferenciaHora)
    {
        nombre = nombres;
        diferenciaHoraria = diferenciaHora;
        hora=0;
        minuto=0;
    }
    
    public Pais()
    {
        nombre="Greenwich";
        diferenciaHoraria=0;
        hora=0;
        minuto=0;
        horaString = "00";
        minutoString = "00";
    }
       
    public String toString()
    {
        return nombre;
    }
    
    public void setNombre(String nom)
    {
        nombre = nom;
    }
        
    public int getHora()
    {
        return hora;
    }
        
    public int getMinutos()
    {
        return minuto;
    }
    
    public void setHora(int horas, int minutos)
    {
      hora = horas;
      minuto = minutos;
      if (hora < 10)
      {
          horaString = "0" + hora;
      }
      else
      {
          horaString = Integer.toString(hora);
      }
      if (minutos < 10)
      {
          minutoString = "0" + minutos;
      }
      else 
      {
          minutoString = Integer.toString(minutos);
      }
    }
    
    public int getDiferenciaHoraria()
    {
        return diferenciaHoraria;
    }
    
    public void setDiferenciaHoraria(int diferenciaHor)
    {
        diferenciaHoraria = diferenciaHor;
    }
    
}
