package myListe;

public class ListaInteri {
	
	private Nodo testa;
	private int cont;
	
	
	
	public ListaInteri() {
		this.testa=null;
		this.cont=0;
	}

	public void add(int i)
	{
		testa = new Nodo(i, this.testa);
		cont++;
	}
	
	public int getTesta()
	{
		return testa.getValore();
	}
	
	public int quanti()
	{
		return cont;
	}
	
	public void stampaListaEasy()
	{
		for (int i=0; i<cont; i++)
		{
			
		}
	}
	
	public void stampaListaHard()
	{
		Nodo temp = testa;
		while (temp!=null)
		{
			System.out.print(temp.getValore() + " ");
			temp=temp.getNext();
		}
	}
	
	public String toString()
	{
		String res = "[ ";
		Nodo temp = testa;
		
		while (temp!=null)
		{
			res += temp.getValore() + " ";
			temp=temp.getNext();
		}
		
		return res+= "]";
	}
	
	public String toStringRec()
	{
		return testa.toString();
	}
}
