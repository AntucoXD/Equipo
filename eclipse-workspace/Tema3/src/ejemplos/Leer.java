package ejemplos;

import java.io.*;
public class Leer
{
  /*
   * Este método devuelve la cadena introducida por teclado.
   */
  public static String dato()
  {
    String sdato = "";
    try
    {
      // Definir un flujo de caracteres de entrada: flujoE
      // La clase InputStreamReader es una clase puente que convierte un flujo de byts a un flujo de caracteres.
  
      // La clase BufferedReader permite una entrada de flujo de caracteres.
      BufferedReader flujoE = new BufferedReader(new InputStreamReader(System.in));
      // Leer. La entrada finaliza al pulsar la tecla Entrar
      sdato = flujoE.readLine();
      
    }
    catch(IOException e)
    {
      System.err.println("Error: " + e.getMessage());
    }
    return sdato; // devolver el dato tecleado
  }
  
  public static short datoShort()
  {
    try
    {
      return Short.parseShort(dato());
    }
    catch(NumberFormatException e)
    {
    	System.out.print("Ese dato no es válido. Teclee otro:  ");
        return datoShort();
    }
  }
  
    public static int datoInt()
    {
      try{
         return Integer.parseInt( dato());
       }
        catch(NumberFormatException  e)
	    {
	    System.out.print("Ese dato no es válido. Teclee otro:  ");
	     return datoInt();
	   }
  }
  
  public static long datoLong()
  {
    try
    {
      return Long.parseLong(dato());
    }
    catch(NumberFormatException e)
    {
    	System.out.print("Ese dato no es válido. Teclee otro:  ");
        return datoLong();
    }
  }
  
  public static float datoFloat()
  {
    try
    {
      
      return Float.parseFloat(dato());
    }
    catch(NumberFormatException e)
    {
    	System.out.print("Ese dato no es válido. Teclee otro:  ");
        return datoFloat();
    }
  }
  
  public static double datoDouble()
    {
      try{
     
         return Double.parseDouble(dato());
       }
        catch(NumberFormatException  e)
    {
    System.out.print("Ese dato no es válido. Teclee otro:  ");
     return datoDouble();
   }
  }
}
