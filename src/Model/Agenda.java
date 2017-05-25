package Model;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Pessoa> agenda;
	private static Agenda instancAgenda = null;

	public Agenda() {
		agenda = new ArrayList<Pessoa>();
	}

	public static Agenda getInstance() {
		if (instancAgenda == null) {
			instancAgenda = new Agenda();
		}
		return instancAgenda;
	}

	public boolean cadastrar(Pessoa p) {
		return agenda.add(p);
	}

	public String buscaTelefone(String nome) {
		String telefone = "";
		for (int i = 0; i < agenda.size(); i++) {
			if (agenda.get(i).getNome().equals(nome)) {
				telefone = agenda.get(i).getTelefone();
			}
		}
		return telefone;
	}
	
	public String toString() {
		String saida = "";
		for (int i = 0; i < agenda.size(); i++) {
			saida = agenda.toString() + "\n";
		}
		return saida;
	}
}
