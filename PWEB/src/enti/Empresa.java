package enti;

public class Empresa {
	
	private String email;
	private String endereco;
	private String proprietario;
	private int CNPJ;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws Exception {
		if(email !=null && email.indexOf(0)!=' ')
			this.email = email;
		throw new Exception("Empresa : Email Invalido");
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) throws Exception {
		if(endereco !=null && endereco.indexOf(0)!=' ')
			this.endereco = endereco.toUpperCase();
		throw new Exception("Empresa : Endereco Invalido");
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) throws Exception {
		if(proprietario !=null && proprietario.indexOf(0)!=' ')
			this.proprietario = proprietario.toUpperCase();
		throw new Exception("Empresa : Proprietario Invalido");
	}
	public int getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
	
	
}
