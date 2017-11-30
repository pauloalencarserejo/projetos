package enti;

import java.util.ArrayList;

public class Departamento {
	private int id;
	private String nome;
	private Funcionario gerente;
	private ArrayList<Funcionario> funcionario;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws Exception {
		if(nome !=null && nome.indexOf(0)!=' ')
			this.nome = nome.toUpperCase();
		throw new Exception("Departamento : Nome Invalido!!!!");
	}
	public Funcionario getGerente() {
		return gerente;
	}
	public void setGerente(Funcionario gerente) throws Exception {
		if(gerente !=null) {
			gerente.setCargo("gerente");
			this.gerente = gerente;
		}
		throw new Exception("Departamento : Gerente Invalido!!!!");
	}
	public ArrayList<Funcionario> getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(ArrayList<Funcionario> funcionario) {
		if(funcionario!=null)
			this.funcionario = funcionario;
	}
	
	
}
