package chapitre1;

import java.util.Scanner;

public class ExempleSwitch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel mois?");
		String month = sc.nextLine(); // any month
		int monthNumber = -1;

		switch (month.toLowerCase()) {
		    case "january":
		        monthNumber = 1;
		        break;
		    case "february":
		        monthNumber = 2;
		        break;
		    case "march":
		        monthNumber = 3;
		        break;
		    case "april":
		        monthNumber = 4;
		        break;
		    case "may":
		        monthNumber = 5;
		        break;
		    case "june":
		        monthNumber = 6;
		        break;
		    case "july":
		        monthNumber = 7;
		        break;
		    case "august":
		        monthNumber = 8;
		        break;
		    case "september":
		        monthNumber = 9;
		        break;
		    case "october":
		        monthNumber = 10;
		        break;
		    case "november":
		        monthNumber = 11;
		        break;
		    case "december":
		        monthNumber = 12;
		        break;
		    default: 
		        monthNumber = 0;
		        break;
		}
		System.out.println("Numéro du mois = "+monthNumber);


	}

}
