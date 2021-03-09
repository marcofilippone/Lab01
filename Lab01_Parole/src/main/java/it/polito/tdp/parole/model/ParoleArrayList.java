package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParoleArrayList {
	
	List<String> lista;
	
	public ParoleArrayList() {
		lista = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		lista.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(lista);
		return lista;
	}
	
	public void reset() {
		lista.removeAll(lista);
	}
	
	public void remove(String p) {
		lista.remove(p);
	}


}
