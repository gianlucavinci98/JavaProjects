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
	
	public void addCittadino(String cf, String nome, String cognome)
	{
		cittadini[numCit] = new Cittadino(cf, nome, cognome);
		numCit++;
	}
	
	public void addCentro(String nome, String indirizzo)
	{
		centri[numCentri]= new CentroVaccinale(nome, indirizzo);
		numCentri++;
	}
	
	public int getNumCitRegistrati()
	{
		return numCit;
	}
	
	public StringBuffer getCittadini()
	{
		StringBuffer str = new StringBuffer();
		for(int i=0; i<numCit; i++)
		{
			str.append(cittadini[i].toString() + "\n");
		}
		str.append("Totale: " + getNumCitRegistrati());
		return str;
	}
	
	private Cittadino getCit(String cf)
	{
		int i = 0;
		
		while (i<numCit)
		{
			if (cittadini[i].getCF().equals(cf)) return cittadini[i];
			i++;
		}
		
		return null;
	}
	private CentroVaccinale getCentro(String nome)
	{
		int i = 0;
		
		while (i<numCentri)
		{
			if(centri[i].getNome().equals(nome)) return centri[i];
			i++;
		}
		
		return null;
	}
	public void assegnaCentro(String cf, String centro)
	{
		Cittadino cit = getCit(cf);
		CentroVaccinale ctr = getCentro(centro);
		
		if(cit!=null && ctr!=null)
		{
			cit.setCentro(ctr);
			ctr.addCittadino(cit);
		}
		else
		{
			System.out.println("Centro o persona non trovate");
		}
	}
	
	public String cittadiniAssociati(String centro)
	{
		return getCentro(centro).getListaCit();
	}
	
	
	private double calcolaDistanza(String ind1, String ind2)
	{
		return Math.random()*100;
	}
	public void assegnazioneAuto()
	{
		for (Cittadino c : cittadini)
		{
			if(c!=null && !c.isAssigned())
			{
				CentroVaccinale ctrNearest = null;
				double distMin = Double.MAX_VALUE;
				
				for (CentroVaccinale ctr : centri)
				{
					if (ctr!=null) {
						double d = calcolaDistanza(c.getIndirizzo(), ctr.getIndirizzo());
						if (d < distMin) {
							distMin = d;
							ctrNearest = ctr;
						} 
					}
				}
				
				c.setCentro(ctrNearest);
				ctrNearest.addCittadino(c);
			}
		}
	}
	
}
