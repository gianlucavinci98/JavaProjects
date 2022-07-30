package it.vaccini;

public class SistemaVaccinale {
	private Cittadino[] cittadini;
	private CentroVaccinale[] centri;
	private int numCit;
	private int numCentri;
	
	private static final int NUM_MAX = 100;
	
	public SistemaVaccinale()
	{
		cittadini = new Cittadino[NUM_MAX];
		centri = new CentroVaccinale[NUM_MAX];
		numCit=0;
		numCentri=0;
	}
	
	public void addCittadino(String cf, String nome, String cognome, String indirizzo)
	{
		cittadini[numCit] = new Cittadino(cf, nome, cognome, indirizzo);
		numCit++;
	}
	
	public void addCentro(String nome, String indirizzo)
	{
		centri[numCentri]= new CentroVaccinale(nome, indirizzo);
		numCentri++;
	}
}
