package org.lessons.gestione.eventi;

import java.math.BigDecimal;
import java.time.LocalTime;


public class Concerto extends Evento{
	
	private LocalTime ora;
	
	private BigDecimal prezzo;
	
	
	public Concerto(String titolo, String stringData, int numeroPosti, int numeroPostiPrenotati, LocalTime ora,
			BigDecimal prezzo) {
		super(titolo, stringData, numeroPosti, numeroPostiPrenotati);
		this.ora = ora;
		this.prezzo = prezzo;
	}

	public LocalTime getOra() {
		return ora;
	}

	public void setOra(LocalTime ora) {
		this.ora = ora;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}
	

}


/*
 * Creare una classe Concerto che estende Evento, che ha anche gli attributi :
● ora: LocalTime
● prezzo: BigDecimal
Aggiungere questi attributi nel costruttore e implementarne getter e setter
Aggiungere i metodi per restituire data e ora formattata e prezzo formattato (##,##€)
Fare l’ override del metodo toString() in modo che venga restituita una stringa del tipo:
data e ora formattata - titolo - prezzo formattato

 * */