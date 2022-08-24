package example;

public class Palindromo {
	public static int somma(int num)
	{
		String s = String.valueOf(num);
		int sum=0;
		
		for (int i=0; i<s.length(); i++)
		{
			sum += Character.getNumericValue(s.charAt(i));
		}
		System.out.println(sum);
		
		return sum;
	}
	
	public static int isPalindromo(int num)
	{
		int sum = Palindromo.sommaHard(num);
		String s = String.valueOf(sum);
		int i =0;
		int j=s.length()-1;
		
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j)) return 0;
			i++;
			j--;
		}
		
		return 1;
	}
	
	public static int sommaHard(int num)
	{
		int divisore = 10;
		int ris=num%divisore;
		int somma = 0;
		do
		{
			somma+=ris;
			num = num - (ris*divisore/10);
			divisore*=10;
			ris = num % divisore;
			ris = ris / (divisore/10);
		}
		while(ris>0);
		
		return somma;
	}
	
	void funzioneProva(int a, int b)
	{
		a+=2;
		b+=2;
	}
	
}
