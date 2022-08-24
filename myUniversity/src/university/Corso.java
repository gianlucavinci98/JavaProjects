package university;

public class Corso {
	private String nome;
	private String docente;
	int code;
	
	public Corso(String nome, String doc, int code)
	{
		this.nome=nome;
		this.docente = doc;
		this.code=code;
	}
	
	public String toString()
	{
		return code+","+nome+","+docente;
	}
	
	public int getCode()
	{
		return code;
	}
}
