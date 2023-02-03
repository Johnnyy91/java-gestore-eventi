package org.lessons.gestione.eventi;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Inserisci un evento con Titolo, data, numero di posti e numero di posti prenotati");
		Scanner scanner1 = new Scanner(System.in);
		String titolo = scanner1.nextLine();
		String data = scanner1.nextLine();
		int numeroPosti = scanner1.nextInt();
		int numeroPostiPrenotati = scanner1.nextInt();
		Evento evento = new Evento(titolo, data, numeroPosti, numeroPostiPrenotati);
		System.out.println("L'evento inserito è: " +evento);
		
		System.out.println("Vuoi fare qualche prenotazione o qualche disdetta? y o n");
		String carattere = scanner1.next();
		switch(carattere) {
		case "y":
			System.out.println("Vuoi effettuare un prenotazioni o disdette? p o d");
			String caratterePrenDis = scanner1.next();
			if(caratterePrenDis.equals("p")) {
				System.out.println("Inserisci il numero di prenotazioni: ");
			int numeroPrenotazioni = scanner1.nextInt();
			evento.prenota(numeroPrenotazioni);
			}
			if(caratterePrenDis.equals("d")) {
				System.out.println("Inserisci il numero di disdette: ");
				int numeroDisdette = scanner1.nextInt();
				evento.disdici(numeroDisdette);
			}
			break;
		case "n":
			System.out.println("Arrivederci!");
			break;
		default:
			System.out.println("Attenzione, hai inserito un comando non valido");
			break;
		
		}
		
		System.out.println("L'evento corrente è: "+evento);
		System.out.println("Il numero di posti disponibili è: " +evento.postiDisponibili(evento.getNumeroPosti(), evento.getNumeroPostiPrenotati()));
		
		
	
	}
	

}




