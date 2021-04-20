package Familia;

public class Padre {
	protected String ojos;
	protected String dientes;
	protected String cabello;
	
	public Padre() 
	{
		ojos="cafe";
		dientes="grandes";
		cabello="rubio";
	}
	
	public void WhoTalks() {
		System.out.println("Esta comunicando la clase Padre");		
	}
	
	public void Caracteristicas() 
	{
		System.out.println("El color de los ojos es " + ojos);
		System.out.println("El tamaño de los dientes es " + dientes);
		System.out.println("El color del cabello es " + cabello);
	} 
}
