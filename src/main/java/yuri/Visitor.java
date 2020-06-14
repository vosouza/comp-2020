package yuri;

import java.util.LinkedHashMap;
import java.util.Stack;

import main.antlr4.YuriBaseVisitor;
import main.antlr4.YuriParser;
import yuri.model.Node;
import yuri.model.SymbolTable;

public class Visitor<T> extends YuriBaseVisitor<T> {
	
	LinkedHashMap<String, SymbolTable> st = new LinkedHashMap<>();
	
	// Pilha com nomes dos escopos
	Stack<String> scopeStack = new Stack<String>();
	
	@SuppressWarnings("rawtypes")
	// Pilha com nos
    Stack<Node> nodeStack = new Stack<Node>();
	
	
}
