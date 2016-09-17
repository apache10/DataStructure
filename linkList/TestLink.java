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
    void setVal(int v){
        val = v;
    }
}

class  LinkedList{

    private Node head;

    LinkedList(){
        head=null;
    }

    public void setHead(Node head){
        this.head=head;
    }

    public Node getHead(){
        return head;
    }
    public void printLink(){
        Node temp = head;
        while(temp!= null){
            System.out.print("--->"+temp.getVal()+"");
            temp = temp.getNext();
        }
    }

    public void printRLink(Node curr){
        if(curr==null){
            return;
        }
        System.out.print(curr.getVal()+ "-->");
        printRLink(curr.getNext());
    }
    public int countIndex(){
        Node temp = head;
        int count =0;
        while(temp!= null){
            count++;
            temp = temp.getNext();
        }
        return count;
    }
    /*public int[] printRLink2(Node curr){
        int index=0;
        int count = countIndex();
        int[] array = new int[count];
        if(curr==null){
            return;
        }
        printRLink2(curr.getNext());

        array[index] += curr.getVal();
        index++;
    }*/
    public void incermentValueByOne() {
        Node check = head;
        while (check != null) {
            int temp = check.getVal() + 1;
            check.setVal(temp);
            check = check.getNext();
        }
    }

    public void addAtN(Node n,int num){
        Node check = head ;
        while(num!= 0){
            if(check == null){
                System.out.println("no such position");
                return ;
            }
            check = check.getNext();
            num--;
        }
        Node tempNode=check.getNext();
        check.setNext(n);
        n.setNext(tempNode);
    }

    public boolean findANum(int num){
        Node check = head ;
        while(check != null){
            if(check.getVal() == num){
                return true;
            }
            check = check.getNext();
        }
        return false;
    }
    public void addNode(Node n){
        if(head==null){
            head=n;
        }
        else{
            n.setNext(head);
            head=n;
        }
    }
    public  void delNode(int n){
        Node curr=head;
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


class TestLink{
    public static void main(String[] arg){
        Node newNode=null;
        LinkedList ll=new LinkedList();
        Scanner scanner = new Scanner(System.in);
        while(true){
            int i;
            System.out.println("\n-----------------------------");
            System.out.println("1--->to add a node ");
            System.out.println("2--->to delete a node ");
            System.out.println("3--->to add a node at nth position");
            System.out.println("4--->to delete a node at nth position");
            System.out.println("5--->to print reverse linked list");
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
                    ll.addNode(n);
                    break;
                case 2:
                    int num;
                    System.out.println("enter the node you want to delete :");
                    num = scanner.nextInt();
                    ll.delNode(num);
                    break;
                case 3:
                    System.out.print("enter the position :");
                    int num2 = scanner.nextInt();
                    int nInt2;
                    System.out.print("Enter a node you want to add at nth position:");
                    nInt2 = scanner.nextInt();
                    Node n2 = new Node(nInt2);
                    ll.addAtN(n2,num2);
                    break;
                case 4:
                    break;
                case 5:
                    newNode=ll.getHead();
                    ll.printRLink(newNode);
                    break;
                case 6:
                    System.out.print("enter the position :");
                    int searchNum = scanner.nextInt();
                    ll.findANum(searchNum);
                    break;
                case 7:
                    ll.printLink();
                    break;
                default:
                    System.out.println("Closing the program");
                    return ;
            }
        }
    }
}