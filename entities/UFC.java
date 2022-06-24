package entities;

import java.util.Map;
import java.util.TreeMap;

public class UFC {
	
	private Map<String, Funcionario> funcionarios = new TreeMap<>();
	
	public UFC() {
	}

	public Funcionario getFuncionario(String nome) {
		if(funcionarios.get(nome) == null) {
			System.out.println("fail: não existe um funcionário com este nome");
		}
		return funcionarios.get(nome); 
	}

	public void addFuncionario(Funcionario funcionario) {
		funcionarios.put(funcionario.getNome(), funcionario);
	}

	public void rmFuncionario(String nome) {
		boolean busca = funcionarios.containsKey(nome);
		if(busca == true) {
			funcionarios.remove(nome);
		}
		else {
			System.out.println("fail: funcionario inexistente");
		}
	}

	// reparte o bonus para todos os funcionarios
	public void setBonus(int bonus) {
		int valorParaDividir = bonus / funcionarios.size();
		for(String f : funcionarios.keySet()) {
			funcionarios.get(f).setBonus(valorParaDividir);
		}
	}
	
	public String toString() {
		String str = "";
		for(Funcionario f : funcionarios.values()) {
			str += f.toString() + "\n";
		}
		return str;
	}
}