package yuri.model;

/*
 * Classe para entradas na SymbolTable
 */
public class Entry {
	String name;
	String type;
	String value;

	public Entry() {

	}

	public Entry(String name, String type, String value) {
		this.name = name;
		this.type = type;
		this.value = value;
	}
	
	public Entry(String name, String type) {
		this.name = name;
		this.type = type;
	}

}