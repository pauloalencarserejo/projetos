package enti;

public class Produto {
	
	private int codigo;
	private String nome;
	private Categoria categoria;
	private String descricao;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws Exception {
		if(nome !=null && nome.indexOf(0)!=' ')
			this.nome = nome.toUpperCase();
		throw new Exception("Categoria : Nome Invalido!!!!");
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
