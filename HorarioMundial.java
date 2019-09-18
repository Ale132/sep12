import java.util.*;

public class HorarioMundial
{
    private ArrayList <Pais> horarioPaises;
    private String nombre;
    private int diferenciaHoraria;
    private Iterator <Pais> iterador;

    public HorarioMundial()
    {
        horarioPaises = new ArrayList<>();
        horarioPaises.add(new Pais("Inglaterra", 1));
        horarioPaises.add(new Pais("México", -6));
        horarioPaises.add(new Pais("Alemania", 2));
        horarioPaises.add(new Pais("Italia", 2));
        horarioPaises.add(new Pais("Rusia", 3));
    }

    public void agregarPais()
    {
        horarioPaises.add(new Pais("Greenwich", 0));
    }

    public void agregarPais(Pais pais)
    {
        horarioPaises.add(pais);
    }

    public void agregarPais(String nombre,int diferenciaHoraria)
    {
        horarioPaises.add(new Pais(nombre,diferenciaHoraria));
    }

    public void calcularHorariomundial()
    {
        for (Pais pais: horarioPaises)
        {
            if (pais.getDiferenciaHoraria() < 0)
            {
                pais.setHora(pais.getHora() + pais.getDiferenciaHoraria() + 24,0);
            }
            else 
            {
                pais.setHora(pais.getHora() + pais.getDiferenciaHoraria(),0);
            }
        }
    }

    public void mostrarDiferenciahoraria()
    {
        Iterator <Pais> iterador = horarioPaises.iterator();
        System.out.println("Diferencias de horas de los países comparadas con Greenwich");
        Pais greenwich = new Pais();
        while(iterador.hasNext())
        {
            Pais pais = iterador.next();
            if(greenwich.getHora() < pais.getDiferenciaHoraria())
            {
                System.out.println(pais + " +" + pais.getDiferenciaHoraria() +
                " Horas");
            }
            else if (greenwich.getHora() > pais.getDiferenciaHoraria())
            {
                System.out.println(pais + " " + pais.getDiferenciaHoraria() +
                " Horas");
            }
            else
            {
                System.out.println(pais + " " + pais.getDiferenciaHoraria() +
                " Horas");
            }
        }
    }

    public void mostrarHorapaises()
    {
        System.out.println("Horas de los países");
        for(Pais pais :horarioPaises)
        {
            if (pais.getHora() == 0 || pais.getMinutos() == 0)
            {
                if (pais.getHora() > 10)
                {
                  System.out.println(pais + " " + pais.getHora() + ":" 
                  + "0" + pais.getMinutos());
                }
                else
                {
                  System.out.println(pais + " 0" + pais.getHora() + ":"
                  + "0" + pais.getMinutos());
                }
            }
            else
            {
                System.out.println(pais + " " + pais.getHora() + ":" 
                + pais.getMinutos());
            }
        }
    }
}
