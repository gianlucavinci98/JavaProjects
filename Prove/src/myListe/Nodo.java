package myListe;

class Nodo {
	private Nodo next;
	private int valore;

	public Nodo(int valore, Nodo nodo) {
		this.next = nodo;
		this.valore = valore;
	}

	public Nodo getNext() {
		return next;
	}

	public int getValore() {
		return valore;
	}
	
	public String toString()
	{
		String res = valore + " ";
		if (next!=null)
		{
			String prossimi = next.toString();
			return res+prossimi;
		}
		else return res + "";
	}
	
	
}
