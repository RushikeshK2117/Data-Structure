package com.rushikeshk.ds;

public class Node<T> {

	private Node<T> next;
	private Node<T> prev;
	private T data;
	
	public Node(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public Node<T> getPrev() {
		return prev;
	}
	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	
}
