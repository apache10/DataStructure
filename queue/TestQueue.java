import java.util.*;
class queue {
	int[] A;
	int front;
	int rear;
	int size;
	public queue(int s){
		size=s;
		A = new int[size];
		front = -1;
		rear = -1;

	}
	public boolean isEmpty(){
		if (front == -1 && rear == -1){
			System.out.println("Queue is empty ");
			return true;
		}
		return false;

	}
	public boolean isFull(){
		if(rear == size-1){
			System.out.println("Queue is full");
			return true;
		}
		else 
			return false;

	}
	public int enQueue(int x){
		boolean check = isFull();
		//boolean check2 = isEmpty();
		/*if(check2 == true){
			front = 0;
		}*/
		if(check != true){
			rear += 1;
			return A[rear] = x;
		}
		return 0;
	}
	public int deQueue(){
		boolean check = isEmpty();
		if(check != true){
			front += 1;
			return A[front];
		}
		return 0;

	}
	public void printQueue(){
		for(int i=front+1;i<rear+1;i++){
			System.out.print(A[i] + " -> ");
		}

	}
}

class TestQueue {
	public static void main(String[] arg){
		System.out.println("enter the size of Queue");

		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		queue q = new queue(size);

		while (true){
			System.out.println("1----> To Enqueue");
			System.out.println("2----> To Dequeue");
			System.out.println("3----> To check queue is empty");
			System.out.println("4----> To check queue is full");
			System.out.println("5----> To print all queue");
			System.out.println("0----> To Exit");
			int n=scanner.nextInt();
		switch(n){
				case 1:
					int p;
					System.out.println("Enter the number you want to Enqueue");
					p=scanner.nextInt();
					q.enQueue(p);
				break;

				case 2:
					System.out.println("Your Dequeue value is "+ q.deQueue() );
				break;

				case 3:
					q.isEmpty();
				break;

				case 4:
					q.isFull();
				break;

				case 5:
					q.printQueue();
				break;

				default:
					System.out.println("Clsoing the program");
					return ;

			}
		}
	}
}