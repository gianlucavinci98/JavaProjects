package it.vaccini;

public class CentroVaccinale {
	private String nome, indirizzo;
	private Cittadino[] listaCit;
	private int numCit;

	private static final int NUM_MAX=100;
	
	public CentroVaccinale(String nome, String indirizzo)
	{
		this.nome=nome;
		this.indirizzo=indirizzo;
		listaCit = new Cittadino[NUM_MAX];
		numCit=0;
	}
	
	public void addCittadino(Cittadino cit)
	{
		listaCit[numCit]=cit;
		numCit++;
	}
	
	public String getListaCit()
	{
		String str="";
		for(int i=0; i<numCit; i++)
		{
			str += listaCit[i].toString() + "\n";
		}
		return str;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String getIndirizzo()
	{
		return this.indirizzo;
	}
	
	public String toString()
	{
		return "[" + nome + " - " + indirizzo + "]";
	}
}
