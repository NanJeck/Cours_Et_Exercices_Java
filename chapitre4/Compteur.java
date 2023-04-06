package modeles;

public class Compteur {
	private int valeur ;

	public Compteur(int valeur) {
		this.valeur = valeur;
	}
	public Compteur() {
	}
	public void incrementer() {
		valeur++;
	}
	public void incrementer(int pas) {
		valeur += pas ;
	}
	public void decrementer() {
		if (valeur >0)
			valeur-- ;
	}
	public void decrementer(int pas) {
		if (valeur - pas >= 0 )
			valeur -= pas ;
		else {
			valeur = 0 ;			//choix de mettre à 0 valeur
		}
	}
	public int  getValeur() {
		return valeur ;
	}
	public void mettreAzero() {
		valeur = 0 ;
	}
}
