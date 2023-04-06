package application;

import java.util.Scanner;

import modeles.Rectangle;

public class MainRectangle{
	public static Rectangle creerRectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Longueur:");
		float L = sc.nextFloat();
		System.out.println("Largeur:");
		float l = sc.nextFloat();
		System.out.println("Coordonnée X:");
		int x = sc.nextInt();
		System.out.println("Coordonnée Y:");
		int y = sc.nextInt();
		Rectangle r = new Rectangle(L, l, x, y);
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		r1.afficher();
		r1.translater(10, 5);
		r1.afficher();
		r1.setLargeur(100);
		r1.setLongueur(50);		//aire = 5000
		r1.afficher();
		r1.setLargeur(-10);
		r1.setLongueur(-20);
		r1.afficher();
		Rectangle r2 = new Rectangle(5, 3);		//aire = 15
		r2.afficher();
		Rectangle r3 = new Rectangle(100, 80, 10, 4);  //aire = 8000
		r3.afficher();
		r3.translater(5, 7);
		r3.afficher(); 	               //x = 15   y = 11
		System.out.println(r3.getX()+":"+r3.getY());
		System.out.println();
		Rectangle r4 = creerRectangle();
		r4.afficher();
		r4.agrandir(2);
		r4.afficher();
		
		System.out.println(r1.compareSurface(r1));		//0
		System.out.println(r1.compareSurface(r2));		//1
		System.out.println(r1.compareSurface(r3));		//-1
		System.out.println(r1.compareSurface(r4));
	}
}
