class Node {
	private int val;
	private Node next;
	Node(int v){
		val = v;
		next = null;

	}
	Node getNext(){
		return next;
	}
	int getVal(){
		return val;
	}
	void setNext(Node s){
		next = s;
	}
	void setval(int v){
		val = v;
	}

}
class TestLink{
		static Node head; 
		static Node nul;
	public static void main(String[] arg){
		head = new Node(1);
		nul = new Node(2);
		
		head.setNext(nul);
		nul = new Node(3);
		head.getNext().setNext(nul);
		nul = new Node(4);
		head.getNext().getNext().setNext(nul);
		nul = new Node(5);
		nul.setNext(head);
		head = nul;
		//head.getNext().getNext().getNext().setNext(nul);
		printLink();

		
		
	}
	public static void printLink(){
		Node temp = head;
		while(temp!= null){
			System.out.print("--->"+temp.getVal()+"");
			temp = temp.getNext();
		}
		System.out.println("\n"+"number check");
		boolean check = findANum(6);
		if(check == true){
		System.out.print("number found");
		}
		else
			System.out.println("not found");
	}
	public static boolean findANum(int num){
		Node check = head ;
		while(check != null){
			if(check.getVal() == num){
				return true;
				
			}
			check = check.getNext();
			
		}
		return false;

	}
}