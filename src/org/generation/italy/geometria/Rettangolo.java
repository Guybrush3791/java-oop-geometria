package org.generation.italy.geometria;

public class Rettangolo {
	
	int base;
	int altezza;
	
	public Rettangolo(int base, int altezza) {
		
		this.base = base;
		this.altezza = altezza;
	}
	
	public int calcolaArea() {
		
		return base * altezza;
	}
	public int calcolaPerimetro() {
		
		return 2 * (base + altezza);
//		return 2 * base + 2 * altezza;
	}
	public String getDraw() {
		
		String res = "";
		
		for (int x=0;x<altezza;x++) {
			
			for (int y=0;y<base;y++) {
		
				if (x == 0 || x == altezza - 1) {
					res += "O";
				} else {
					
					if (y == 0 || y == base -1) {
						
						res += "O";
					} else {
						
						res += " ";
					}
				}
//				if (!(x == 0 || x == altezza - 1) && !(y == 0 || y == base -1))
//					System.out.print(" ");
//				else 
//					System.out.print("O");
			}
			
			res += "\n";
		}
		
		return res;
	}
	
	@Override
	public String toString() {

		return "Rettangolo: " + base + "x" + altezza
			+ "\narea: " + calcolaArea()
			+ "\nperimetro: " + calcolaPerimetro();
	}
}