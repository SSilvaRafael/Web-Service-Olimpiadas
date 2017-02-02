package Pacote;

import com.mysql.jdbc.PreparedStatement;

public abstract class CRUD {
	protected static String query;
	protected  static PreparedStatement ps;
	
	public CRUD(){
		query = null;
		ps = null;
	}



}
