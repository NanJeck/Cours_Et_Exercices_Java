package chapitre4;

public class Point {
	private double x ;
	private double y ;
	
	public Point(double x, double y) {
		System.out.println("Constructeur avec argument");
		this.x = x ;
		this.y = y ;
		//x = x ;
		//y = y ;
	}
	public Point() {
		System.out.println("Constructeur sans paramètre");
	}
	public void place(double p) {
		x = p;
		y = p ;
	}
	public void place(double x, double y) {
		if (x>=0) 
			this.x = x ;
		if (y>=0) 
			this.y = y ;
	}
	public void deplace(double dx, double dy) {
		if (x+dx >=0)
			x += dx; 	//x = x + dx
		
		if (y+dy>=0) 
			y += dy ;
	}
	public void affiche() {
		System.out.println("x="+x+", y="+y);
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
}
