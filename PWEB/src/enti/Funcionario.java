package enti;

public class Funcionario {
	private String nome;
	private String login;
	private String senha;
	private String cargo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws Exception {
		if(nome !=null && nome.indexOf(0)!=' ') {
			this.nome = nome.toUpperCase();
		}
		throw new Exception("Funcionario : Nome Invalido!!!!");
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) throws Exception {
		if(login !=null && login.indexOf(0)!=' ') {
			this.login = login;
		}
		throw new Exception("Funcionario:Login Invalido!!!!");
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) throws Exception {
		if(senha !=null && senha.indexOf(0)!=' ') {
			this.senha = senha;
		}
		throw new Exception("Funcionario : Senha Invalido!!!!");
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) throws Exception {
		if(cargo !=null && cargo.indexOf(0)!=' ') {
			this.cargo = cargo.toUpperCase();
		}
		throw new Exception("Funcionario : Cargo Invalido!!!!");
	}
	
}
