package tests;

public class Stack<Item> {
	private Node first;
	private int N;
	private class Node{
		Item item;
		Node next;
	}
	//形参必须是泛型参数而不是节点，因为在这个APl里数据结构是隐藏的，我们只关心对自定义数据类型的处理。
	public void push(Item item){
		Node oldfirst = null;
		oldfirst = first;
		//因此在方法内要自己新建一个节点。
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	private Item pop(){
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	public boolean isEmptiy(){
		return N == 0;
	}
	public int size(){
		return N;
	}
}
