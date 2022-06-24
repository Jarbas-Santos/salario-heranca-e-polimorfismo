package entities;

public class Professor extends Funcionario {

	protected String classe;

	// inicializa classe e muda maxDiarias para 2
	public Professor(String nome, String classe) {
		super(nome);
		super.maxDiarias = 2;
		this.classe = classe;
	}

	public String getClasse() {
		return classe;
	}
	// lógica do salário do professor
	// usa o super.getSalario para pegar bonus e diarias

	public int getSalario() {
		int salarioBruto = 0;
		if(getClasse().equals("A")) {
			salarioBruto = 3000;
	    }
		else if(getClasse().equals("B")) {
			salarioBruto = 5000; 
		}
		else if(getClasse().equals("C")) {
			salarioBruto = 7000; 
		}
		else if(getClasse().equals("D")) {
			salarioBruto = 9000; 
		}
		else if(getClasse().equals("E")) {
			salarioBruto = 11000; 
		}
		else {
			System.out.println("Classe digitada errada, selecione (A, B, C, D ou E)");
			return 0;
		}
		return salarioBruto + super.getSalario();
	}
	
	public String toString() {
		return String.format("prof:%s:%s:%d", getNome(), getClasse(), getSalario());
	}
}