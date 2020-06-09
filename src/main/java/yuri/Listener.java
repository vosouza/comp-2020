package yuri;

import java.util.LinkedHashMap;
import java.util.Stack;

import main.antlr4.YuriBaseListener;
import main.antlr4.YuriParser;
import yuri.model.Node;
import yuri.model.SymbolTable;

public class Listener extends YuriBaseListener {
	
	LinkedHashMap<String, SymbolTable> st = new LinkedHashMap<>();
	
	// Pilha com nomes dos escopos
	Stack<String> scopeStack = new Stack<String>();
	
	@SuppressWarnings("rawtypes")
	// Pilha com nos
    Stack<Node> nodeStack = new Stack<Node>();
	
	public Listener() {
		
	}
	
	@Override public void enterInclude(YuriParser.IncludeContext ctx) {
		
	}
	
	@Override public void enterProgramName(YuriParser.ProgramNameContext ctx) {
		
	}
	
}
