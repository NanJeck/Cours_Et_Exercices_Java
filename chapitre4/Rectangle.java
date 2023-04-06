package modeles ;

public class Rectangle {
	private float longueur;
	private float largeur;
	private int x;
	private int y;
	private float angle;
	
	public Rectangle(float longueur, float largeur) {
		System.out.println("Constructeur avec 2 paramètres");
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	public Rectangle() {
		System.out.println("Constructeur sans paramètre");
	}

	public Rectangle(float longueur, float largeur, int x, int y) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.x = x;
		this.y = y;
		System.out.println("Je suis le 2ème constructeur avec 4 paramètres");
	}
	public int compareSurface(Rectangle rectangle) {
		float monAire = longueur * largeur ;
		float autreAire = rectangle.largeur * rectangle.longueur ;
		if (monAire>autreAire)
			return 1 ;
		else {
			if (monAire==autreAire)
				return 0 ;
			else return -1 ;
		}
	}
	public void translater(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

	public void tourner(float a) {
		/* A coder */ }

	public void agrandir(float a) {
			if (a>1) {
				longueur = longueur*a ;
				largeur = largeur *a ;
				}
	}

	public void reduire(float a) {
		/* A coder */ }

	public void afficher() {
		System.out.println("Ma longueur= " + longueur + " et ma largeur= " + largeur);
		System.out.println("Je suis en X = " + x + " et en Y = " + y);
	}

	public void setLongueur(float longueur) {
		if (longueur>=0)
			this.longueur = longueur;
	}

	public void setLargeur(float largeur) {
		if (largeur>=0)
			this.largeur = largeur;
	}

	public float getLongueur() {
		return longueur;
	}

	public float getLargeur() {
		return largeur;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public float getAngle() {
		return angle;
	}
}
