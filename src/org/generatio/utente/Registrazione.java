package org.generatio.utente;

import java.util.Scanner;

public class Registrazione {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Inserisci emial:");
			String email = scan.nextLine();
			System.out.println("Inserisci password:");
			String password = scan.nextLine();
			System.out.println("Inserisci etá:");
			int eta = Integer.parseInt(scan.nextLine());
			Utente nuovoUtente = new Utente(email, eta, password);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		} finally {
			System.out.println("Arrivederci");
		}
		scan.close();
	}
}
