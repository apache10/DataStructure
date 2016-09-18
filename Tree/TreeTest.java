import java.util.*;
class Node{
	int val;
	Node left;
	Node right;
	Node(int v){
		val=v;
		left=null;
		right=null;
	}
	int getVal(){
		return val;
	}
	Node getLeft(){
		return left;
	}
	Node getRight(){
		return right;
	}
	void setVal(int v){
		val=v;
	}
	void setRight(Node n){
		right=n;
	}
	void setLeft(Node n){
		left=n;
	}
}

class Tree{
	Node root;
	public Tree(){
		root=null;
	}
	
	public Node getRoot(){
		return root;
	}


	public void addNode(int n){
		System.out.println("adding...");
		Node newNode=new Node(n);
		if(root==null){
			root=newNode;
		}
		else{
			addNodeToTree(root,newNode);
		}
	}

	public void addNodeToTree(Node curr,Node newNode ){
		
		if(curr.getVal() > newNode.getVal()){
			if(curr.getLeft()==null)
				curr.setLeft(newNode);
			else
				addNodeToTree(curr.getLeft(),newNode);
		}
		else{
			if(curr.getRight()==null)
				curr.setRight(newNode);
			else
				addNodeToTree(curr.getRight(),newNode);
		}
	}
	public void searchNode(int num){
		Node searchNode = new Node(num);
		if(root.getVal()==searchNode.getVal()){
			System.out.println("found");
		}
		else{
			search(root,searchNode);
		}
		
	}
	public void search(Node curr,Node searchNode){
		if(curr.getVal() > searchNode.getVal()){
			if(curr.getLeft().getVal()==searchNode.getVal()){
				System.out.println("found");
			}
			else
				search(curr.getLeft(),searchNode);
		}
		else{
			if(curr.getRight().getVal()==searchNode.getVal()){
				System.out.println("found");
			}
			else
				search(curr.getRight(),searchNode);
		}
	}

	public void printTree(int type){
		if(type==1){
			printPreOrder(root);
		}
		else if(type==2){
			printInOrder(root);
		}
		else if (type == 3){
			printPostOrder(root);
		}
		else
			System.out.println("invalid input please enter 1, 2 or 3");
	}

	public void printPreOrder(Node curr){
		if(curr==null){
			return;
		}
		System.out.println("" + curr.getVal());
		printPreOrder(curr.getLeft());
		printPreOrder(curr.getRight());
	}

	public void printInOrder(Node curr){
		if(curr==null){
			return;
		}
		printInOrder(curr.getLeft());
		System.out.println("" + curr.getVal());
		printInOrder(curr.getRight());
	}

	public void printPostOrder(Node curr){
		if(curr==null){
			return;
		}
		printPostOrder(curr.getLeft());
		printPostOrder(curr.getRight());
		System.out.println("" + curr.getVal());
	}
}

class TreeTest {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		Tree obj = new Tree();
		while(true){
            int i;
            System.out.println("\n-----------------------------");
            System.out.println("1--->to add a node ");
            System.out.println("2--->to print tree");
            System.out.println("3--->to search number in tree");
            System.out.println("0--->to close ");
        	i=scanner.nextInt(); ;
            switch(i){
                case 1 :
                    int num1;
       				System.out.print("Enter a branch you want to add :");
        			num1 = scanner.nextInt();
        			obj.addNode(num1);
                    break;
                case 2:
                    int num2;
                    System.out.println("enter 1 for preorder");
                    System.out.println("enter 2 for inorder");
                    System.out.println("enter 3 for postorder");
                    num2 = scanner.nextInt();
        			obj.printTree(num2);
                    break;
                case 3:
                	int num3;
       				System.out.print("Enter a number you want to search:");
        			num3 = scanner.nextInt();
        			obj.searchNode(num3);
                	break;  
                default:
                    System.out.println("Closing the program");
                    return ;
            }
        }
	}
}