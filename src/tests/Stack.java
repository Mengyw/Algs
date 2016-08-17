package tests;

public class Stack<Item> {
	private Node first;
	private int N;
	private class Node{
		Item item;
		Node next;
	}
	//�βα����Ƿ��Ͳ��������ǽڵ㣬��Ϊ�����APl�����ݽṹ�����صģ�����ֻ���Ķ��Զ����������͵Ĵ���
	public void push(Item item){
		Node oldfirst = null;
		oldfirst = first;
		//����ڷ�����Ҫ�Լ��½�һ���ڵ㡣
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
