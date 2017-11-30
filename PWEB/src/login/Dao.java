package login;

import java.util.ArrayList;

public class Dao {
	
	public ArrayList<login> l;
	public Dao() {
		l=new ArrayList<login>();
		login e=new login();
		e.login="George";
		e.senha="eu";
		
		login r=new login();
		r.login="123";
		r.senha="123";
		
		login g=new login();
		g.login="kkkk";
		g.senha="321";
		
		l.add(e);
		l.add(r);
		l.add(g);
	}
	
}
