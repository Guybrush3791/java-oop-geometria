package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	/*
	 	Buon pomeriggio!
		Esercitazione di oggi: Geometria
		Nome repo: java-oop-geometria
		Consegna:
		Nel progetto java-oop-geometria creare un package 
		org.generation.italy.geometria in cui inserire le classi
		1. Creare una classe Rettangolo con due attributi interi: 
		base e altezza. Aggiungere un opportuno costruttore con 
		parametri. Aggiungere due metodi: calcolaArea e calcolaPerimetro 
		che calcolano e restituiscono, rispettivamente, 
		l’area e il perimetro del rettangolo.
		2. Creare una classe Main contenente il metodo main(), 
		nel quale chiedete all’utente di inserire, da console, 
		i valori di base e di altezza con cui istanziare un nuovo 
		Rettangolo. Dopo averlo istanziato, stampate a video il 
		perimetro e l’area.
		BONUS
		Aggiungere alla classe Rettangolo un metodo disegna 
		che disegna in console il rettangolo con le sue 
		dimensioni, come nell’immagine allegata
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("base: ");
		int base = sc.nextInt();
		
		System.out.print("altezza: ");
		int altezza = sc.nextInt();
		
		Rettangolo r = new Rettangolo(base, altezza);
		System.out.println(r);
		
		String draw = r.getDraw();
		System.out.println(draw);
	}
}












