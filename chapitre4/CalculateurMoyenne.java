package modeles;

public class CalculateurMoyenne {
	private double notes[] = null;
	private double moyenne;
	private int nbNotes;
//////////////Pas utile ici	
	public CalculateurMoyenne(int nbNotes) {
		this.nbNotes = nbNotes;
		notes = new double[nbNotes];
	}
/////pas de vérification
	public double getMoyennePourTableauEntier(double[] notes) {
		this.notes = notes;
		return getMoyenne();
	}
////////////////Fin pas utile	
	
	public CalculateurMoyenne() {
		// TODO Auto-generated constructor stub
	}

	public boolean lireNombreNote(int nbNotes) {
		if (nbNotes >= 1 && nbNotes <= 100) {
			this.nbNotes = nbNotes;
			notes = new double[nbNotes];
			return true;
		} else
			return false;
	}

	public boolean validerNote(double note) {
		if (note >= 0 && note <= 20)
			return true;
		else
			return false;
	}

	/**
	 * 
	 * @param note du tableau
	 * @param rang de la note dans le tableau
	 * @return true si la note est correcte, false si la note n'est pas dans
	 *         l'intervalle ou le tableau pas créé
	 */
	public boolean lireNote(double note, int rang) {
		if (notes != null) {
			if (validerNote(note)) {
				notes[rang] = note;
				return true;
			} else
				return false;
		}
		return false;
	}

	public double[] getNotes() {
		return notes;
	}

	public int getNbNotes() {
		return nbNotes;
	}

	private double calculerMoyenne() {
		if (notes == null)
			return -1;
		double s = 0;
		for (int i = 0; i < notes.length; i++)
			s += notes[i];
		return s / notes.length;
	}

	public double getMoyenne() {
		moyenne = calculerMoyenne();
		return moyenne;
	}
}
