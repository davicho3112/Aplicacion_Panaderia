package panaderia;

import java.util.ArrayList;

public class Articulo
{
     private int tortaVainilla;
     private int napoleon;
     private int tortaFresa;
     private int tresLeches;
     private int mantecada;
     
    public Articulo()
    {
        tortaVainilla = 20000;
        napoleon = 10000;
        mantecada = 15000;
        tresLeches = 25000;
        tortaFresa = 40000;
    }
    
    public int cantMantecada(int[] cantidadMantecada)
    {
        int suma = 0;
        
        for (int i = 0; i < cantidadMantecada.length; i++) {
            suma += mantecada;
        }
        
        return suma;
    }
    
    public int cantTortaVainilla(int []cantidadTortaVainilla)
    {
        int suma = 0;
        
        for (int i = 0; i < cantidadTortaVainilla.length; i++) {
            suma += tortaVainilla;
        }
        
        return suma;
    }
    
    public int cantNapoleon(int []cantidadNapoleon)
    {
        int suma = 0;
        
        for (int i = 0; i < cantidadNapoleon.length; i++) {
            suma += napoleon;
        }
        
        return suma;
    }
    
    public int cantTresLeches(int []cantidadTresLeches)
    {
        int suma = 0;
        
        for (int i = 0; i < cantidadTresLeches.length; i++) {
            suma += tresLeches;
        }
        
        return suma;
    }
    
    public int cantTortasFresas(int []cantidadTortasFresas)
    {
        int suma = 0;
        
        for (int i = 0; i < cantidadTortasFresas.length; i++) {
            suma += tortaFresa;
        }
        
        return suma;
    }
    
    
  
}
