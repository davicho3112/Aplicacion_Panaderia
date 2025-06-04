package panaderia;

import java.util.ArrayList;

public class Categoria 
{
    Articulo ar;
    
    public Categoria()
    {
        ar = new Articulo();
    }
    
    public int tortas(int cantMantecada,int cantTortaVainilla, int cantTortasFresas)
    {
       ArrayList<Integer> sumaTortas = new ArrayList<>();
       int suma = 0;
       
       sumaTortas.add(cantMantecada);
       sumaTortas.add(cantTortaVainilla);
       sumaTortas.add(cantTortasFresas);
       
       for(int i: sumaTortas)
       {
            suma += i;
       }
       
       return suma;
    }
    
    public int Postres(int cantNapoleon, int cantTresLeches)
    {
       ArrayList<Integer> sumaPostres = new ArrayList<>();
       int suma = 0;
       
       sumaPostres.add(cantNapoleon);
       sumaPostres.add(cantTresLeches);
       
       for(int i: sumaPostres)
       {
           suma += i;
       } 
        
       return suma;
    }
    

   
}
