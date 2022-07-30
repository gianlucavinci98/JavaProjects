package example;


import java.util.Scanner;

//import myListe.ListaInteri;

public class Principale {

	public static void main(String[] args) {
		//ListaInteri l = new ListaInteri();
		
		/*
		 * l.add(3); l.add(4); l.add(0);
		 * 
		 * System.out.println("testa: " + l.getTesta());
		 * System.out.println("conteggio: " + l.quanti());
		 * 
		 * l.stampaListaHard(); System.out.println(); System.out.println(l.toString());
		 * System.out.println(); System.out.println(l.toStringRec());
		 */
		
		
		
		int n = 2678;
		System.out.println(Palindromo.isPalindromo(n));
		System.out.println(Palindromo.sommaHard(n));
		
		String str = "123 ciao 2.2 4 5";
		Scanner s = new Scanner(str);
		
		int a = s.nextInt();
		String b = s.next();
		float c = s.nextFloat();
		//int d = s.nextInt();
		System.out.print(a+b+c);
		
		s.close();
	}

}
