package yuri.model;

import java.util.LinkedHashMap;
import java.util.Map;

// Classe para lidar com escopos, como sugerido no Antlr4 reference
public class SymbolTable {
	Map<String, Entry> st = new LinkedHashMap<String, Entry>();
	String tableName;

	public SymbolTable(String tableName) {
		this.tableName = tableName;
	}
	public void insert(String key, Entry value) {
		st.put(key, value);
	}

	public boolean lookup(String key) {
		if (st.get(key) != null) {
			return true;
		}
		return false;
	}

}