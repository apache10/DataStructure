import java.util.*;
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
		static Node head=null; 
		static Node nul=null;
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
			while(true){
				int i;
				System.out.println("\n-----------------------------");
				System.out.println("1--->to add a node ");
				System.out.println("2--->to delete a node ");
				System.out.println("3--->to add a node at nth position");
				System.out.println("4--->to delete a node at nth position");
				System.out.println("5--->to reverse linked list");
				System.out.println("6--->to search number in list");
				System.out.println("7--->to print list");
				System.out.println("0--->to close program");
				i=scanner.nextInt(); ;
				switch(i){
					case 1 :
						int nInt;
						System.out.print("Enter a node you want to add :");
						nInt = scanner.nextInt();
						Node n = new Node(nInt);
						addNode(n);
					break;
					case 2:
						int num;
						System.out.println("enter the node you want to delete :");
						num = scanner.nextInt();
						delNode(num,head);
					break;
					case 3:
					break;
					case 4:
					break;
					case 5:
					break;
					case 6:
					break;
					case 7:
						printLink();
					break;
					default:
						System.out.println("Clsoing the program");
					return ;
				}
			}
	}
	public static void printLink(){
		Node temp = head;
		while(temp!= null){
			System.out.print("--->"+temp.getVal()+"");
			temp = temp.getNext();
		}
	}

	public static void printRLink(Node curr){
		if(curr==null){
			return;
		}
		System.out.println(curr.getVal()+ "-->");
		printRLink(curr.getNext());
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
	public static void addNode(Node n){
		if(head==null){
			head=n;
		}
		else{
			n.setNext(head);
			head=n;
		}
	}
	public static void delNode(int n,Node curr){
		Node prev=null;
		while(curr!=null){
			if(curr.getVal()==n){
				if(curr==head){
					head=head.getNext();
				}
				else if(curr.getNext()==null){
					curr=null;
					prev.setNext(null);
					return;
				}
				else{
					prev.setNext(curr.getNext());
				}
			}
			prev=curr;
			curr=curr.getNext();
		}
	}
}