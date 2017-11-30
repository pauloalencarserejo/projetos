package enti;

import java.util.ArrayList;

public class Oferta {
	
	private ArrayList<Double> preco;
	private Fornecedor fornecedor;
	
	public ArrayList<Double> getPreco() {
		return preco;
	}
	public void setPreco(ArrayList<Double> preco) {
		this.preco = preco;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public double precoTotal() throws Exception {
		if(this.preco!= null) {
			double total=0;
			for(int i=0;i<this.preco.size();i++) {
				total=total+this.preco.get(i);
			}
			if (total==0) 
					return total;
			throw new Exception("Sem preço da oferta");
		}
		throw new Exception("Sem preço da oferta");
			
	}

}
