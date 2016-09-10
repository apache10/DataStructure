class Node{
	private int val;
	private Node next;
	public Node(int v){
		val=v;
		next=null;
	}
	int getVal(){
		return val;
	}
	Node getNext(){
		return next;
	}
	void setVal(int v){
		val=v;
	}
	void setNext(Node n){
		next=n;
	}
}


class LinkedList{
	public static void main(String args[]){
		Node Head=new Node(1);
		Node n=new Node(2);
		Head.setNext(n);
		n=new Node(3);
		Head.getNext().setNext(n);
		n=new Node(4);
		Head.getNext().getNext().setNext(n);
		Node curr=Head;
		while(curr!=null){
			System.out.print(""+ curr.getVal() +"->");
			curr=curr.getNext();
		}
	}	
}



