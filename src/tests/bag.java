package tests;

import java.util.Iterator;

public class bag<Item> implements Iterable<Item> {
	private Node first = null;
	private int N;
	private class Node{
		Item item;
		Node next;
	}
	public int size(){
		return N;
	}
	public boolean isEmpty(){
		return N == 0;
	}
	public void add(Item item){
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	} 
	
	public Iterator<Item> iterator(){
		return new ListIterator();
	}
	private class ListIterator implements Iterator<Item>{
		Node current;
		public void remove(){}
		public boolean hasNext(){
			return current != null; 
		}
		public Item next(){
			current = current.next;
			return current.item;
		}
	}
}
