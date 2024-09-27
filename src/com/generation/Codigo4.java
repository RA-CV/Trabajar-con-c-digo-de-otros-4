package com.generation;

import java.util.Scanner;//Añadido

public class Codigo4 {
	public static void main(String[] args) {//Añadido
	 Scanner s = new Scanner(System.in);//Añadido
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
//	    Scanner s2 = new Scanner();
	    String j2 = s.nextLine();
	  //Corregido
	    if (j1.equals (j2)){
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2 == "tijeras") {
	            g = 1;
	          }
	          break;

	        case "papel":
	          if (j2 == "piedra") {
	            g = 1;
	          }//corregido 
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	  s.close();//Añadido
	}
}
