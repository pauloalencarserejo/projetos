package enti;

import java.util.ArrayList;

public class Categoria {
	
	private int codigo;
	private String nome;
	private ArrayList<Produto> produto;
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
	public ArrayList<Produto> getProduto() {
		return produto;
	}
	public void setProduto(ArrayList<Produto> produto) throws Exception {
		if(produto!=null)
			this.produto = produto;
		throw new Exception("Categoria : Produtos Invalido!!!!");
	}
	

}
