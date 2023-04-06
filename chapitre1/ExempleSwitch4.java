package chapitre1;

import java.util.Scanner;

public class ExempleSwitch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel mois?");
		int month = sc.nextInt();
		int year = 2023;
		int numDays = 
		switch (month) {
		    case 1, 3 , 5 ,   // January March May
			     7,  8,  10,  // July August October
			     12 -> 31;
		    case 4,  6,   // April June
				 9, 11   // September November
				        -> 30 ;
		    case 2  -> { // February
		        if (((year % 4 == 0) && 
		             !(year % 100 == 0))
		             || (year % 400 == 0))
		            yield 29 ; 
		        else
		            yield 28;
		    	}
		
		    default -> {
		        	System.out.println("Invalid month.") ;
		        	yield 0 ;
		    }
		};
		System.out.println("Le nombre de jours du mois recherché est "+numDays);
	}

}
