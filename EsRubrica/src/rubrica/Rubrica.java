package rubrica;

import java.util.Map;
import java.util.TreeMap;

public class Rubrica {

	private Map<String,Voce> listaVoci = new TreeMap<String,Voce>();
	//
	//	
	public Map<String,Voce> getListaVoci() {
		return listaVoci;
	}
			//Modifica definitiva
	public void setListaVoci(Map<String,Voce> listaVoci) {
		this.listaVoci = listaVoci;
	}
	
	public Voce addVoce(String nome, String cognome, String telefono) throws VoceEsistente {
		Voce voce = null;
		if (listaVoci.containsKey(nome+" "+cognome)){
			throw new VoceEsistente ("La voce già esiste!");
		} else {
			voce = new Voce(nome, cognome, telefono);
			listaVoci.put(nome + " " + cognome, voce);
		}
		
		return voce;
	}
}
