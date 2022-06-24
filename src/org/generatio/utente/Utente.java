package org.generatio.utente;

public class Utente {
	String email, password;
	int eta;

	// verifica credenziali
	private void verificaMail() throws Exception {
		if (!(email.contains("@")) || !((email.contains(".")))) {
			throw new Exception("La mial deve contenera la @ ed un punto");
		}
	}

	private void verificaEta() throws Exception {
		if (eta < 18) {
			throw new Exception("L etá deve essere piú di 18");
		}
	}

	private void verificaPassword() throws Exception {
		if (password.length() < 8 && password.length() > 12) {
			throw new Exception("La password deve essere compresa tra 8 e 12");
		}
	}

	// costruttore
	public Utente(String email, String password, int eta) throws Exception {
		super();
		this.email = email;
		this.password = password;
		this.eta = eta;
	}

	// getter and setter
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

}
