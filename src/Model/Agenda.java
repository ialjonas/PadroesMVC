package Model;

import java.util.ArrayList;

public class Agenda {

	ArrayList<Pessoa> pessoa = new ArrayList<>();

	public Agenda() {

	}

	public boolean add(Pessoa p) {
		pessoa.add(p);
		return true;
	}

	public Pessoa buscarPessoaPorNome(String nome) {
		for (int i = 0; i < pessoa.size(); i++) {
			if (pessoa.get(i).getNome().equals(nome)) {
				return pessoa.get(i);
			}
		}
		return null;
	}

	public String toString() {
		return "";
	}
}
