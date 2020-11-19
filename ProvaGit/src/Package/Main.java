//ESERCIZIO 2 - Classe Eroe con attibuti nome, forza, saggezza e destrezza. 
//Tre classi Mago, arciere e guerriero estendono Eroe.
//Il mago deve avere saggezza uguale o superiore a 15
//l'arciere deve avere destrezza uguale o sueriore a 15
//Il guerriero deve avere forza uguale o superiore a 15
//Generare casualmente tra 10 e 20 i valori delle tre abilità, assicurandosi 
//che solo una possa superare il 15 e che almeno una lo superi e poi istanziare la 
//classe relativa.
package Package;

public class Main {
	public static void main (String[]args) {
		
		
		
		int controllo = 0; 
		
		//String nome = "Massimo";
		int forza=0;
		int saggezza=0;
		int destrezza=0;
		
	while (controllo == 0) {
	
			forza = 10 + (int)(Math.random() *11);
			saggezza = 10 + (int)(Math.random() *11);
			destrezza = 10 + (int)(Math.random() *11);
		
		if (((forza<15) && (saggezza<15)) && (destrezza>15)) {
			
			Eroe spadino = new Arciere();
			Personaggio p1 = new Personaggio();
			p1.quindisono(spadino);
			
			controllo++;
			}
		
		if (((destrezza<15) && (saggezza<15)) && (forza>15)) {
			Eroe guerrino = new Guerriero();
			Personaggio p2 = new Personaggio();
			p2.quindisono(guerrino);
			
			controllo++;
			}
		
		if (((destrezza<15) && (forza<15)) && (saggezza>15)) {
			
			Eroe maghino = new Mago();
			Personaggio p3 = new Personaggio();
			p3.quindisono(maghino);
			controllo++;
				}
		System.out.println("ho modificato");
		System.out.println("ho modificato la seconda volta");
	}
}
}

