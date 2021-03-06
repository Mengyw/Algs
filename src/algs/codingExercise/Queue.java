package algs.codingExercise;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item>{
	private int N;
	private Node first;
	private Node last;
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
	public void enqueue(Item item){
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty()) first = last;
		else oldlast.next = last;
		N++;
	}
	public Item dequeue(){
		Item item = first.item;
//		Node oldfirst = first;
//		first = null;
		first = first.next;
		if(isEmpty()) last = null;
		N--;
		return item;
	}
	//必须实现接口Iterable<T>的抽象方法iterator(),这个方法返回一个泛型类型的迭代器。
	public Iterator<Item> iterator(){
		return new ListIterator();
	}
	private class ListIterator implements Iterator<Item>{
		private Node current = first;
		public boolean hasNext(){
			return current != null;
		}
		public void remove(){}
		public Item next(){
			Item item = current.item;
			current = current.next;
			return item;
		}
	}
}
