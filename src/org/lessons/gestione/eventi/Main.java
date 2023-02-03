package org.lessons.gestione.eventi;

public class Main {

	public static void main(String[] args) throws Exception {
		Evento evento1 = new Evento("Batman", "03/02/2025", 48, 89);
		evento1.disdici();
		System.out.println(evento1);
	}

}
