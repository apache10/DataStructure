import java.util.*;
class TestStack {
    int[] A;
    int top;
    int size;
    public TestStack(int s){
        size=s;
        A = new int[size];
        top = -1;
        //System.out.println("stack has been created");
    }

    public void pushStack(int x){
        boolean check =isFull();
        if(check != true){
            A[++top]=x;

        }
    }


    public  int popStack(){
        boolean check =isEmpty();
        if(check != true){
            top -= 1;
            return A[top+1];

        }
        return -1;
    }
    public  boolean isEmpty(){
        if(top == -1){
            System.out.println("stack is empty ");
            return true;
        }
        return false;
    }
    public  boolean isFull(){
        if(top == size-1){
            System.out.println("stack is full");
            return true;
        }
        return false;

    }



    public  void printStack(){
        for(int i=0;i<top+1;i++){
            System.out.print(A[i] + " -> ");
        }
        System.out.println();
    }
}



class stack {
    public static void main(String[] arg){
        System.out.println("enter the size of stack");

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        TestStack s = new TestStack(size);


        while (true){
            System.out.println("1----> To push into stack");
            System.out.println("2----> To pop from stack");
            System.out.println("3----> To check full stack");
            System.out.println("4----> To check empty stack");
            System.out.println("5----> To print all stack");
            System.out.println("0----> To Exit");
            int n=scanner.nextInt();
            switch(n){
                case 1:
                    int p;
                    if(s.isFull() == false) {
                        System.out.println("Enter the number you want to push");
                        p = scanner.nextInt();
                        s.pushStack(p);
                    }
                    break;

                case 2:
                    //s.isEmpty();
                    if(s.isEmpty() == false) {
                        System.out.println("Your poped value is " + s.popStack());
                    }
                    break;

                case 3:
                    if(s.isFull() == false ){
                    System.out.println("is not full");
                    }
                    break;

                case 4:
                    if(s.isEmpty() == false){
                        System.out.println("is not empty");
                    }
                    break;

                case 5:
                    s.printStack();
                    break;

                default:
                    System.out.println("Clsoing the program");
                    return ;

            }
        }

    }
}