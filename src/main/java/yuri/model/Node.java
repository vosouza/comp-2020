package yuri.model;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {

	// Regra que criou esse no
	String callback;
	
	// Lista de nos crianca
	List<Node<T>> childrenList = new ArrayList<>();
	
	String data;
	Entry entry;

	public Node(String callback, String data) {
		this.callback = callback;
		this.data = data;
	}
	
	public void addChild(Node<T> child) {
	    this.childrenList.add(child);
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	public List<Node<T>> getChildrenList() {
		return childrenList;
	}

	public void setChildrenList(List<Node<T>> childrenList) {
		this.childrenList = childrenList;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Entry getIdPointer() {
		return entry;
	}

	public void setIdPointer(Entry entry) {
		this.entry = entry;
	}
	
	
	
}
