package enti;

import java.util.ArrayList;

public class Leilao {
	
	private ArrayList<Oferta> ofertas;
	private Pedido pedido;
	private boolean isAtivo;
	
	public Leilao() {
		isAtivo=true;
	}
	
	public ArrayList<Oferta> getOfertas() {
		return ofertas;
	}
	public void setOfertas(ArrayList<Oferta> ofertas) {
		this.ofertas = ofertas;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public boolean isAtivo() {
		return isAtivo;
	}	
	public void finalizar() {
		this.isAtivo=false;
	}
	public void menorOferta(){}//fazer depois

}
