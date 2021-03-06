package excepciones;

public class Contacto implements Comparable
{
	private String nombre;
	private String telefono;
	private String email;
	private int edad;
	
	public Contacto(String nombre, String telefono, String email)
	{
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.edad = edad;
	}
	//////////////////////////////////////////
	public String getNombre()
	{
		return nombre;
	}
	/////////////////////////////////////////
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	////////////////////////////////////////
	public String getTelefono()
	{
		return telefono;
	}
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}
	//////////////////////////////////
	public String getEmail()
	{
		return email;
	}
	///////////////////////////////////
	public void setEmail(String email)
	{
		this.email = email;
	}
	///////////////////////////////////
	public int getEdad()
	{
		return edad;
	}
	//////////////////////////////////
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	////////////////////////////
	@Override
	public String toString()
	{
		return nombre + "," + telefono + "," + email;
	}
	
	///////////////////////////////////////
	public boolean equals(Contacto contacto)
	{
		return nombre.equals(contacto.getNombre()) 
				&& telefono.equals(contacto.getTelefono()) && email.equals(contacto.getEmail())
						&& edad == contacto.getEdad();	  
	}
	//////////////////////////////////////////////
	@Override
	public int compareTo(Object arg0) 
	{
		Contacto contacto = (Contacto) arg0;
		return nombre.compareTo(contacto.getNombre());
	}
	//////////////////////////////////////////////////
	public int compareTo(Contacto contacto)
	{
		return nombre.compareTo(contacto.getNombre());
	}
	//////////////////////
	/*public int compareTo(Contacto contacto)
	{
		return edad - contacto.getEdad();		
	}*/
	
	
}
