package modeles;

public class CPoint {
	private double x ;
	private double y ;
	private int compteur ;
	public CPoint(double x, double y) {
		this.x = x;
		this.y = y;
		compteur = 0;		//inutile car par défaut à 0
	}
	public CPoint() {
	}
	public void ajouter(CPoint point) {
		x = x + point.x;
		y = y + point.y;
		compteur++ ;
	}
	public boolean comparer(CPoint point) {
		if (x==point.x && y==point.y)
			return true ;
		else return false ;
	}
	public void deplacerPoint(double dx, double dy) {
		x += dx ;
		y += dy ;
		compteur++ ;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public int getCompteur() {
		return compteur;
	}
}
