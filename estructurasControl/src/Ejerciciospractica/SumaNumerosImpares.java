package Ejerciciospractica;

import java.util.Scanner;

/*Escribe un programa en JAVA tal que dado como datos 270 números enteros (introducidos por teclado), obtenga la suma de los números impares y el promedio de los números pares.
Datos: NUM1, NUM2, . . ., NUM270
Donde: NUMi es una variable de tipo entero que representa el número entero i que se ingresa (1 ≤ i ≤ 270).*/

public class SumaNumerosImpares {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		 float num,i,impar = 0,par = 0,ppar = 0,residuo;
		 for(i = 1;i <= 270; ++i)
		        {
		            System.out.print("ingrese digito "+ i +": ");
		            num=teclado.nextInt();
		            residuo=num%2;
		            if(residuo == 0)
		            {
		                par=par+num;
		                ppar=ppar+1;
		            }
		            if(residuo!=0)
		                impar=impar+num;
		        }
		            par=par/ppar;
		            System.out.println("los numeros pares fueron: "+ppar);
		            System.out.println("el promedio de los numeros pares es: " +par);
		            System.out.println("la suma de los numeros impares son: "+impar);
		    } }

