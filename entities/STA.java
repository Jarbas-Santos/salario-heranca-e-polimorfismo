package entities;

public class STA extends Funcionario {
	
	protected int nivel;

	public STA(String nome, int nivel) {
		super(nome);
		this.nivel = nivel;
		this.maxDiarias = 1;
	}

	public int getNivel() {
		return nivel;
	}

	public int getSalario() {
		return super.getSalario() + 3000 + 300 * nivel;
	}

	public String toString() {
		return String.format("sta:%s:%d:%d", getNome(), getNivel(), getSalario());
	}
}