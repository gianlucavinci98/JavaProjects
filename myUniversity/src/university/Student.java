package university;

public class Student {
	private static final int MAX_CORSI = 50;
	
	private String nome, cognome;
	private int id;
	
	private Corso[] corsi;
	private int numCorsi;
	
	public Student(String nome, String cognome, int id)
	{
		this.nome=nome;
		this.cognome=cognome;
		this.id = id;
		corsi = new Corso[MAX_CORSI];
	}
	
	public int getID()
	{
		return this.id;
	}
	
	public String toString()
	{
		return nome + " " + cognome + " " + id;
	}
	
	public void addCorso(Corso c)
	{
		corsi[numCorsi]=c;
		numCorsi++;
	}
	
	public String getCorsi()
	{
		String ris = new String();
		for(int i=0; i<numCorsi; i++)
		{
			ris+=corsi[i].toString();
			ris+="\n";
		}
		return ris;
	}
}
