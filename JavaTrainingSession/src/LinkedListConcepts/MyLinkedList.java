package LinkedListConcepts;

public class MyLinkedList {
	
	Node head;
	
	//Inner class
	class Node{
		int data;
		Node next;
		
	public Node(int data) { //constructor
		this.data = data;
		next = null;
		}
	}
	
	public void printMyLinkedList() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next; //Will traverse if data presence, otherwise comes out of this loop
		}
	}

	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList(); //created an object
		Node first = ll.new Node(10); //first = 10
		ll.head = first;
		
		Node second = ll.new Node(20); //second = 20
		first.next = second;
		
		Node third = ll.new Node(30); //third = 30
		second.next = third;
		
		ll.printMyLinkedList();
	}
}