package entities;

public class Terceirizado extends Funcionario {
	
	protected int horas;
	protected Boolean isSalubre = false;

	public Terceirizado(String nome, int horas, String isSalubre) {
		super(nome);
		this.horas = horas;
		if(isSalubre.equals("sim")) {
			this.isSalubre = true;
		}		
	}

	public int getHoras() {
		return horas;
	}

	public String getIsSalubre() {
		if(isSalubre == true) {
			return "sim";
		}
		else {
			return "nao";
		}
	}

	public int getSalario() {
		if(isSalubre == true) {
			return super.getSalario() + (4 * getHoras() + 500);
		}
		else {
			return super.getSalario() + 4 * getHoras();
		}		
	}

	public void addDiaria() {
		System.out.println("fail: terc nao pode receber diaria");
	}

	public String toString() {
		return String.format("ter:%s:%d:%s:%d", this.getNome(), getHoras(), getIsSalubre()
				, getSalario());
	}
}