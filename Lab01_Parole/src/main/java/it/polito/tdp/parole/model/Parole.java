package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	List<String> lista;
		
	public Parole() {
		lista = new LinkedList<String>();
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
