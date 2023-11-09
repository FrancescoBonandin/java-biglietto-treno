package org.lessons.java;

import java.util.Scanner;

// Todo
//Il programma dovrà chiedere all’utente il numero di chilometri che vuole percorrere e 
//l’età del passeggero. Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
//- il prezzo del biglietto è definito in base ai km: 0.21€/km
//- va applicato uno sconto del 20% per i minorenni
//- va applicato uno sconto del 40% per gli over 65

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quanti km devi percorrere in treno?");
		
		String inputKm = in.nextLine();
		 int km = Integer.valueOf(inputKm);
		 
		 System.out.println("Quanti anni hai?");
		 String inputAge = in.nextLine() ;
		 int age = Integer.valueOf(inputAge);
		 
		 
		

	}

}
