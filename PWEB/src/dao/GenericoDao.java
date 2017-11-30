package dao;

import java.util.List;

public interface GenericoDao<Tipo> {
		
	public void save(Tipo entity);
	
	public void delete(int id);
	
	public Tipo busca(int id);
	
	public List<Tipo> busca();
	
	public List<Tipo> BuscaNome(String str);
	
	
}
