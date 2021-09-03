package quiz;

import java.util.HashMap;
import java.util.Iterator;

public class MyDB {
	private HashMap<String, String> table;
	
	public MyDB() {
		table = new HashMap<>();
		table.put("if", "if1234");
		table.put("else", "else1234");
		table.put("while", "while1234");
		table.put("for", "for1234");
		table.put("admin", "admin1234");
	}
	public int DBvalue(String id, String pw) {
		//Iterator<String> it = table.keySet().iterator();
		
		if(table.containsKey(id) && table.get(id).equals(pw)) {
			return 1;
		}else {
			return 0;
		}
	}
	
	
	
}
