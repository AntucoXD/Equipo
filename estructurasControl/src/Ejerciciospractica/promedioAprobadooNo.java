package Ejerciciospractica;

import java.util.Scanner;

/*Realiza el programa en JAVA tal que dado como datos la matrícula y 5 
 *calificaciones de un alumno; imprima la matrícula, el promedio y la 
 *palabra “aprobado” si el alumno tiene un promedio mayor o igual que 6,
 *y la palabra “no aprobado” en caso contrario.*/

public class promedioAprobadooNo {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
	        
			int mat,pro=0,cal,i;
	        
			System.out.print("ingrese matricula: ");
	        
			mat=teclado.nextInt();
	        
			for(i=1;i<=5;++i)
	           {
	            System.out.print("ingrese calificacion "+i+": ");
	            cal=teclado.nextInt();
	            pro+=cal;
	           }
	        pro=pro/5;
	       
	        if(pro>=6)
	            System.out.println("\nmatricula= "+mat+"\npromedio= "+pro+"\nAPROBADO");
	        else
	            System.out.println("\nmatricula= "+mat+"\npromedio= "+pro+"\nREPROBADO");
	        }     

	}


