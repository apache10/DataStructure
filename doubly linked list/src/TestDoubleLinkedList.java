class Node {
    private int val;
    private Node next;
    private Node prev;
    Node(int v){
        val = v;
        next = null;
        prev = null;
    }
    Node getNext(){
        return next;
    }
    int getVal(){
        return val;
    }
    Node getPrev(){
        return prev;
    }
    void setNext(Node s){
        next = s;
    }
    void setVal(int v){
        val = v;
    }
    void setPrev(Node p){
        prev = p;
    }
}

class  DoublyLinkedList{

    private Node head;
    private Node tail;

    DoublyLinkedList(){
        head=null;
        tail = null;
    }

    public void setHead(Node head){
        this.head=head;
    }
    public Node getHead(){
        return head;
    }

    public void setTail(Node tail){
        this.tail=tail;
    }
    public Node getTail(){
        return tail;
    }


    public void addNode(Node n){
        if(head==null){
            head=n;
            tail =n;
        }
        else{
            head.setPrev(n);
            n.setNext(head);
            head=n;
        }
    }
    public void printLinkPrev(){
        Node tempt = tail;
        while(tempt!= null){
            System.out.print("--->"+tempt.getVal()+"");
            tempt = tempt.getPrev();
        }
    }
    public void printLink(){
        Node temp = head;
        while(temp!= null){
            System.out.print("--->"+temp.getVal()+"");
            temp = temp.getNext();
        }
    }
    public void printLinkR(Node temp){
        if(temp==null){
            return;
        }
        System.out.print("--->" + temp.getVal());
        printLinkR(temp.getNext());
    }
    public boolean findANum(int num){
        Node check = head ;
        while(check != null){
            if(check.getVal() == num){
                System.out.print("Node found");
                return true;
            }
            check = check.getNext();
        }
        return false;
    }
    public boolean findANumP(int num){
        Node check = tail;
        while(check != null){
            if(check.getVal() == num){
                System.out.print("Node found");
                return true;
            }
            check = check.getPrev();
        }
        return false;
    }

}


public class TestDoubleLinkedList {
    public static void main(String[] arg){
        DoublyLinkedList objDouble = new DoublyLinkedList();
        objDouble.addNode(new Node(5));
        objDouble.addNode(new Node(2));
        objDouble.addNode(new Node(3));
        objDouble.addNode(new Node(4));
        objDouble.printLink();
        System.out.print("\n");
        objDouble.printLinkPrev();
        System.out.print("\n");
        Node newNode=objDouble.getHead();
        objDouble.printLinkR(newNode);
        System.out.print("\n");
        objDouble.findANum(4);
        System.out.print("\n");
        objDouble.findANumP(2);
    }
}
