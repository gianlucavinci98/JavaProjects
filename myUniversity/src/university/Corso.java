package university;

public class Corso {
	private static final int MAX_STUD = 50;
	private String nome;
	private String docente;
	int code;
	
	private Student[] studenti;
	private int numStud;
	
	public Corso(String nome, String doc, int code)
	{
		this.nome=nome;
		this.docente = doc;
		this.code=code;
		studenti = new Student[MAX_STUD];
	}
	
	public String toString()
	{
		return code+","+nome+","+docente;
	}
	
	public int getCode()
	{
		return code;
	}
	
	public void addStud(Student s)
	{
		studenti[numStud]=s;
		numStud++;
	}
	
	public String getStudenti()
	{
		String ris = new String();
		for(int i=0; i<numStud; i++)
		{
			ris+=studenti[i].toString();
			ris+="\n";
		}
		return ris;
	}
}
