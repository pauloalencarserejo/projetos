package enti;

public class Fornecedor {
	
	private String nome;
	private String email;
	private int cnpj;
	private String contato;
	private String login;
	private String Senha;
	private String anexo;
	private Categoria categoria;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws Exception {
		if(nome !=null && nome.indexOf(0)!=' ')
			this.nome = nome.toUpperCase();
		throw new Exception("Fornecedor : Nome Invalido!!!!");
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws Exception {
		if(email !=null && email.indexOf(0)!=' ')
			this.email = email;
		throw new Exception("Fornecedor : Email Invalido!!!!");
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) throws Exception {
		if(contato !=null && contato.indexOf(0)!=' ')
			this.contato = contato;
		throw new Exception("Fornecedor : Contato Invalido!!!!");
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) throws Exception {
		if(login !=null && login.indexOf(0)!=' ')
			this.login = login;
		throw new Exception("Fornecedor : Login Invalido!!!!");
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) throws Exception {
		if(senha !=null && senha.indexOf(0)!=' ')
			Senha = senha;
		throw new Exception("Fornecedor : Senha Invalido!!!!");
	}
	public String getAnexo() {
		return anexo;
	}
	public void setAnexo(String anexo) throws Exception {
		if(anexo !=null && anexo.indexOf(0)!=' ')
			this.anexo = anexo;
		throw new Exception("Fornecedor : Anexo Invalido!!!!");
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) throws Exception {
		if (categoria != null)
			this.categoria = categoria;
		throw new Exception("Fornecedor : Categoria Invalido!!!!");
	}
	
	

}
