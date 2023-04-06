package chapitre4;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(2,8) ;
		p1.affiche();
		p1.place(10, 20);
		p1.affiche();
		p1.deplace(-5, 15);
		p1.affiche();
		Point p2 = new Point(100,200) ;
		p2.affiche();
		p2.place(-10, 8);
		p2.affiche();
		//p1.x =130;
		//p1.y = 200;
		p1.deplace(15,-40);
		p1.affiche();
		double xP1 = p1.getX();
		double yP1 = p1.getY();
		System.out.println(xP1+":"+yP1);
		Point p3 = new Point();
		p3.affiche();
		p3.place(20);
		p3.affiche();
		}
}
