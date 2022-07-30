package it.vaccini;

public class Cittadino {
	private String cf, nome, cognome;
	private CentroVaccinale centro;

	
	public Cittadino(String cf, String nome, String cognome) {
		this.cf = cf;
		this.nome = nome;
		this.cognome = cognome;
		this.centro = null;
	}
	
	public void setCentro(CentroVaccinale ctr)
	{
		this.centro=ctr;
	}
	
	public String getCF()
	{
		return this.cf;
	}
	
	public String toString()
	{
		if (centro==null) return "[" + cf + " - " + nome + " " + cognome + " " + "[no centro]" + "]";
		else return "[" + cf + " - " + nome + " " + cognome + " " + centro.toString() + "]";
	}
	
	
}
