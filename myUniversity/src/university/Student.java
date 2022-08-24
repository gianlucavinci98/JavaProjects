package university;

public class Student {
	private String nome, cognome;
	private int id;
	
	public Student(String nome, String cognome, int id)
	{
		this.nome=nome;
		this.cognome=cognome;
		this.id = id;
	}
	
	public int getID()
	{
		return this.id;
	}
	
	public String toString()
	{
		return nome + " " + cognome + " " + id;
	}
}
