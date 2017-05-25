package Model;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private String telefone;

	public Pessoa(String nome, String telefone) {
		if (nome == null) {
			throw new IllegalArgumentException();
		} else {
			this.nome = nome;
		}
		if (telefone == null) {
			throw new IllegalArgumentException();
		} else {
			this.telefone = telefone;
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "" + getNome() + "    " + getTelefone()+"\n";
	}

	@Override
	public int compareTo(Pessoa p) {
		int valor = nome.compareTo(p.nome);
		return (valor != 0 ? valor : 1);
	}

}
