package com.generation;
import java.util.Scanner;

public class Codigo6 {

	public static void main(String[] args) { //Agregando main 
			  
		    int[] n = new int[20];//Añadiendo new para la declaración
		    Scanner scan = new Scanner(System.in);

		    for (int i = 0; i < 20; i++) {
		      n[i] = (int)(Math.random() * 381) + 20;
		      System.out.print(n[i] + " "); //Agregando out 
		    }
		    
		    System.out.println("\n¿Qué números quiere resaltar? ");
		    System.out.println("1 – los múltiplos de 5 \n2 – los múltiplos de 7 ");
		    int opcion = scan.nextInt(); //Sustituyendo Integer.parseInt(System.console().readLine()); por scan

		    int multiplo = (opcion == 1) ? 5 : 7; //Modificando el operador ternario

		    for(int e : n) {
		      if (e % multiplo == 0) {
		        System.out.println("[" + e + "] ");
		      }else {
		        System.out.println(e + " ");
		      }
		  
		    }
		    scan.close();
	}
}