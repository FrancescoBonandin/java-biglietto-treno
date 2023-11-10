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
		
			final float PRICE_X_KM = 0.21F;
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Quanti km devi percorrere in treno?");
			
			String inputKm = in.nextLine();
			 int km = Integer.valueOf(inputKm);
			 
			 System.out.println("Quanti anni hai?");
			 String inputAge = in.nextLine() ;
			 in.close();
			 int age = Integer.valueOf(inputAge);
			 
			 float price = PRICE_X_KM * km ;
			 
			 if(age < 18) {
				 
				 price *=0.8;
 				//-----------------------------------------------------------------------------------CORREZIONE/+String.format("%.2f",price)		 																									
				System.out.println("sei under 18, hai diritto al 20% di sconto, quindi la tua spesa è di " + price +"€");
				
			 }
			 
			 else if(age > 65) {
				 
				 price *=0.6;
				//-----------------------------------------------------------------------------------CORREZIONE/+String.format("%.2f",price)
				System.out.println("sei over 65, hai diritto al 20% di sconto, quindi la tua spesa è di " + price +"€");
				
			 }
			 
			 else {
				//-----------------------------------------------------------------------------------CORREZIONE/+String.format("%.2f",price)
				 System.out.println("non hai diritto a nessuno sconto, quindi la tua spesa è di " + price +"€");
			 
			 }
			 
		

	}

}
