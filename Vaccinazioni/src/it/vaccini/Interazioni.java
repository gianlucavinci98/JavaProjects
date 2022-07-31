package it.vaccini;

public class Interazioni {

	public static void main(String[] args) {
		SistemaVaccinale sistema = new SistemaVaccinale();
		
		sistema.addCittadino("1", "gianluca", "vinci");
		sistema.addCittadino("2", "pippo", "boris");
		sistema.addCittadino("3", "pluto", "milone");
		sistema.addCittadino("4", "cane", "russo");
		sistema.addCittadino("5", "gatto", "verde");
		
		sistema.addCentro("lingotto", "via madama");
		sistema.addCentro("cto", "via carducci");
		
//		sistema.assegnaCentro("1", "lingotto");
//		sistema.assegnaCentro("2", "lingotto");
//		sistema.assegnaCentro("3", "lingotto");
//		sistema.assegnaCentro("4", "cto");
		
		sistema.assegnazioneAuto();
		
		System.out.println(sistema.getCittadini());
		
		System.out.println(sistema.cittadiniAssociati("lingotto"));
		System.out.println(sistema.cittadiniAssociati("cto"));
	}

}
