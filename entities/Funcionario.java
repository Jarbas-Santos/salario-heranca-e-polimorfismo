package entities;

public abstract class Funcionario {
	
	protected String nome;
	protected int bonus;
	protected int diarias;
	protected int maxDiarias;

	public Funcionario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	// se não atingiu o máximo, adicione mais uma diária
	// se atingiu o máximo, lance uma MsgException
	public void addDiaria() {
		if(diarias < maxDiarias) {
			diarias = diarias + 1;
		}
		else {
			System.out.println("fail: limite de diarias atingido");
		}
	}

	// retorna bonus + diarias * 100
	public int getSalario() {
		return bonus + diarias * 100;
	}
}