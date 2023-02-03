package org.lessons.gestione.eventi;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Evento {
	private String titolo;
	private LocalDate data;
	private final DateTimeFormatter formattatore = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private int numeroPosti;
	private int numeroPostiPrenotati;
	
	
	public Evento(String titolo, String stringData, int numeroPosti, int numeroPostiPrenotati) {
		if(numeroPostiPrenotati > 0 && numeroPosti > numeroPostiPrenotati) {
		this.titolo = titolo;
		try {
		this.data = controlloData(stringData);
		}catch(Exception e) {e.getMessage();}
		this.numeroPosti = numeroPosti;
		this.numeroPostiPrenotati = numeroPostiPrenotati;
		}
	}
	
	

	public LocalDate controlloData(String data) throws Exception {
		LocalDate dataLoc = LocalDate.parse(data,formattatore);
		if (dataLoc.isBefore(LocalDate.now())) {
			throw new Exception("La data non è valida!;");
		}
		return dataLoc;
	}
	
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(String data){
		try {
		this.data = controlloData(data);
		}catch(Exception e) {e.getMessage();}
	}
	
	public int getNumeroPosti() {
		return numeroPosti;
	}
	
	public int getNumeroPostiPrenotati() {
		return numeroPostiPrenotati;
	}
	

	
	public boolean prenota(int i) throws Exception{
		
		if(this.numeroPosti > this.numeroPostiPrenotati + i) {
			numeroPostiPrenotati = numeroPostiPrenotati + i;
			return true;
		}
		else
			throw new Exception("Il numero di posti per quest'evento è esaurito");
		
	}
	
	public boolean disdici(int i) throws Exception{
		if(this.numeroPostiPrenotati - i > 0) {
			numeroPostiPrenotati = numeroPostiPrenotati - i;
			return true;
		}
		else
			throw new Exception("Il numero di posti prenotati è zero");
	}

	@Override
	public String toString() {
		return "Numero posti prenotati: " +numeroPostiPrenotati+ 
				"\n Numero posti totati: " +numeroPosti+
				"\n Data evento: " +data+
				"\n Titolo: " +titolo;
	}
	
	
	public int postiDisponibili(int postiDisponibili, int postiPrenotati) {
		return postiDisponibili - postiPrenotati;
	}

	
	
}











